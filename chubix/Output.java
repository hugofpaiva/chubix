
import java.util.Scanner;

public class Output {
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
        double v112 = v113/0.001;
        double v111 = (double)v112;
        double v109 = v111;
        int v124 = v98;
        System.out.println(v124+" [s / c^1]");
        String v125 = "Distancia percorrida: ";
        System.out.println(v125);
        double v126 = v109;
        System.out.println(v126+" [m]");
        String v129 = "Ola";
        String v127 = v129;
        String v132 = "Adeus";
        String v130 = v132;
        String v134 = v130;
        String v135 = v127;
        boolean v133 = v134.equals(v135);
        if(v133){
            String v136 = v127;
            System.out.println(v136);
        }
        System.out.println("Insira a tensão de corrente em volts");
        double v141 = sc.nextDouble();
        double v140 = v141/1.0;
        double v139 = (double)v140;
        double v137 = v139;
        System.out.println("Insira a intensidade da força, em Newton");
        double v146 = sc.nextDouble();
        double v145 = v146/1.0;
        double v144 = (double)v145;
        double v142 = v144;
        int v150 = 1;
        int v151 = 2;
        int v149 = v150/v151;
        double v147 = v149;
        double v155 = v137;
        double v156 = v142;
        double v154 = v155/v156;
        double v152 = v154;
        double v160 = v78;
        int v161 = v68;
        double v159 = v160*v161;
        double v157 = v159;
        double v162 = v157;
        System.out.println(v162+" [m]");
        while (true) {
            double v164 = v147;
            double v166 = 1.0;
            double v167 = 32.0;
            double v165 = v166/v167;
            boolean v163 = v164>=v165;
            if (!v163){
                break;
            }
            String v168 = "Taxa: ";
            System.out.println(v168);
            double v175 = v137;
            double v176 = v147;
            double v174 = v175/v176;
            double v178 = v152;
            int v180 = 1;
            int v179 = 0-v180;
            double v177 = Math.pow(v178, v179);
            double v173 = v174*v177;
            double v172 = v173/1.0;
            double v171 = (double)v172;
            double v169 = v171;
            double v181 = v147;
            System.out.println(v181);
            String v182 = "Nova Resistência: ";
            System.out.println(v182);
            double v183 = v169;
            System.out.println(v183+" [O]");
            double v185 = v147;
            int v186 = 2;
            double v184 = v185/v186;
             v147 = v184;
        }
        System.out.println("Insira a potência: ");
        double v191 = sc.nextDouble();
        double v190 = v191/0.001;
        double v189 = (double)v190;
        double v187 = v189;
        System.out.println("Insira o tempo da duração de 1 banho: ");
        int v196 = sc.nextInt();
        double v195 = v196/2.777777777777778E-4;
        int v194 = (int)v195;
        int v192 = v194;
        double v202 = v187;
        int v203 = 8;
        double v201 = v202*v203;
        int v204 = v192;
        double v200 = v201*v204;
        int v205 = 30;
        double v199 = v200*v205;
        double v197 = v199;
        String v206 = "Energia consumida: ";
        System.out.println(v206);
        double v207 = v197;
        System.out.println(v207+" [( kg * m^2 ) / s^2]");
        System.out.println("Preço por kWh: ");
        double v212 = sc.nextDouble();
        double v211 = v212/3600000.0000000005;
        double v210 = (double)v211;
        double v208 = v210;
        double v216 = v208;
        double v217 = v197;
        double v215 = v216*v217;
        double v213 = v215;
        double v219 = v213;
        int v222 = 30;
        double v221 = v222/1.0;
        double v220 = (double)v221;
        boolean v218 = v219<v220;
        if(v218){
            String v223 = "Não conseguem gastar menos de 30";
            System.out.println(v223);
        }else{ 
            String v224 = "Conseguem gastar menos de 30";
            System.out.println(v224);
        }
        System.out.println("Insira a massa do objeto em kg");
        double v229 = sc.nextDouble();
        double v228 = v229/1.0;
        double v227 = (double)v228;
        double v225 = v227;
        int v234 = 10;
        double v233 = v234/1.0;
        double v232 = (double)v233;
        double v230 = v232;
        int v239 = 0;
        double v238 = v239/1.0;
        double v237 = (double)v238;
        double v235 = v237;
        double v240;
        int v243 = 0;
        int v241 = v243;
        while (true) {
            int v245 = v241;
            int v246 = 60;
            boolean v244 = v245<=v246;
            if (!v244){
                break;
            }
            double v248 = v235;
            int v252 = v241;
            double v251 = v252/1.0;
            int v250 = (int)v251;
            double v253 = v230;
            double v249 = v250*v253;
            double v247 = v248+v249;
             v235 = v247;
            int v256 = 1;
            double v255 = v256/1.0;
            double v254 = (double)v255;
             v240 = v254;
            double v257 = v240;
            System.out.println(v257+" [( kg * m^2 ) / s^2]");
            int v259 = v241;
            int v260 = 10;
            int v258 = v259+v260;
             v241 = v258;
        }
        int v265 = 5;
        double v264 = v265/1.0;
        double v263 = (double)v264;
        double v261 = v263;
        int v269 = 4;
        int v272 = 60;
        double v271 = v272/1.0;
        int v270 = (int)v271;
        int v268 = v269*v270;
        int v266 = v268;
        double v276 = v261;
        int v277 = v266;
        double v275 = v276*v277;
        double v273 = v275;
        double v278 = v273;
        System.out.println(v278+" [( s * V ) / O^1]");
        double v282 = v273;
        double v286 = 1.602;
        int v288 = 10;
        int v290 = 19;
        int v289 = 0-v290;
        double v287 = Math.pow(v288, v289);
        double v285 = v286*v287;
        double v284 = v285/1.0;
        double v283 = (double)v284;
        double v281 = v282/v283;
        double v279 = v281;
        double v291 = v279;
        System.out.println(v291);
        System.out.println("Insert your weight in kg: ");
        double v296 = sc.nextDouble();
        double v295 = v296/1.0;
        double v294 = (double)v295;
        double v292 = v294;
        System.out.println("Insert your height in meters: ");
        double v301 = sc.nextDouble();
        double v300 = v301/1.0;
        double v299 = (double)v300;
        double v297 = v299;
        double v303 = v292;
        double v305 = v297;
        int v306 = 2;
        double v304 = Math.pow(v305, v306);
        double v302 = v303/v304;
        v1(v302);
    };
}
