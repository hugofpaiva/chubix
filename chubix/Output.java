import java.util.Scanner;

public class Output {
    public static Scanner sc = new Scanner(System.in); 

     

        public static void evalIMC (double v1 ){
            double v3 = v1;
            int v4 = 16;
            boolean v2 = v3<v4;
            if(v2){
                String v5 = "You are severely underweight.";
                System.out.println(v5);
            }else{ 
                double v7 = v1;
                double v8 = 19.9;
                boolean v6 = v7<=v8;
                if(v6){
                    String v9 = "You are underweight.";
                    System.out.println(v9);
                }else{ 
                    double v11 = v1;
                    double v12 = 24.9;
                    boolean v10 = v11<=v12;
                    if(v10){
                        String v13 = "You have a healthy weight.";
                        System.out.println(v13);
                    }else{ 
                        double v15 = v1;
                        double v16 = 29.9;
                        boolean v14 = v15<=v16;
                        if(v14){
                            String v17 = "You are overweight.";
                            System.out.println(v17);
                        }else{ 
                            double v19 = v1;
                            double v20 = 39.9;
                            boolean v18 = v19<=v20;
                            if(v18){
                                String v21 = "You are obese.";
                                System.out.println(v21);
                            }else{ 
                                double v23 = v1;
                                int v24 = 40;
                                boolean v22 = v23>v24;
                                if(v22){
                                    String v25 = "You are morbidly obese.";
                                    System.out.println(v25);
                                }
                            }
                        }
                    }
                }
            }
            return;
        }



        public static  double CalcCinetica (double v26,double v27 ){
            int v28 = 1;
            System.out.println(v28);
            double v33 = 0.5;
            double v34 = v27;
            double v32 = v33*v34;
            double v36 = v26;
            int v37 = 2;
            double v35 = Math.pow(v36, v37);
            double v31 = v32*v35;
            double v29 = v31;
            return v29;
        }



        public static String Ola(String v38){
            String v39 = v38;
            System.out.println(v39);
            return v39;
        }



        public static double getIMC (double v40,double v41 ){
            double v45 = v40;
            double v47 = v41;
            int v48 = 2;
            double v46 = Math.pow(v47, v48);
            double v44 = v45/v46;
            double v42 = v44;
            return v42;
        }

    public static void main(String[] args){
        int v51 = 5;
        int v49 = v51;
        int v54 = 5;
        double v52 = v54;
        int v57 = 5;
        double v55 = v57;
        int v60 = 5;
        double v58 = v60;
        double v64 = v58;
        double v65 = v52;
        double v63 = v64/v65;
        double v61 = v63;
        int v68 = 2;
        int v66 = v68;
        int v72 = 2;
        int v73 = 1;
        int v71 = v72/v73;
        int v69 = v71;
        double v78 = v55;
        int v79 = v49;
        double v77 = v78*v79;
        double v82 = v61;
        int v84 = v49;
        int v85 = 2;
        double v83 = Math.pow(v84, v85);
        double v81 = v82*v83;
        int v86 = 2;
        double v80 = v81/v86;
        double v76 = v77+v80;
        double v74 = v76;
        int v87 = v69;
        System.out.println(v87);
        String v88 = "Distancia percorrida: ";
        System.out.println(v88);
        double v89 = v74;
        System.out.println(v89);
        String v92 = "Ola";
        String v90 = v92;
        String v95 = "Adeus";
        String v93 = v95;
        String v97 = v93;
        String v98 = v90;
        boolean v96 = v97.equals(v98);
        if(v96){
            String v99 = v90;
            System.out.println(v99);
        }
        System.out.println("Insira a tensão de corrente em volts");
        double v102 = sc.nextDouble();
        double v100 = v102;
        System.out.println("Insira a intensidade da força, em Newton");
        double v105 = sc.nextDouble();
        double v103 = v105;
        int v109 = 1;
        int v110 = 2;
        int v108 = v109/v110;
        double v106 = v108;
        double v114 = v100;
        double v115 = v103;
        double v113 = v114/v115;
        double v111 = v113;
        double v119 = v55;
        int v120 = v49;
        double v118 = v119*v120;
        double v116 = v118;
        double v121 = v116;
        System.out.println(v121);
        while (true) {
            double v123 = v106;
            double v125 = 1.0;
            double v126 = 32.0;
            double v124 = v125/v126;
            boolean v122 = v123>=v124;
            if (!v122){
                break;
            }
            String v127 = "Taxa: ";
            System.out.println(v127);
            double v132 = v100;
            double v133 = v106;
            double v131 = v132/v133;
            double v135 = v111;
            int v137 = 1;
            int v136 = 0-v137;
            double v134 = Math.pow(v135, v136);
            double v130 = v131*v134;
            double v128 = v130;
            double v138 = v106;
            System.out.println(v138);
            String v139 = "Nova Resistência: ";
            System.out.println(v139);
            double v140 = v128;
            System.out.println(v140);
            double v142 = v106;
            int v143 = 2;
            double v141 = v142/v143;
             v106 = v141;
        }
        System.out.println("Insira a potência: ");
        double v146 = sc.nextDouble();
        double v144 = v146;
        System.out.println("Insira o tempo da duração de 1 banho: ");
        int v149 = sc.nextInt();
        int v147 = v149;
        double v155 = v144;
        int v156 = 8;
        double v154 = v155*v156;
        int v157 = v147;
        double v153 = v154*v157;
        int v158 = 30;
        double v152 = v153*v158;
        double v150 = v152;
        String v159 = "Energia consumida: ";
        System.out.println(v159);
        double v160 = v150;
        System.out.println(v160);
        System.out.println("Preço por kWh: ");
        double v163 = sc.nextDouble();
        double v161 = v163;
        double v167 = v161;
        double v168 = v150;
        double v166 = v167*v168;
        double v164 = v166;
        double v170 = v164;
        int v171 = 30;
        boolean v169 = v170<v171;
        if(v169){
            String v172 = "Não conseguem gastar menos de 30";
            System.out.println(v172);
        }else{ 
            String v173 = "Conseguem gastar menos de 30";
            System.out.println(v173);
        }
        System.out.println("Insira a massa do objeto em kg");
        double v176 = sc.nextDouble();
        double v174 = v176;
        int v179 = 10;
        double v177 = v179;
        int v182 = 0;
        double v180 = v182;
        double v183;
        int v186 = 0;
        int v184 = v186;
        while (true) {
            int v188 = v184;
            int v189 = 60;
            boolean v187 = v188<=v189;
            if (!v187){
                break;
            }
            double v191 = v180;
            int v193 = v184;
            double v194 = v177;
            double v192 = v193*v194;
            double v190 = v191+v192;
             v180 = v190;
            int v195 = 1;
             v183 = v195;
            double v196 = v183;
            System.out.println(v196);
            int v198 = v184;
            int v199 = 10;
            int v197 = v198+v199;
             v184 = v197;
        }
        int v202 = 5;
        double v200 = v202;
        int v206 = 4;
        int v207 = 60;
        int v205 = v206*v207;
        int v203 = v205;
        double v211 = v200;
        int v212 = v203;
        double v210 = v211*v212;
        double v208 = v210;
        double v213 = v208;
        System.out.println(v213);
        double v217 = v208;
        double v219 = 1.602;
        int v221 = 10;
        int v223 = 19;
        int v222 = 0-v223;
        double v220 = Math.pow(v221, v222);
        double v218 = v219*v220;
        double v216 = v217/v218;
        double v214 = v216;
        double v224 = v214;
        System.out.println(v224);
        System.out.println("Insert your weight in kg: ");
        double v227 = sc.nextDouble();
        double v225 = v227;
        System.out.println("Insert your height in meters: ");
        double v230 = sc.nextDouble();
        double v228 = v230;
    };
}
