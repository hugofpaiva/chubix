import java.util.Scanner;

public class Output {
    public static Scanner sc = new Scanner(System.in); 

     
        public static void evalIMC (double v1){
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
            return ;
        }


        public static double CalcCinetica (double v26, double v27){
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
            double v38 = v29;
            return v38;
        }


        public static String Ola (String v39){
            String v40 = v39;
            System.out.println(v40);
            String v41 = v39;
            return v41;
        }


        public static double getIMC (double v42, double v43){
            double v47 = v42;
            double v49 = v43;
            int v50 = 2;
            double v48 = Math.pow(v49, v50);
            double v46 = v47/v48;
            double v44 = v46;
            double v51 = v44;
            return v51;
        }

    public static void main(String[] args){
        int v54 = 5;
        int v52 = v54;
        int v57 = 5;
        double v55 = v57;
        int v60 = 5;
        double v58 = v60;
        int v63 = 5;
        double v61 = v63;
        double v67 = v61;
        double v68 = v55;
        double v66 = v67/v68;
        double v64 = v66;
        int v71 = 2;
        int v69 = v71;
        int v75 = 2;
        int v76 = 1;
        int v74 = v75/v76;
        int v72 = v74;
        double v81 = v58;
        int v82 = v52;
        double v80 = v81*v82;
        double v85 = v64;
        int v87 = v52;
        int v88 = 2;
        double v86 = Math.pow(v87, v88);
        double v84 = v85*v86;
        int v89 = 2;
        double v83 = v84/v89;
        double v79 = v80+v83;
        double v77 = v79;
        int v90 = v72;
        System.out.println(v90);
        String v91 = "Distancia percorrida: ";
        System.out.println(v91);
        double v92 = v77;
        System.out.println(v92);
        String v95 = "Ola";
        String v93 = v95;
        String v98 = "Adeus";
        String v96 = v98;
        String v100 = v96;
        String v101 = v93;
        boolean v99 = v100.equals(v101);
        if(v99){
            String v102 = v93;
            System.out.println(v102);
        }
        System.out.println("Insira a tensão de corrente em volts");
        double v105 = sc.nextDouble();
        double v103 = v105;
        System.out.println("Insira a intensidade da força, em Newton");
        double v108 = sc.nextDouble();
        double v106 = v108;
        int v112 = 1;
        int v113 = 2;
        int v111 = v112/v113;
        double v109 = v111;
        double v117 = v103;
        double v118 = v106;
        double v116 = v117/v118;
        double v114 = v116;
        double v122 = v58;
        int v123 = v52;
        double v121 = v122*v123;
        double v119 = v121;
        double v124 = v119;
        System.out.println(v124);
        while (true) {
            double v126 = v109;
            double v128 = 1.0;
            double v129 = 32.0;
            double v127 = v128/v129;
            boolean v125 = v126>=v127;
            if (!v125){
                break;
            }
            String v130 = "Taxa: ";
            System.out.println(v130);
            double v135 = v103;
            double v136 = v109;
            double v134 = v135/v136;
            double v138 = v114;
            int v140 = 1;
            int v139 = 0-v140;
            double v137 = Math.pow(v138, v139);
            double v133 = v134*v137;
            double v131 = v133;
            double v141 = v109;
            System.out.println(v141);
            String v142 = "Nova Resistência: ";
            System.out.println(v142);
            double v143 = v131;
            System.out.println(v143);
            double v145 = v109;
            int v146 = 2;
            double v144 = v145/v146;
             v109 = v144;
        }
        System.out.println("Insira a potência: ");
        double v149 = sc.nextDouble();
        double v147 = v149;
        System.out.println("Insira o tempo da duração de 1 banho: ");
        int v152 = sc.nextInt();
        int v150 = v152;
        double v158 = v147;
        int v159 = 8;
        double v157 = v158*v159;
        int v160 = v150;
        double v156 = v157*v160;
        int v161 = 30;
        double v155 = v156*v161;
        double v153 = v155;
        String v162 = "Energia consumida: ";
        System.out.println(v162);
        double v163 = v153;
        System.out.println(v163);
        System.out.println("Preço por kWh: ");
        double v166 = sc.nextDouble();
        double v164 = v166;
        double v170 = v164;
        double v171 = v153;
        double v169 = v170*v171;
        double v167 = v169;
        double v173 = v167;
        int v174 = 30;
        boolean v172 = v173<v174;
        if(v172){
            String v175 = "Não conseguem gastar menos de 30";
            System.out.println(v175);
        }else{ 
            String v176 = "Conseguem gastar menos de 30";
            System.out.println(v176);
        }
        System.out.println("Insira a massa do objeto em kg");
        double v179 = sc.nextDouble();
        double v177 = v179;
        int v182 = 10;
        double v180 = v182;
        int v185 = 0;
        double v183 = v185;
        double v186;
        int v189 = 0;
        int v187 = v189;
        while (true) {
            int v191 = v187;
            int v192 = 60;
            boolean v190 = v191<=v192;
            if (!v190){
                break;
            }
            double v194 = v183;
            int v196 = v187;
            double v197 = v180;
            double v195 = v196*v197;
            double v193 = v194+v195;
             v183 = v193;
            int v198 = 1;
             v186 = v198;
            double v199 = v186;
            System.out.println(v199);
            int v201 = v187;
            int v202 = 10;
            int v200 = v201+v202;
             v187 = v200;
        }
        int v205 = 5;
        double v203 = v205;
        int v209 = 4;
        int v210 = 60;
        int v208 = v209*v210;
        int v206 = v208;
        double v214 = v203;
        int v215 = v206;
        double v213 = v214*v215;
        double v211 = v213;
        double v216 = v211;
        System.out.println(v216);
        double v220 = v211;
        double v222 = 1.602;
        int v224 = 10;
        int v226 = 19;
        int v225 = 0-v226;
        double v223 = Math.pow(v224, v225);
        double v221 = v222*v223;
        double v219 = v220/v221;
        double v217 = v219;
        double v227 = v217;
        System.out.println(v227);
        System.out.println("Insert your weight in kg: ");
        double v230 = sc.nextDouble();
        double v228 = v230;
        System.out.println("Insert your height in meters: ");
        double v233 = sc.nextDouble();
        double v231 = v233;
    };
}
