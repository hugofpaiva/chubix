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
            int v42 = 1;
            System.out.println(v42);
            double v47 = 0.5;
            double v48 = v41;
            double v46 = v47*v48;
            double v50 = v40;
            int v51 = 2;
            double v49 = Math.pow(v50, v51);
            double v45 = v46*v49;
            double v43 = v45;
            double v52 = v43;
            return v52;
        }


        public static String v53 (String v54){
            String v55 = v54;
            System.out.println(v55);
            String v56 = v54;
            return v56;
        }


        public static double v57 (double v58, double v59){
            double v63 = v58;
            double v65 = v59;
            int v66 = 2;
            double v64 = Math.pow(v65, v66);
            double v62 = v63/v64;
            double v60 = v62;
            double v67 = v60;
            return v67;
        }

    public static void main(String[] args){
        int v72 = 5;
        double v71 = v72/1.0;
        int v70 = (int)v71;
        int v68 = v70;
        int v77 = 5;
        double v76 = v77/1.0;
        double v75 = (double)v76;
        double v73 = v75;
        int v82 = 5;
        double v81 = v82/1.0;
        double v80 = (double)v81;
        double v78 = v80;
        int v87 = 5;
        double v86 = v87/1.0;
        double v85 = (double)v86;
        double v83 = v85;
        double v91 = v83;
        double v92 = v73;
        double v90 = v91/v92;
        double v88 = v90;
        int v97 = 2;
        double v96 = v97/1.0;
        int v95 = (int)v96;
        int v93 = v95;
        int v105 = 2;
        double v104 = v105/2.777777777777778E-4;
        int v103 = (int)v104;
        int v108 = 1;
        double v107 = v108/1.0;
        int v106 = (int)v107;
        int v102 = v103/v106;
        double v101 = v102/1.0;
        int v100 = (int)v101;
        int v98 = v100;
        double v115 = v78;
        int v116 = v68;
        double v114 = v115*v116;
        double v119 = v88;
        int v121 = v68;
        int v122 = 2;
        double v120 = Math.pow(v121, v122);
        double v118 = v119*v120;
        int v123 = 2;
        double v117 = v118/v123;
        double v113 = v114+v117;
        double v112 = v113/1.0;
        double v111 = (double)v112;
        double v109 = v111;
        int v124 = v98;
        System.out.println(v124+" [s / c^1]");
        int v129 = 10;
        double v128 = v129/1.0;
        double v127 = (double)v128;
        double v126 = v127/1.0;
        double v125 = (double)v126;
         v109 = v125;
        String v130 = "Distancia percorrida: ";
        System.out.println(v130);
        double v133 = v109;
        double v132 = v133/1.0;
        double v131 = (double)v132;
        System.out.println(v131+" [m]");
        String v136 = "Ola";
        String v134 = v136;
        String v139 = "Adeus";
        String v137 = v139;
        String v141 = v137;
        String v142 = v134;
        boolean v140 = v141.equals(v142);
        if(v140){
            String v143 = v134;
            System.out.println(v143);
        }
        System.out.println("Insira a tensão de corrente em volts");
        double v148 = sc.nextDouble();
        double v147 = v148/1.0;
        double v146 = (double)v147;
        double v144 = v146;
        System.out.println("Insira a intensidade da força, em Newton");
        double v153 = sc.nextDouble();
        double v152 = v153/1.0;
        double v151 = (double)v152;
        double v149 = v151;
        int v157 = 1;
        int v158 = 2;
        int v156 = v157/v158;
        double v154 = v156;
        double v162 = v144;
        double v163 = v149;
        double v161 = v162/v163;
        double v159 = v161;
        double v167 = v78;
        int v168 = v68;
        double v166 = v167*v168;
        double v164 = v166;
        double v169 = v164;
        System.out.println(v169+" [m]");
        while (true) {
            double v171 = v154;
            double v173 = 1.0;
            double v174 = 32.0;
            double v172 = v173/v174;
            boolean v170 = v171>=v172;
            if (!v170){
                break;
            }
            String v175 = "Taxa: ";
            System.out.println(v175);
            double v182 = v144;
            double v183 = v154;
            double v181 = v182/v183;
            double v185 = v159;
            int v187 = 1;
            int v186 = 0-v187;
            double v184 = Math.pow(v185, v186);
            double v180 = v181*v184;
            double v179 = v180/1.0;
            double v178 = (double)v179;
            double v176 = v178;
            double v188 = v154;
            System.out.println(v188);
            String v189 = "Nova Resistência: ";
            System.out.println(v189);
            double v190 = v176;
            System.out.println(v190+" [O]");
            double v192 = v154;
            int v193 = 2;
            double v191 = v192/v193;
             v154 = v191;
        }
        System.out.println("Insira a potência: ");
        double v198 = sc.nextDouble();
        double v197 = v198/1.0;
        double v196 = (double)v197;
        double v194 = v196;
        System.out.println("Insira o tempo da duração de 1 banho: ");
        int v203 = sc.nextInt();
        double v202 = v203/1.0;
        int v201 = (int)v202;
        int v199 = v201;
        double v209 = v194;
        int v210 = 8;
        double v208 = v209*v210;
        int v211 = v199;
        double v207 = v208*v211;
        int v212 = 30;
        double v206 = v207*v212;
        double v204 = v206;
        String v213 = "Energia consumida: ";
        System.out.println(v213);
        double v214 = v204;
        System.out.println(v214+" [( kg * m^2 ) / s^2]");
        System.out.println("Preço por kWh: ");
        double v219 = sc.nextDouble();
        double v218 = v219/1.0;
        double v217 = (double)v218;
        double v215 = v217;
        double v223 = v215;
        double v224 = v204;
        double v222 = v223*v224;
        double v220 = v222;
        double v226 = v220;
        int v229 = 30;
        double v228 = v229/1.0;
        double v227 = (double)v228;
        boolean v225 = v226<v227;
        if(v225){
            String v230 = "Não conseguem gastar menos de 30";
            System.out.println(v230);
        }else{ 
            String v231 = "Conseguem gastar menos de 30";
            System.out.println(v231);
        }
        System.out.println("Insira a massa do objeto em kg");
        double v236 = sc.nextDouble();
        double v235 = v236/1.0;
        double v234 = (double)v235;
        double v232 = v234;
        int v241 = 10;
        double v240 = v241/1.0;
        double v239 = (double)v240;
        double v237 = v239;
        int v246 = 0;
        double v245 = v246/1.0;
        double v244 = (double)v245;
        double v242 = v244;
        double v247;
        int v250 = 0;
        int v248 = v250;
        while (true) {
            int v252 = v248;
            int v253 = 60;
            boolean v251 = v252<=v253;
            if (!v251){
                break;
            }
            double v255 = v242;
            int v259 = v248;
            double v258 = v259/1.0;
            int v257 = (int)v258;
            double v260 = v237;
            double v256 = v257*v260;
            double v254 = v255+v256;
             v242 = v254;
            int v263 = 1;
            double v262 = v263/1.0;
            double v261 = (double)v262;
             v247 = v261;
            double v264 = v247;
            System.out.println(v264+" [( kg * m^2 ) / s^2]");
            int v266 = v248;
            int v267 = 10;
            int v265 = v266+v267;
             v248 = v265;
        }
        int v272 = 5;
        double v271 = v272/1.0;
        double v270 = (double)v271;
        double v268 = v270;
        int v276 = 4;
        int v279 = 60;
        double v278 = v279/1.0;
        int v277 = (int)v278;
        int v275 = v276*v277;
        int v273 = v275;
        double v283 = v268;
        int v284 = v273;
        double v282 = v283*v284;
        double v280 = v282;
        double v285 = v280;
        System.out.println(v285+" [( s * V ) / O^1]");
        double v289 = v280;
        double v293 = 1.602;
        int v295 = 10;
        int v297 = 19;
        int v296 = 0-v297;
        double v294 = Math.pow(v295, v296);
        double v292 = v293*v294;
        double v291 = v292/1.0;
        double v290 = (double)v291;
        double v288 = v289/v290;
        double v286 = v288;
        double v298 = v286;
        System.out.println(v298);
        System.out.println("Insert your weight in kg: ");
        double v303 = sc.nextDouble();
        double v302 = v303/1.0;
        double v301 = (double)v302;
        double v299 = v301;
        System.out.println("Insert your height in meters: ");
        double v308 = sc.nextDouble();
        double v307 = v308/1.0;
        double v306 = (double)v307;
        double v304 = v306;
        double v311 = v73;
        double v312 = v304;
        v57(v311,v312);
        double v309;
        double v314 = v299;
        double v316 = v304;
        int v317 = 2;
        double v315 = Math.pow(v316, v317);
        double v313 = v314/v315;
        v1(v313);
    };
}