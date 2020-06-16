import java.util.Scanner;

public class compilerExamples {
    public static Scanner sc = new Scanner(System.in); 

     
        public static void v1 (double v2){
            double v4 = v2;
            int v7 = 16;
            double v6 = v7/1.0;
            double v5 = (double)v6;
            boolean v3 = v4<v5;
            if(v3){
                String v8 = "You are severely underweight.";
                System.out.println(v8);
            }else{ 
                double v10 = v2;
                double v13 = 19.9;
                double v12 = v13/1.0;
                double v11 = (double)v12;
                boolean v9 = v10<=v11;
                if(v9){
                    String v14 = "You are underweight.";
                    System.out.println(v14);
                }else{ 
                    double v16 = v2;
                    double v19 = 24.9;
                    double v18 = v19/1.0;
                    double v17 = (double)v18;
                    boolean v15 = v16<=v17;
                    if(v15){
                        String v20 = "You have a healthy weight.";
                        System.out.println(v20);
                    }else{ 
                        double v22 = v2;
                        double v25 = 29.9;
                        double v24 = v25/1.0;
                        double v23 = (double)v24;
                        boolean v21 = v22<=v23;
                        if(v21){
                            String v26 = "You are overweight.";
                            System.out.println(v26);
                        }else{ 
                            double v28 = v2;
                            double v31 = 39.9;
                            double v30 = v31/1.0;
                            double v29 = (double)v30;
                            boolean v27 = v28<=v29;
                            if(v27){
                                String v32 = "You are obese.";
                                System.out.println(v32);
                            }else{ 
                                double v34 = v2;
                                int v37 = 40;
                                double v36 = v37/1.0;
                                double v35 = (double)v36;
                                boolean v33 = v34>v35;
                                if(v33){
                                    String v38 = "You are morbidly obese.";
                                    System.out.println(v38);
                                }
                            }
                        }
                    }
                }
            }
            return ;
        }


        public static double v39 (double v40, double v41){
            double v46 = 0.5;
            double v47 = v41;
            double v45 = v46*v47;
            double v49 = v40;
            int v50 = 2;
            double v48 = Math.pow(v49, v50);
            double v44 = v45*v48;
            double v42 = v44;
            double v51 = v42;
            return v51;
        }


        public static String v52 (String v53){
            String v54 = v53;
            System.out.println(v54);
            String v55 = v53;
            return v55;
        }


        public static double v56 (double v57, double v58){
            double v62 = v57;
            double v64 = v58;
            int v65 = 2;
            double v63 = Math.pow(v64, v65);
            double v61 = v62/v63;
            double v59 = v61;
            double v66 = v59;
            return v66;
        }

    public static void main(String[] args){
        int v71 = 5;
        double v70 = v71/1.0;
        int v69 = (int)v70;
        int v67 = v69;
        int v76 = 5;
        double v75 = v76/1.0;
        double v74 = (double)v75;
        double v72 = v74;
        int v81 = 5;
        double v80 = v81/1.0;
        double v79 = (double)v80;
        double v77 = v79;
        int v86 = 5;
        double v85 = v86/1.0;
        double v84 = (double)v85;
        double v82 = v84;
        double v90 = v82;
        double v91 = v72;
        double v89 = v90/v91;
        double v87 = v89;
        int v96 = 2;
        double v95 = v96/1.0;
        int v94 = (int)v95;
        int v92 = v94;
        int v104 = 2;
        double v103 = v104/2.777777777777778E-4;
        int v102 = (int)v103;
        int v107 = 1;
        double v106 = v107/1.0;
        int v105 = (int)v106;
        int v101 = v102/v105;
        double v100 = v101/1.0;
        int v99 = (int)v100;
        int v97 = v99;
        double v114 = v77;
        int v115 = v67;
        double v113 = v114*v115;
        double v118 = v87;
        int v120 = v67;
        int v121 = 2;
        double v119 = Math.pow(v120, v121);
        double v117 = v118*v119;
        int v122 = 2;
        double v116 = v117/v122;
        double v112 = v113+v116;
        double v111 = v112/1.0;
        double v110 = (double)v111;
        double v108 = v110;
        int v123 = v97;
        System.out.println(v123+" [s / c^1]");
        int v128 = 10;
        double v127 = v128/1.0;
        double v126 = (double)v127;
        double v125 = v126/1.0;
        double v124 = (double)v125;
         v108 = v124;
        String v129 = "Distancia percorrida: ";
        System.out.println(v129);
        double v132 = v108;
        double v131 = v132/1.0;
        double v130 = (double)v131;
        System.out.println(v130+" [m]");
    };
}