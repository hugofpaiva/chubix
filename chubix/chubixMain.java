import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import org.stringtemplate.v4.*;



public class chubixMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:
         CharStream input = null;
         try {
            input = CharStreams.fromStream(new FileInputStream(args[0]));
            if(!args[0].split("[.]")[args[0].split("[.]").length-1].equals("ubix")) {
              ErrorHandling.printError("Unrecognisable file extension! Use .ubix");
              System.exit(1);
            }
         } catch (Exception e) {
            ErrorHandling.printError("Couldn't find specified file \"" + args[0] + "\"");
            System.exit(1);
         }
         // create a lexer that feeds off of input CharStream:
         chubixLexer lexer = new chubixLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         chubixParser parser = new chubixParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at main rule:
         ParseTree tree = parser.main();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser))
            ErrorHandling eh = new ErrorHandling();
            //DimSemantic dim = new DimSemantic();
            //dim.visit(tree);
            SemanticChubix semantic = new SemanticChubix();
            semantic.visit(tree);
            if (ErrorHandling.error()){
              System.out.println("Erros: " + ErrorHandling.errorCount());
              System.exit(1);
            }
              
            ChubixComp compiler = new ChubixComp();
            ST code = compiler.visit(tree);
            
            String outputFileName = args[0].split("[.]")[args[0].split("[.]").length-2];
            outputFileName = outputFileName.split("/")[outputFileName.split("/").length-1];
            System.out.println(outputFileName);
            String outputFile = outputFileName + ".java";
            
            try {
               code.add("name", outputFileName);
               PrintWriter pw = new PrintWriter(new File(outputFile));
               pw.print(code.render());
               pw.close();
            } catch (FileNotFoundException e) {
               System.err.println("Failed to write code file");
               System.exit(1);
            }
         }
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
