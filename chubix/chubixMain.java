import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;

public class chubixMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(System.in);
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
            if (ErrorHandling.error())
              System.out.println("Erros: " + ErrorHandling.errorCount());
               
            ChubixComp compiler = new ChubixComp();
            ST res =compiler.visit(tree);
            System.out.println(res.render());
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
