
import java.util.Random;

class CalculosCalculosos {
    public static double[] Def = new double[] { 16.0, 19.0, 21.0, 23.0 };
    public static double[] DefPorciento = new double[] { 5.1, 5.8, 6.6, 7.3 };
    public static double[] HP = new double[] { 209.0, 239.0, 269.0, 299.0 };
    public static double[] HPPorciento = new double[] { 4.1, 4.7, 5.3, 5.8 };
    public static double[] Atq = new double[] { 14.0, 16.0, 18.0, 19.0 };
    public static double[] AtqPorciento = new double[] { 4.1, 4.7, 5.3, 5.8 };
    public static double[] Recarga = new double[] { 4.5, 5.2, 5.8, 6.5 };
    public static double[] ME = new double[] { 16.0, 19.0, 21.0, 23.0 };
    public static double[] Prob = new double[] { 2.7, 3.1, 3.5, 3.9 };
    public static double[] Dmg = new double[] { 5.4, 6.2, 7.0, 7.8 };
    static final double[][] valorStats;
    static final String[] OrdenSubstast;
    public static boolean maxRango;
    public static boolean SegmaxRango;
    public static int ultimaSubida;

    CalculosCalculosos() {
    }

    public static Stats deleteStats(Artefacto artefacto, String[] OrdenSubstast, double[][] valorStats) {
        new Stats(OrdenSubstast, valorStats);
        double[][] nuevaMatriz = new double[7][4];
        String[] OrdenSubstastProv = new String[7];
        int j = 0;

        for (int i = 0; i < OrdenSubstast.length; ++i) {
            if (OrdenSubstast[i] != artefacto.Substat1.tipo && OrdenSubstast[i] != artefacto.Substat2.tipo
                    && !OrdenSubstast[i].equals(artefacto.mainStat)) {
                nuevaMatriz[j] = valorStats[i];
                OrdenSubstastProv[j] = OrdenSubstast[i];
                ++j;
            }
        }

        Stats stats = new Stats(OrdenSubstastProv, nuevaMatriz);
        return stats;
    }

    public static StatArtefacto CuartoSubstat(Artefacto artefacto) throws IllegalArgumentException {
        Stats OrdenSubstastProv = deleteStats(artefacto, OrdenSubstast, valorStats);
        StatArtefacto res = null;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(4);
        Random probRandom = new Random();
        double probabilidad = probRandom.nextDouble();
        double probabilidadfija = 0.55;
        if (artefacto.Substat4 != null) {
            System.out.println("El artefacto ya tiene 4 substats");
            throw new IllegalArgumentException();
        } else {
            int i;
            for (i = 0; i < OrdenSubstastProv.OrdenSubstast.length; ++i) {
                if (OrdenSubstastProv.OrdenSubstast[i] == artefacto.Substat3.tipo
                        && OrdenSubstastProv.valorStats[i][3] == artefacto.Substat3.valor) {
                    probabilidadfija = 0.7;
                }
            }

            for (i = 0; i < OrdenSubstastProv.OrdenSubstast.length; ++i) {
                if (OrdenSubstastProv.OrdenSubstast[i] == artefacto.Substat3.tipo) {
                    if (probabilidad < probabilidadfija) {
                        if (i == OrdenSubstastProv.OrdenSubstast.length - 1) {
                            res = new StatArtefacto(OrdenSubstastProv.OrdenSubstast[0],
                                    OrdenSubstastProv.valorStats[0][numeroAleatorio]);
                        } else {
                            res = new StatArtefacto(OrdenSubstastProv.OrdenSubstast[i + 1],
                                    OrdenSubstastProv.valorStats[i + 1][numeroAleatorio]);
                        }
                    }

                    if (probabilidad > probabilidadfija) {
                        if (i == OrdenSubstastProv.OrdenSubstast.length - 1) {
                            res = new StatArtefacto(OrdenSubstastProv.OrdenSubstast[1],
                                    OrdenSubstastProv.valorStats[1][numeroAleatorio]);
                        } else if (i == OrdenSubstastProv.OrdenSubstast.length - 2) {
                            res = new StatArtefacto(OrdenSubstastProv.OrdenSubstast[0],
                                    OrdenSubstastProv.valorStats[0][numeroAleatorio]);
                        } else {
                            res = new StatArtefacto(OrdenSubstastProv.OrdenSubstast[i + 2],
                                    OrdenSubstastProv.valorStats[i + 2][numeroAleatorio]);
                        }
                    }
                }
            }

            if (numeroAleatorio > 2) {
                maxRango = true;
            } else {
                maxRango = false;
                if (numeroAleatorio <= 2 && numeroAleatorio > 1) {
                    SegmaxRango = true;
                } else {
                    SegmaxRango = false;
                }
            }

            ultimaSubida = 4;
            return res;
        }
    }

    public static Stats StatsFinales(Artefacto artefacto, String[] OrdenSubstast, double[][] valorStats) {
        new Stats(OrdenSubstast, valorStats);
        double[][] nuevaMatriz = new double[4][4];
        String[] OrdenSubstastProv = new String[4];
        int j = 0;

        for (int i = 0; i < OrdenSubstast.length; ++i) {
            if (OrdenSubstast[i] == artefacto.Substat1.tipo || OrdenSubstast[i] == artefacto.Substat2.tipo
                    || OrdenSubstast[i] == artefacto.Substat3.tipo || OrdenSubstast[i] == artefacto.Substat4.tipo) {
                nuevaMatriz[j] = valorStats[i];
                OrdenSubstastProv[j] = OrdenSubstast[i];
                ++j;
            }
        }

        Stats stats = new Stats(OrdenSubstastProv, nuevaMatriz);
        return stats;
    }

    public static Artefacto StatNivel4(Artefacto artefacto) throws IllegalArgumentException {
        Random probRandom = new Random();
        double probabilidad = probRandom.nextDouble();
        double probabilidadfija1 = 0.2;
        double probabilidadfija2 = 0.4;
        double probabilidadfija3 = 0.2;
        double probabilidadfija4 = 0.2;
        double valorAdded = 0.0;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(4);
        if (artefacto.Substat4 == null && artefacto.nivel >= 4) {
            System.out.println("El artefacto no tiene 4 substats");
            throw new IllegalArgumentException();
        } else if (artefacto.Substat4 == null && artefacto.nivel < 4) {
            artefacto = new Artefacto(4, artefacto.mainStat, artefacto.Substat1, artefacto.Substat2, artefacto.Substat3,
                    CuartoSubstat(artefacto));
            artefacto.nivel = 4;
            return artefacto;
        } else {
            if (maxRango && !SegmaxRango) {
                switch (ultimaSubida) {
                    case 0:
                        probabilidadfija1 = 0.2;
                        probabilidadfija2 = 0.4;
                        probabilidadfija3 = 0.2;
                        probabilidadfija4 = 0.2;
                        break;
                    case 1:
                        probabilidadfija1 = 0.5;
                        probabilidadfija2 = 0.4;
                        probabilidadfija3 = 0.2;
                        probabilidadfija4 = 0.2;
                        break;
                    case 2:
                        probabilidadfija1 = 0.2;
                        probabilidadfija2 = 0.7;
                        probabilidadfija3 = 0.2;
                        probabilidadfija4 = 0.2;
                        break;
                    case 3:
                        probabilidadfija1 = 0.2;
                        probabilidadfija2 = 0.4;
                        probabilidadfija3 = 0.5;
                        probabilidadfija4 = 0.2;
                        break;
                    case 4:
                        probabilidadfija1 = 0.2;
                        probabilidadfija2 = 0.4;
                        probabilidadfija3 = 0.2;
                        probabilidadfija4 = 0.5;
                }
            }

            if (!maxRango && SegmaxRango) {
                switch (ultimaSubida) {
                    case 0:
                        probabilidadfija1 = 0.2;
                        probabilidadfija2 = 0.4;
                        probabilidadfija3 = 0.2;
                        probabilidadfija4 = 0.2;
                        break;
                    case 1:
                        probabilidadfija1 = 0.35;
                        probabilidadfija2 = 0.4;
                        probabilidadfija3 = 0.2;
                        probabilidadfija4 = 0.2;
                        break;
                    case 2:
                        probabilidadfija1 = 0.2;
                        probabilidadfija2 = 0.55;
                        probabilidadfija3 = 0.2;
                        probabilidadfija4 = 0.2;
                        break;
                    case 3:
                        probabilidadfija1 = 0.2;
                        probabilidadfija2 = 0.4;
                        probabilidadfija3 = 0.35;
                        probabilidadfija4 = 0.2;
                        break;
                    case 4:
                        probabilidadfija1 = 0.2;
                        probabilidadfija2 = 0.4;
                        probabilidadfija3 = 0.2;
                        probabilidadfija4 = 0.35;
                }
            }

            int i;
            if (probabilidad < probabilidadfija1) {
                for (i = 0; i < OrdenSubstast.length; ++i) {
                    if (OrdenSubstast[i] == artefacto.Substat1.tipo) {
                        valorAdded = valorStats[i][numeroAleatorio];
                    }
                }

                if (numeroAleatorio == 3) {
                    maxRango = true;
                    SegmaxRango = false;
                }

                if (numeroAleatorio == 2) {
                    maxRango = false;
                    SegmaxRango = true;
                } else {
                    maxRango = false;
                    SegmaxRango = false;
                }

                artefacto.Substat1.valor += valorAdded;
                ultimaSubida = 1;
            }

            if (probabilidad > probabilidadfija1 && probabilidad < probabilidadfija1 + probabilidadfija2) {
                for (i = 0; i < OrdenSubstast.length; ++i) {
                    if (OrdenSubstast[i] == artefacto.Substat2.tipo) {
                        valorAdded = valorStats[i][numeroAleatorio];
                    }
                }

                if (numeroAleatorio == 3) {
                    maxRango = true;
                    SegmaxRango = false;
                }

                if (numeroAleatorio == 2) {
                    maxRango = false;
                    SegmaxRango = true;
                } else {
                    maxRango = false;
                    SegmaxRango = false;
                }

                artefacto.Substat2.valor += valorAdded;
                ultimaSubida = 2;
            }

            if (probabilidad > probabilidadfija1 + probabilidadfija2
                    && probabilidad < probabilidadfija1 + probabilidadfija2 + probabilidadfija3) {
                for (i = 0; i < OrdenSubstast.length; ++i) {
                    if (OrdenSubstast[i] == artefacto.Substat3.tipo) {
                        valorAdded = valorStats[i][numeroAleatorio];
                    }
                }

                if (numeroAleatorio == 3) {
                    maxRango = true;
                    SegmaxRango = false;
                }

                if (numeroAleatorio == 2) {
                    maxRango = false;
                    SegmaxRango = true;
                } else {
                    maxRango = false;
                    SegmaxRango = false;
                }

                artefacto.Substat3.valor += valorAdded;
                ultimaSubida = 3;
            }

            if (probabilidad > probabilidadfija1 + probabilidadfija2 + probabilidadfija3
                    && probabilidad < probabilidadfija1 + probabilidadfija2 + probabilidadfija3 + probabilidadfija4) {
                for (i = 0; i < OrdenSubstast.length; ++i) {
                    if (OrdenSubstast[i] == artefacto.Substat4.tipo) {
                        valorAdded = valorStats[i][numeroAleatorio];
                    }
                }

                if (numeroAleatorio == 3) {
                    maxRango = true;
                    SegmaxRango = false;
                }

                if (numeroAleatorio == 2) {
                    maxRango = false;
                    SegmaxRango = true;
                } else {
                    maxRango = false;
                    SegmaxRango = false;
                }

                artefacto.Substat4.valor += valorAdded;
                ultimaSubida = 4;
            }

            artefacto.nivel = 4;
            return artefacto;
        }
    }

    public static Artefacto StatNivel8(Artefacto artefacto) throws IllegalArgumentException {
        Random probRandom = new Random();
        double probabilidad = probRandom.nextDouble();
        double probabilidadfija1 = 0.15;
        double probabilidadfija2 = 0.35;
        double probabilidadfija3 = 0.35;
        double probabilidadfija4 = 0.15;
        double valorAdded = 0.0;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(4);
        if (artefacto.Substat4 == null && artefacto.nivel >= 4) {
            System.out.println("El artefacto no tiene 4 substats");
            throw new IllegalArgumentException();
        } else {
            if (artefacto.nivel < 4) {
                artefacto = StatNivel4(artefacto);
            } else {
                if (maxRango && !SegmaxRango) {
                    switch (ultimaSubida) {
                        case 1:
                            probabilidadfija1 = 0.44999999999999996;
                            probabilidadfija2 = 0.35;
                            probabilidadfija3 = 0.35;
                            probabilidadfija4 = 0.15;
                            break;
                        case 2:
                            probabilidadfija1 = 0.15;
                            probabilidadfija2 = 0.6499999999999999;
                            probabilidadfija3 = 0.35;
                            probabilidadfija4 = 0.15;
                            break;
                        case 3:
                            probabilidadfija1 = 0.15;
                            probabilidadfija2 = 0.35;
                            probabilidadfija3 = 0.6499999999999999;
                            probabilidadfija4 = 0.15;
                            break;
                        case 4:
                            probabilidadfija1 = 0.15;
                            probabilidadfija2 = 0.35;
                            probabilidadfija3 = 0.35;
                            probabilidadfija4 = 0.44999999999999996;
                    }
                }

                if (!maxRango && SegmaxRango) {
                    switch (ultimaSubida) {
                        case 1:
                            probabilidadfija1 = 0.3;
                            probabilidadfija2 = 0.35;
                            probabilidadfija3 = 0.35;
                            probabilidadfija4 = 0.15;
                            break;
                        case 2:
                            probabilidadfija1 = 0.15;
                            probabilidadfija2 = 0.5;
                            probabilidadfija3 = 0.35;
                            probabilidadfija4 = 0.15;
                            break;
                        case 3:
                            probabilidadfija1 = 0.15;
                            probabilidadfija2 = 0.35;
                            probabilidadfija3 = 0.5;
                            probabilidadfija4 = 0.15;
                            break;
                        case 4:
                            probabilidadfija1 = 0.15;
                            probabilidadfija2 = 0.35;
                            probabilidadfija3 = 0.35;
                            probabilidadfija4 = 0.3;
                    }
                }

                int i;
                if (probabilidad < probabilidadfija1) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat1.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat1.valor += valorAdded;
                    ultimaSubida = 1;
                }

                if (probabilidad > probabilidadfija1 && probabilidad < probabilidadfija1 + probabilidadfija2) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat2.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat2.valor += valorAdded;
                    ultimaSubida = 2;
                }

                if (probabilidad > probabilidadfija1 + probabilidadfija2
                        && probabilidad < probabilidadfija1 + probabilidadfija2 + probabilidadfija3) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat3.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat3.valor += valorAdded;
                    ultimaSubida = 3;
                }

                if (probabilidad > probabilidadfija1 + probabilidadfija2 + probabilidadfija3
                        && probabilidad < probabilidadfija1 + probabilidadfija2 + probabilidadfija3
                                + probabilidadfija4) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat4.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat4.valor += valorAdded;
                    ultimaSubida = 4;
                }

                artefacto.nivel = 8;
            }

            return artefacto;
        }
    }

    public static Artefacto StatNivel12(Artefacto artefacto) throws IllegalArgumentException {
        Random probRandom = new Random();
        double probabilidad = probRandom.nextDouble();
        double probabilidadfija1 = 0.25;
        double probabilidadfija2 = 0.25;
        double probabilidadfija3 = 0.25;
        double probabilidadfija4 = 0.25;
        double valorAdded = 0.0;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(4);
        if (artefacto.Substat4 == null && artefacto.nivel >= 4) {
            System.out.println("El artefacto no tiene 4 substats");
            throw new IllegalArgumentException();
        } else {
            if (artefacto.nivel < 8) {
                artefacto = StatNivel8(artefacto);
            } else {
                if (maxRango && !SegmaxRango) {
                    switch (ultimaSubida) {
                        case 1:
                            probabilidadfija1 = 0.55;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.25;
                            break;
                        case 2:
                            probabilidadfija1 = 0.25;
                            probabilidadfija2 = 0.55;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.25;
                            break;
                        case 3:
                            probabilidadfija1 = 0.25;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.55;
                            probabilidadfija4 = 0.25;
                            break;
                        case 4:
                            probabilidadfija1 = 0.25;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.55;
                    }
                }

                if (!maxRango && SegmaxRango) {
                    switch (ultimaSubida) {
                        case 1:
                            probabilidadfija1 = 0.4;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.25;
                            break;
                        case 2:
                            probabilidadfija1 = 0.25;
                            probabilidadfija2 = 0.4;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.25;
                            break;
                        case 3:
                            probabilidadfija1 = 0.25;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.4;
                            probabilidadfija4 = 0.25;
                            break;
                        case 4:
                            probabilidadfija1 = 0.25;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.4;
                    }
                }

                int i;
                if (probabilidad < probabilidadfija1) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat1.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat1.valor += valorAdded;
                    ultimaSubida = 1;
                }

                if (probabilidad > probabilidadfija1 && probabilidad < probabilidadfija1 + probabilidadfija2) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat2.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat2.valor += valorAdded;
                    ultimaSubida = 2;
                }

                if (probabilidad > probabilidadfija1 + probabilidadfija2
                        && probabilidad < probabilidadfija1 + probabilidadfija2 + probabilidadfija3) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat3.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat3.valor += valorAdded;
                    ultimaSubida = 3;
                }

                if (probabilidad > probabilidadfija1 + probabilidadfija2 + probabilidadfija3
                        && probabilidad < probabilidadfija1 + probabilidadfija2 + probabilidadfija3
                                + probabilidadfija4) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat4.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat4.valor += valorAdded;
                    ultimaSubida = 4;
                }

                artefacto.nivel = 12;
            }

            return artefacto;
        }
    }

    public static Artefacto StatNivel16(Artefacto artefacto) throws IllegalArgumentException {
        Random probRandom = new Random();
        double probabilidad = probRandom.nextDouble();
        double probabilidadfija1 = 0.25;
        double probabilidadfija2 = 0.25;
        double probabilidadfija3 = 0.25;
        double probabilidadfija4 = 0.25;
        double valorAdded = 0.0;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(4);
        if (artefacto.Substat4 == null && artefacto.nivel >= 4) {
            System.out.println("El artefacto no tiene 4 substats");
            throw new IllegalArgumentException();
        } else {
            if (artefacto.nivel < 12) {
                artefacto = StatNivel12(artefacto);
            } else {
                if (maxRango && !SegmaxRango) {
                    switch (ultimaSubida) {
                        case 1:
                            probabilidadfija1 = 0.55;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.25;
                            break;
                        case 2:
                            probabilidadfija1 = 0.25;
                            probabilidadfija2 = 0.55;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.25;
                            break;
                        case 3:
                            probabilidadfija1 = 0.25;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.55;
                            probabilidadfija4 = 0.25;
                            break;
                        case 4:
                            probabilidadfija1 = 0.25;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.55;
                    }
                }

                if (!maxRango && SegmaxRango) {
                    switch (ultimaSubida) {
                        case 1:
                            probabilidadfija1 = 0.4;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.25;
                            break;
                        case 2:
                            probabilidadfija1 = 0.25;
                            probabilidadfija2 = 0.4;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.25;
                            break;
                        case 3:
                            probabilidadfija1 = 0.25;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.4;
                            probabilidadfija4 = 0.25;
                            break;
                        case 4:
                            probabilidadfija1 = 0.25;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.4;
                    }
                }

                int i;
                if (probabilidad < probabilidadfija1) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat1.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat1.valor += valorAdded;
                    ultimaSubida = 1;
                }

                if (probabilidad > probabilidadfija1 && probabilidad < probabilidadfija1 + probabilidadfija2) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat2.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat2.valor += valorAdded;
                    ultimaSubida = 2;
                }

                if (probabilidad > probabilidadfija1 + probabilidadfija2
                        && probabilidad < probabilidadfija1 + probabilidadfija2 + probabilidadfija3) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat3.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat3.valor += valorAdded;
                    ultimaSubida = 3;
                }

                if (probabilidad > probabilidadfija1 + probabilidadfija2 + probabilidadfija3
                        && probabilidad < probabilidadfija1 + probabilidadfija2 + probabilidadfija3
                                + probabilidadfija4) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat4.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat4.valor += valorAdded;
                    ultimaSubida = 4;
                }

                artefacto.nivel = 16;
            }

            return artefacto;
        }
    }

    public static Artefacto StatNivel20(Artefacto artefacto) throws IllegalArgumentException {
        Random probRandom = new Random();
        double probabilidad = probRandom.nextDouble();
        double probabilidadfija1 = 0.7;
        double probabilidadfija2 = 0.1;
        double probabilidadfija3 = 0.1;
        double probabilidadfija4 = 0.1;
        double valorAdded = 0.0;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(4);
        if (artefacto.Substat4 == null && artefacto.nivel >= 4) {
            System.out.println("El artefacto no tiene 4 substats");
            throw new IllegalArgumentException();
        } else {
            if (artefacto.nivel < 16) {
                artefacto = StatNivel16(artefacto);
            } else {
                if (maxRango && !SegmaxRango) {
                    switch (ultimaSubida) {
                        case 1:
                            probabilidadfija1 = 1.0;
                            probabilidadfija2 = 0.1;
                            probabilidadfija3 = 0.1;
                            probabilidadfija4 = 0.1;
                            break;
                        case 2:
                            probabilidadfija1 = 0.7;
                            probabilidadfija2 = 0.4;
                            probabilidadfija3 = 0.1;
                            probabilidadfija4 = 0.1;
                            break;
                        case 3:
                            probabilidadfija1 = 0.7;
                            probabilidadfija2 = 0.1;
                            probabilidadfija3 = 0.4;
                            probabilidadfija4 = 0.1;
                            break;
                        case 4:
                            probabilidadfija1 = 0.7;
                            probabilidadfija2 = 0.1;
                            probabilidadfija3 = 0.1;
                            probabilidadfija4 = 0.4;
                    }
                }

                if (!maxRango && SegmaxRango) {
                    switch (ultimaSubida) {
                        case 1:
                            probabilidadfija1 = 0.85;
                            probabilidadfija2 = 0.1;
                            probabilidadfija3 = 0.1;
                            probabilidadfija4 = 0.1;
                            break;
                        case 2:
                            probabilidadfija1 = 0.7;
                            probabilidadfija2 = 0.25;
                            probabilidadfija3 = 0.1;
                            probabilidadfija4 = 0.1;
                            break;
                        case 3:
                            probabilidadfija1 = 0.7;
                            probabilidadfija2 = 0.1;
                            probabilidadfija3 = 0.25;
                            probabilidadfija4 = 0.1;
                            break;
                        case 4:
                            probabilidadfija1 = 0.7;
                            probabilidadfija2 = 0.1;
                            probabilidadfija3 = 0.1;
                            probabilidadfija4 = 0.25;
                    }
                }

                int i;
                if (probabilidad < probabilidadfija1) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat1.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat1.valor += valorAdded;
                    ultimaSubida = 1;
                }

                if (probabilidad > probabilidadfija1 && probabilidad < probabilidadfija1 + probabilidadfija2) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat2.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat2.valor += valorAdded;
                    ultimaSubida = 2;
                }

                if (probabilidad > probabilidadfija1 + probabilidadfija2
                        && probabilidad < probabilidadfija1 + probabilidadfija2 + probabilidadfija3) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat3.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat3.valor += valorAdded;
                    ultimaSubida = 3;
                }

                if (probabilidad > probabilidadfija1 + probabilidadfija2 + probabilidadfija3
                        && probabilidad < probabilidadfija1 + probabilidadfija2 + probabilidadfija3
                                + probabilidadfija4) {
                    for (i = 0; i < OrdenSubstast.length; ++i) {
                        if (OrdenSubstast[i] == artefacto.Substat4.tipo) {
                            valorAdded = valorStats[i][numeroAleatorio];
                        }
                    }

                    if (numeroAleatorio == 3) {
                        maxRango = true;
                        SegmaxRango = false;
                    }

                    if (numeroAleatorio == 2) {
                        maxRango = false;
                        SegmaxRango = true;
                    } else {
                        maxRango = false;
                        SegmaxRango = false;
                    }

                    artefacto.Substat4.valor += valorAdded;
                    ultimaSubida = 4;
                }

                artefacto.nivel = 20;
            }

            return artefacto;
        }
    }

    static {
        valorStats = new double[][] { Def, DefPorciento, HP, HPPorciento, Atq, AtqPorciento, Recarga, ME, Prob, Dmg };
        OrdenSubstast = new String[] { "Def", "DefPorciento", "HP", "HPPorciento", "Atq", "AtqPorciento", "Recarga",
                "ME", "Prob", "Dmg" };
        maxRango = false;
        SegmaxRango = false;
        ultimaSubida = 0;
    }
}
