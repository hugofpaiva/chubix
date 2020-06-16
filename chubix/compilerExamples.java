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


        public static double v52 (double v53, double v54){
            double v58 = v53;
            double v60 = v54;
            int v61 = 2;
            double v59 = Math.pow(v60, v61);
            double v57 = v58/v59;
            double v55 = v57;
            double v62 = v55;
            return v62;
        }

    public static void main(String[] args){
        int v67 = 5;
        double v66 = v67/1.0;
        int v65 = (int)v66;
        int v63 = v65;
        int v72 = 5;
        double v71 = v72/1.0;
        double v70 = (double)v71;
        double v68 = v70;
        int v77 = 5;
        double v76 = v77/1.0;
        double v75 = (double)v76;
        double v73 = v75;
        int v82 = 5;
        double v81 = v82/1.0;
        double v80 = (double)v81;
        double v78 = v80;
        double v86 = v78;
        double v87 = v68;
        double v85 = v86/v87;
        double v83 = v85;
        double v94 = v73;
        int v95 = v63;
        double v93 = v94*v95;
        double v98 = v83;
        int v100 = v63;
        int v101 = 2;
        double v99 = Math.pow(v100, v101);
        double v97 = v98*v99;
        int v102 = 2;
        double v96 = v97/v102;
        double v92 = v93+v96;
        double v91 = v92/1.0;
        double v90 = (double)v91;
        double v88 = v90;
        String v103 = "Distancia percorrida: ";
        System.out.println(v103);
        double v104 = v88;
        System.out.println(v104+" [m]");
        System.out.println("Insira a tensão de corrente em volts");
        double v109 = sc.nextDouble();
        double v108 = v109/1.0;
        double v107 = (double)v108;
        double v105 = v107;
        System.out.println("Insira a intensidade da força, em Newton");
        double v114 = sc.nextDouble();
        double v113 = v114/1.0;
        double v112 = (double)v113;
        double v110 = v112;
        int v118 = 1;
        int v119 = 2;
        int v117 = v118/v119;
        double v115 = v117;
        double v123 = v105;
        double v124 = v110;
        double v122 = v123/v124;
        double v120 = v122;
        while (true) {
            double v126 = v115;
            double v128 = 1.0;
            double v129 = 32.0;
            double v127 = v128/v129;
            boolean v125 = v126>=v127;
            if (!v125){
                break;
            }
            String v130 = "Taxa: ";
            System.out.println(v130);
            double v137 = v105;
            double v138 = v115;
            double v136 = v137/v138;
            double v140 = v120;
            int v142 = 1;
            int v141 = 0-v142;
            double v139 = Math.pow(v140, v141);
            double v135 = v136*v139;
            double v134 = v135/1.0;
            double v133 = (double)v134;
            double v131 = v133;
            double v143 = v115;
            System.out.println(v143);
            String v144 = "Nova Resistência: ";
            System.out.println(v144);
            double v145 = v131;
            System.out.println(v145+" [O]");
            double v147 = v115;
            int v148 = 2;
            double v146 = v147/v148;
             v115 = v146;
        }
        System.out.println("Insira a potência: ");
        double v153 = sc.nextDouble();
        double v152 = v153/1.0;
        double v151 = (double)v152;
        double v149 = v151;
        System.out.println("Insira o tempo da duração de 1 banho: ");
        int v158 = sc.nextInt();
        double v157 = v158/1.0;
        int v156 = (int)v157;
        int v154 = v156;
        double v164 = v149;
        int v165 = 8;
        double v163 = v164*v165;
        int v166 = v154;
        double v162 = v163*v166;
        int v167 = 30;
        double v161 = v162*v167;
        double v159 = v161;
        String v168 = "Energia consumida: ";
        System.out.println(v168);
        double v169 = v159;
        System.out.println(v169+" [( kg * m^2 ) / s^2]");
        System.out.println("Preço por kWh: ");
        double v174 = sc.nextDouble();
        double v173 = v174/1.0;
        double v172 = (double)v173;
        double v170 = v172;
        double v178 = v170;
        double v179 = v159;
        double v177 = v178*v179;
        double v175 = v177;
        double v181 = v175;
        int v184 = 30;
        double v183 = v184/1.0;
        double v182 = (double)v183;
        boolean v180 = v181<v182;
        if(v180){
            String v185 = "Não conseguem gastar menos de 30";
            System.out.println(v185);
        }else{ 
            String v186 = "Conseguem gastar menos de 30";
            System.out.println(v186);
        }
        System.out.println("Insira a massa do objeto em kg");
        double v191 = sc.nextDouble();
        double v190 = v191/1.0;
        double v189 = (double)v190;
        double v187 = v189;
        int v196 = 10;
        double v195 = v196/1.0;
        double v194 = (double)v195;
        double v192 = v194;
        int v201 = 0;
        double v200 = v201/1.0;
        double v199 = (double)v200;
        double v197 = v199;
        double v202;
        int v205 = 0;
        int v203 = v205;
        while (true) {
            int v207 = v203;
            int v208 = 60;
            boolean v206 = v207<=v208;
            if (!v206){
                break;
            }
            double v210 = v197;
            int v214 = v203;
            double v213 = v214/1.0;
            int v212 = (int)v213;
            double v215 = v192;
            double v211 = v212*v215;
            double v209 = v210+v211;
             v197 = v209;
            double v217 = v197;
            double v218 = v187;
            double v216 = v39(v217,v218);;
            double v219 = v216;
             v202 = v219;
            double v220 = v202;
            System.out.println(v220+" [( kg * m^2 ) / s^2]");
            int v222 = v203;
            int v223 = 10;
            int v221 = v222+v223;
             v203 = v221;
        }
        int v228 = 5;
        double v227 = v228/1.0;
        double v226 = (double)v227;
        double v224 = v226;
        int v232 = 4;
        int v235 = 60;
        double v234 = v235/1.0;
        int v233 = (int)v234;
        int v231 = v232*v233;
        int v229 = v231;
        double v239 = v224;
        int v240 = v229;
        double v238 = v239*v240;
        double v236 = v238;
        double v241 = v236;
        System.out.println(v241+" [( s * V ) / O^1]");
        double v245 = v236;
        double v249 = 1.602;
        int v251 = 10;
        int v253 = 19;
        int v252 = 0-v253;
        double v250 = Math.pow(v251, v252);
        double v248 = v249*v250;
        double v247 = v248/1.0;
        double v246 = (double)v247;
        double v244 = v245/v246;
        double v242 = v244;
        double v254 = v242;
        System.out.println(v254);
        System.out.println("Insert your weight in kg: ");
        double v259 = sc.nextDouble();
        double v258 = v259/1.0;
        double v257 = (double)v258;
        double v255 = v257;
        System.out.println("Insert your height in meters: ");
        double v264 = sc.nextDouble();
        double v263 = v264/1.0;
        double v262 = (double)v263;
        double v260 = v262;
        double v268 = v68;
        double v269 = v260;
        double v267 = v52(v268,v269);;
        double v270 = v267;
        double v265 = v270;
        double v273 = v255;
        double v275 = v260;
        int v276 = 2;
        double v274 = Math.pow(v275, v276);
        double v272 = v273/v274;
        v1(v272);
    };
}