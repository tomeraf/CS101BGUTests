import java.util.Scanner;


public class Tomer_Tester_Ass2 {
    private static boolean legalInput(String s) {
        boolean check10, check20, check10D, check20D;
        check10 = CS(s, "0") | CS(s, "1") | CS(s, "2") | CS(s, "3") | CS(s, "4") | CS(s, "5") | CS(s, "6") | CS(s, "7") | CS(s, "8") | CS(s, "9") | CS(s, "10");
        check20 = CS(s, "11") | CS(s, "12") | CS(s, "13") | CS(s, "14") | CS(s, "15") | CS(s, "16") | CS(s, "17") | CS(s, "18") | CS(s, "19") | CS(s, "20");
        check10D = CS(s, "0.0") | CS(s, "1.0") | CS(s, "2.0") | CS(s, "3.0") | CS(s, "4.0") | CS(s, "5.0") | CS(s, "6.0") | CS(s, "7.0") | CS(s, "8.0") | CS(s, "9.0") | CS(s, "10.0");
        check20D = CS(s, "11.0") | CS(s, "12.0") | CS(s, "13.0") | CS(s, "14.0") | CS(s, "15.0") | CS(s, "16.0") | CS(s, "17.0") | CS(s, "18.0") | CS(s, "19.0") | CS(s, "20.0");
        return check10 || check20 || check10D || check20D;
    }
    public static void main(String[] args) {
        space();
        println("created by: Tomer Cohen (aka Tomer The Tester)");
        println("for private tutoring: 0584477500");
        space();
        println("put a number from 0-20");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while (!CS(input, "-1")) {
            while (!legalInput(input)) {
                println("Cant check that, its not a real number for this Assignment");
                println("Check out 'read me' file for more information");
                space();
                println("anything else to check?");
                input = scanner.next();
            }
            whatToCheck(input);
            space();
            println("anything else to check?");
            input = scanner.next();
        }
    }
    private static void whatToCheck(String s) {
        boolean isDisplay = CS(s, "0.0") | CS(s, "1.0") | CS(s, "2.0") | CS(s, "3.0") | CS(s, "4.0") | CS(s, "5.0") | CS(s, "6.0") | CS(s, "7.0") | CS(s, "8.0") | CS(s, "9.0") | CS(s, "10.0") || CS(s, "11.0") | CS(s, "12.0") | CS(s, "13.0") | CS(s, "14.0") | CS(s, "15.0") | CS(s, "16.0") | CS(s, "17.0") | CS(s, "18.0") | CS(s, "19.0") | CS(s, "20.0");
        if (isDisplay)
            s = s.substring(0, s.length() - 2);

        if (CS(s, "1") | CS(s, "0")) {
            t1(isDisplay);
        }
        if (CS(s, "2") | CS(s, "0")) {
            t2(isDisplay);
        }
        if (CS(s, "3") | CS(s, "0")) {
            t3(isDisplay);
        }
        if (CS(s, "4") | CS(s, "0")) {
            t4(isDisplay);
        }
        if (CS(s, "5") | CS(s, "0")) {
            t5(isDisplay);
        }
        if (CS(s, "6") | CS(s, "0")) {
            t6(isDisplay);
        }
        if (CS(s, "7") | CS(s, "0")) {
            t7(isDisplay);
        }
        if (CS(s, "8") | CS(s, "0")) {
            t8(isDisplay);
        }
        if (CS(s, "9") | CS(s, "0")) {
            t9(isDisplay);
        }
        if (CS(s, "10") | CS(s, "0")) {
            t10(isDisplay);
        }
        if (CS(s, "11") | CS(s, "0")) {
            t11(isDisplay);
        }
        if (CS(s, "12") | CS(s, "0")) {
            t12(isDisplay);
        }
        if (CS(s, "13") | CS(s, "0")) {
            t13(isDisplay);
        }
        if (CS(s, "14") | CS(s, "0")) {
            t14(isDisplay);
        }
        if (CS(s, "15") | CS(s, "0")) {
            t15(isDisplay);
        }
        if (CS(s, "16") | CS(s, "0")) {
            t16(isDisplay);
        }

    }
    private static void fail() {
        System.out.println();
        System.out.print("fail: ");
    }
    private static void good() {
        System.out.println("good");
    }
    public static void println(String message) {
        ThePrinter(message, 25);
    }
    public static void space() {
        System.out.println();
    }
    public static void ThePrinter(String message, int speed) {//print at a reduced speed
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            System.out.print(message.charAt(i));
            try {
                Thread.sleep(speed); // Sleep 100= 100ms (0.1 seconds)
            } catch (InterruptedException ex) {
            }
        }
        space();
    }
    public static boolean CS(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }
    public static String matrixToString(boolean[][] M) {
        if (M == null) {
            return "null";
        }
        if(M.length==0)
            return "{}";
        String s = "{";
        int i=0;
        for (i = 0; i < M.length-1; i++)
            s+=arrayToString(M[i])+",";
        s+=arrayToString(M[i])+"}";
        return s;
    }
    public static String matrixToString(int[][] M) {
        if (M == null) {
            return "null";
        }
        if(M.length==0)
            return "{}";
        String s = "{";
        int i=0;
        for (i = 0; i < M.length-1; i++)
            s+=arrayToString(M[i])+",";
        s+=arrayToString(M[i])+"}";
        return s;
    }
    public static String matrixToString(String[][] M) {
        if (M == null) {
            return "null";
        }
        if(M.length==0)
            return "{}";
        String s = "{";
        int i=0;
        for (i = 0; i < M.length-1; i++)
            s+=arrayToString(M[i])+",";
        s+=arrayToString(M[i])+"}";
        return s;
    }
    public static String arrayToString(int[] a) {
        if (a == null) {
            return "null";
        }
        if(a.length==0)
            return "{}";
        String s = "{";
        for (int i = 0; i < a.length - 1; i++)
            s += a[i] + ",";
        s += a[a.length - 1] + "}";
        return s;
    }
    public static String arrayToString(boolean[] a) {
        if (a == null) {
            return "null";
        }
        if(a.length==0)
            return "{}";
        String s = "{";
        for (int i = 0; i < a.length - 1; i++)
            s += a[i] + ",";
        s += a[a.length - 1] + "}\n";
        return s;
    }
    public static String arrayToString(String[] a) {
        if (a == null) {
            return "null";
        }
        if(a.length==0)
            return "{}";
        String s = "{";
        for (int i = 0; i < a.length - 1; i++)
            s += a[i] + ",";
        s += a[a.length - 1] + "}";
        return s;
    }
    private static void t1(boolean D) {
        System.out.println("checking Task1: ");
        boolean flag = false;
        boolean input;
        boolean check;
        boolean[][][] matrices = new boolean[7][][];

        boolean[][] matrix0 = null;
        matrices[0] = matrix0;
        boolean[][] matrix1 = new boolean[1][1];
        matrices[1] = matrix1;
        boolean[][] matrix2 = new boolean[3][3];
        matrices[2] = matrix2;
        boolean[][] matrix3 = new boolean[10][10];
        matrices[3] = matrix3;
        boolean[][] matrix4 = new boolean[2][3];
        matrices[4] = matrix4;
        boolean[][] matrix5 = new boolean[10][1];
        matrices[5] = matrix5;
        boolean[][] matrix6 = new boolean[0][0];
        matrices[6] = matrix6;
        String[] sizes = {"null", "1x1", "3x3", "10x10", "2x3", "10x1", "0x0"};
        boolean[] ans = {false, true, true, true, false, false, false};

        for (int i = 0; i < matrices.length; i++) {
            if (D) {
                System.out.println("testing matrix #" + (i + 1) + " which is in sizes of: " + sizes[i]);
                space();
            }
            input = Assignment2.isSquareMatrix(matrices[i]);
            check = input == ans[i];
            if (!check) {
                if (!D) {
                    System.out.println("testing matrix #" + (i + 1) + " which is in sizes of: " + sizes[i]);
                    space();
                }
                fail();
                flag = true;
                System.out.println("the input should get you " + ans[i] + " but yours is: " + input);
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static void t2(boolean D) {
        System.out.println("checking Task2: ");
        boolean flag = false;
        boolean input;
        boolean check;
        boolean[][][] matrices = new boolean[4][][];

        boolean[][] matrix0 = {{true, false, false},
                {false, false, true},
                {false, true, true}};
        matrices[0] = matrix0;
        boolean[][] matrix1 = {{true, false, false},
                {false, false, true},
                {false, false, true}};
        matrices[1] = matrix1;
        boolean[][] matrix2 = {{true, true, true, true},
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true}};
        matrices[2] = matrix2;
        boolean[][] matrix3 = new boolean[0][0];
        matrices[3] = matrix3;
        boolean[] ans = {true, false, true, true};

        for (int i = 0; i < matrices.length; i++) {
            if (D) {
                System.out.println("testing matrix #" + (i + 1) + " which is: \n" + matrixToString(matrices[i]));
            }
            input = Assignment2.isSymmetricMatrix(matrices[i]);
            check = input == ans[i];
            if (!check) {
                if (!D) {
                    System.out.println("testing matrix #" + (i + 1) + " which is: \n" + matrixToString(matrices[i]));
                }
                fail();
                flag = true;
                System.out.println("the input should get you " + ans[i] + " but yours is: " + input);
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static void t3(boolean D) {
        System.out.println("checking Task3: ");
        boolean flag = false;
        boolean input;
        boolean check;
        boolean[][][] matrices = new boolean[4][][];

        boolean[][] matrix0 = {{false, false, false},
                {false, false, true},
                {false, true, false}};
        matrices[0] = matrix0;
        boolean[][] matrix1 = {{false, false, false},
                {false, false, true},
                {false, false, true}};
        matrices[1] = matrix1;
        boolean[][] matrix2 = {{true, true, true, true},
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true}};
        matrices[2] = matrix2;
        boolean[][] matrix3 = new boolean[0][0];
        matrices[3] = matrix3;
        boolean[] ans = {true, false, false, true};

        for (int i = 0; i < matrices.length; i++) {
            if (D) {
                System.out.println("testing matrix #" + (i + 1) + " which is:\n" + matrixToString(matrices[i]));
            }
            input = Assignment2.isAntiReflexiveMatrix(matrices[i]);
            check = input == ans[i];
            if (!check) {
                if (!D) {
                    System.out.println("testing matrix #" + (i + 1) + " which is:\n" + matrixToString(matrices[i]));
                }
                fail();
                flag = true;
                System.out.println("the input should get you " + ans[i] + " but yours is: " + input);
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static void t4(boolean D) {
        System.out.println("checking Task4: ");
        boolean flag = false;
        boolean input;
        boolean check;
        boolean[][][] matrices = new boolean[8][][];

        boolean[][] matrix0 = {{true}};
        matrices[0] = matrix0;
        boolean[][] matrix1 = {{false}};
        matrices[1] = matrix1;
        boolean[][] matrix2 = {{true, false, false},
                {false, false, true},
                {false, true, true}};
        matrices[2] = matrix2;
        boolean[][] matrix3 = {{true, true, true, true},
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true}};
        matrices[3] = matrix3;
        boolean[][] matrix4 = {{false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}};
        matrices[4] = matrix4;
        boolean[][] matrix5 = new boolean[0][0];
        matrices[5] = matrix5;

        boolean[][] matrix6 = {{false, false, false},
                {false, false, true},
                {false, true, false}};
        matrices[6] = matrix6;
        boolean[][] matrix7 = {{false, true, false, true},
                {true, false, false, true},
                {false, false, false, false},
                {true, true, false, false}};
        matrices[7] = matrix7;
        boolean[] ans = {false, true, false, false, true, false, true, true};

        for (int i = 0; i < matrices.length; i++) {
            if (D) {
                System.out.println("testing matrix #" + (i + 1) + " which is:\n" + matrixToString(matrices[i]));
            }
            input = Assignment2.isLegalInstance(matrices[i]);
            check = input == ans[i];
            if (!check) {
                if (!D) {
                    System.out.println("testing matrix #" + (i + 1) + " which is:\n" + matrixToString(matrices[i]));
                }
                fail();
                flag = true;
                System.out.println("the input should get you " + ans[i] + " but yours is: " + input);
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static void t5(boolean D) {
        System.out.println("checking Task5: ");
        boolean flag = false;
        boolean input;
        boolean check;
        int[][] matrices = new int[6][];

        int[] matrix0 = {1,0};
        matrices[0] = matrix0;
        int[] matrix1 = {1, 0, 2, 3, 4};
        matrices[1] = matrix1;
        int[] matrix2 = {0, 2, 1, 4, 3, 5, 6};
        matrices[2] = matrix2;
        int[] matrix3 = {2, 1, 4, 3, 5, 6, 8};
        matrices[3] = matrix3;
        int[] matrix4 = {0, 2, 1, 4, 0, 3, 5, 6};
        matrices[4] = matrix4;
        int[] matrix5 = {0};
        matrices[5] = matrix5;

        boolean[] ans = {true, true, true, false, false, true};

        for (int i = 0; i < matrices.length; i++) {
            if (D) {
                System.out.println("testing matrix #" + (i + 1) + " which is:\n" + arrayToString(matrices[i]));
            }
            input = Assignment2.isPermutation(matrices[i]);
            check = input == ans[i];
            if (!check) {
                if (!D) {
                    System.out.println("testing matrix #" + (i + 1) + " which is:\n" + arrayToString(matrices[i]));
                }
                fail();
                flag = true;
                System.out.println("the input should get you " + ans[i] + " but yours is: " + input);
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static void t6(boolean D) {
        System.out.println("checking Task6: ");
        boolean flag = false;
        boolean input;
        boolean check;
        boolean[][][] flights = new boolean[6][][];
        int[][] tours = new int[6][];


        boolean[][] matrix0 = {{false, true, true},
                {true, false, false},
                {true, false, false}};
        flights[0] = matrix0;
        flights[1] = matrix0;
        flights[2] = matrix0;
        boolean[][] matrix1 = {{false, true, true, true},
                {true, false, true, true},
                {true, true, false, false},
                {true, true, false, false}};
        flights[3] = matrix1;
        flights[4] = matrix1;
        flights[5] = matrix1;

        int[] array0 = {0, 1, 2};//false
        tours[0] = array0;
        int[] array1 = {1, 0, 2};//false
        tours[1] = array1;
        int[] array2 = {2, 1, 0};//false
        tours[2] = array2;
        int[] array3 = {3, 2, 1, 0};//false
        tours[3] = array3;
        int[] array4 = {3, 1, 0, 2};//false
        tours[4] = array4;
        int[] array5 = {3, 0, 2, 1};//true
        tours[5] = array5;


        boolean[] ans = {false, false, false, false, false, true};

        for (int i = 0; i < flights.length; i++) {
            if (D) {
                System.out.println("testing matrix and tour #" + (i + 1) + " which are:\n" + matrixToString(flights[i]) + "\nand the tour: " + arrayToString(tours[i]));
            }
            input = Assignment2.hasLegalSteps(flights[i], tours[i]);
            check = input == ans[i];
            if (!check) {
                if (!D) {
                    System.out.println("testing matrix and tour #" + (i + 1) + " which are:\n" + matrixToString(flights[i]) + "\nand the tour: " + arrayToString(tours[i]));
                }
                fail();
                flag = true;
                System.out.println("the input should get you " + ans[i] + " but yours is: " + input);
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static void t7(boolean D) {
        System.out.println("checking Task7: ");
        boolean flag = false;
        boolean input;
        boolean check;
        boolean[][][] flights = new boolean[7][][];
        int[][] tours = new int[7][];

        boolean[][] matrix0 = {{false, true, true},
                {true, false, false},
                {true, false, false}};
        flights[0] = matrix0;
        flights[1] = matrix0;
        flights[2] = matrix0;
        boolean[][] matrix1 = {{false, true, true, true},
                {true, false, true, true},
                {true, true, false, false},
                {true, true, false, false}};
        flights[3] = matrix1;
        flights[4] = matrix1;
        flights[5] = matrix1;
        flights[6] = matrix1;

        int[] array0 = {0, 1, 2};//false
        tours[0] = array0;
        int[] array1 = {1, 0, 2};//false
        tours[1] = array1;
        int[] array2 = {2, 1, 0};//false
        tours[2] = array2;
        int[] array3 = {3, 2, 1, 0};//false
        tours[3] = array3;
        int[] array4 = {3, 1, 0, 2};//false
        tours[4] = array4;
        int[] array5 = {3, 0, 2, 1};//false
        tours[5] = array5;
        int[] array6 = {0, 3, 1, 2};//true
        tours[6] = array6;

        boolean[] ans = {false, false, false, false, false, true, true, true};

        for (int i = 0; i < flights.length; i++) {
            if (D) {
                System.out.println("testing matrix and tour #" + (i + 1) + " which are:\n" + matrixToString(flights[i]) + "\nand the tour: " + arrayToString(tours[i]));
            }
            input = Assignment2.hasLegalSteps(flights[i], tours[i]);
            check = input == ans[i];
            if (!check) {
                if (!D) {
                    System.out.println("testing matrix and tour #" + (i + 1) + " which are:\n" + matrixToString(flights[i]) + "\nand the tour: " + arrayToString(tours[i]));
                }
                fail();
                flag = true;
                System.out.println("the input should get you " + ans[i] + " but yours is: " + input);
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static void t8(boolean D) {
        System.out.println("checking Task8: ");
        boolean flag = false;
        int[] input;
        boolean check;
        int[][] ans = new int[4][];
        int[] ns = { 1, 2, 3,4};

        int[] array0 = {0};
        ans[0] = array0;
        int[] array1 = {0, 1};
        ans[1] = array1;
        int[] array2 = {0, 1, 2};
        ans[2] = array2;
        int[] array3 = {0, 1, 2, 3};
        ans[3] = array3;

        for (int i = 0; i < ans.length; i++) {
            if (D) System.out.println("testing #" + (i + 1) + ", n:" + ns[i] + " generating perm:");
                input = Assignment2.createFirstPerm(ns[i]);
                if(D){System.out.println(arrayToString(input));}
                check = CS(arrayToString(input), arrayToString(ans[i]));
                if (!check) {
                    if (!D) {
                        System.out.println("testing #" + (i + 1) + ", n:" + ns[i] + " generating perm:"+arrayToString(input));
                        space();
                    }
                    fail();
                    flag = true;
                    System.out.println("the input should get you " + arrayToString(ans[i]) + " but yours is: " + arrayToString(input));
                    space();
                } else if (D) {
                    good();
                    space();
                }
            }
            if (!flag & !D)
                good();
            space();
        }
    private static void t9(boolean D) {
        System.out.println("checking Task9: ");
        boolean flag = false;
        int input;
        boolean check;
        int[] ns = {1,2, 3, 4, 5,6};
        int[] ans ={1,2,6,24,120,720};

        for (int i = 0; i < ns.length; i++) {
            if (D) System.out.println("testing #" + (i + 1) + ", n:" + ns[i] + " generating factor:");
            input = Assignment2.factorial(ns[i]);
            if(D){System.out.println(input);}
            check = input==ans[i];
            if (!check) {
                if (!D) {
                    System.out.println("testing #" + (i + 1) + ", n:" + ns[i] + " generating factor:"+input);
                    space();
                }
                fail();
                flag = true;
                System.out.println("the input should get you " + ans[i] + " but yours is: " + input);
                space();
            } else if (D) {
                    good();
                    space();
                }
            }
            if (!flag & !D)
                good();
            space();
        }
    private static void t10(boolean D) {
        System.out.println("checking Task10: ");
        boolean flag = false;
        int[] input;
        boolean check;
        int[][] inputs = {{1,2, 3, 4, 5,6},{6,4,2,3,1,0},{1},{3,-241233,555},{0,0,-2,0,1,0,0,0}};
        int[][] ans = {{1,2, 3, 4, 5,6},{6,4,2,3,1,0},{1},{3,-241233,555},{0,0,-2,0,1,0,0,0}};
        int[][] dests=new int[5][];
        for (int i = 0; i < ans.length; i++) {
            if (D) System.out.println("testing #" + (i + 1) + ", array:" + ans[i]);
            dests[i]=new int[ans[i].length];
            Assignment2.copyArray(inputs[i],dests[i]);
            check = CS(arrayToString(dests[i]), arrayToString(ans[i]));
            if (!check) {
                if (!D) {
                    System.out.println("testing #" + (i + 1) + ", array:" + ans[i]);
                    space();
                }
                fail();
                flag = true;
                System.out.println("the input should get you " + arrayToString(ans[i]) + " but yours is: " + arrayToString(dests[i]));
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static void t11(boolean D) {
        System.out.println("checking Task11: ");
        boolean flag = false;
        int[] input;
        boolean check;
        int[] MI = {2,1,0,1};

        int[] perm0 = {0,1,2,3};
        int[] perm1 = {-5,10,13,-1};
        int[] perm2 = {1,2,3};
        int[] perm3 = {-2,2};
        int[][] perm ={perm0,perm1,perm2,perm3};

        int[] perm01 = {0,1,2,3};
        int[] perm11 = {-5,10,13,-1};
        int[] perm21 = {1,2,3};
        int[] perm31 = {-2,2};
        int[][] perms ={perm01,perm11,perm21,perm31};

        int[] d0 = {1,1,1,-1};
        int[] d1 = {1,-1,1,-1};
        int[] d2 = {1,-1,1};
        int[] d3 = {1,-1};
        int[][] dire ={d0,d1,d2,d3};

        int[] d01 = {1,1,1,-1};
        int[] d11 = {1,-1,1,-1};
        int[] d21 = {1,-1,1};
        int[] d31 = {1,-1};
        int[][] dires={d01,d11,d21,d31};

        int[][] ans0 = {{0,1,3,2},{1,1,-1,1}};
        int[][] ans1 = {{10,-5,13,-1},{-1,1,1,-1}};
        int[][] ans2 = {{2,1,3},{-1,1,1}};
        int[][] ans3 = {{2,-2},{-1,1}};
        int[][][] ans = {ans0,ans1,ans2,ans3};

        for (int i = 0; i < ans.length; i++) {
            if (D) System.out.println("testing #" + (i + 1) + ", mobileIndex:" + MI[i] + " , perm:"+arrayToString(perm[i])+ " , dire:"+arrayToString(dire[i]));
            Assignment2.swap(perm[i],dire[i],MI[i]);
            check = CS(arrayToString(perm[i]), arrayToString(ans[i][0])) && CS(arrayToString(dire[i]), arrayToString(ans[i][1]));
            if (!check) {
                if (!D) {
                    System.out.println("testing #" + (i + 1) + ", mobileIndex:" + MI[i] + " , perm:"+arrayToString(perms[i])+ " , dire:"+arrayToString(dires[i]));
                    space();
                }
                fail();
                flag = true;
                System.out.println("the input should get you perm:"+arrayToString(ans[i][0])+ " , dire:"+arrayToString(ans[i][1]) + " but yours are: perm:"+arrayToString(perm[i])+ " , dire:"+arrayToString(dire[i]));
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static void t12(boolean D) {
        System.out.println("checking Task12: ");
        boolean flag = false;
        int[] input;
        boolean check;
        int[] ME = {0,5,-10,15};

        int[] perm0 = {0,1,2,3};
        int[] perm1 = {-5,10,13,-1};
        int[] perm2 = {1,-20,-3};
        int[] perm3 = {-2,2};
        int[][] perm ={perm0,perm1,perm2,perm3};

        int[] d0 = {1,1,1,-1};
        int[] d1 = {1,-1,1,-1};
        int[] d2 = {1,-1,1};
        int[] d3 = {1,-1};
        int[][] dire ={d0,d1,d2,d3};

        int[] ans0 = {1,-1,-1,1};
        int[] ans1 = {1,1,-1,-1};
        int[] ans2 = {-1,-1,-1};
        int[] ans3 = {1,-1};
        int[][] ans = {ans0,ans1,ans2,ans3};

        for (int i = 0; i < ans.length; i++) {
            if (D) System.out.println("testing #" + (i + 1) + ", mobileElement:" + ME[i] + " , perm:"+arrayToString(perm[i])+ " , dire:"+arrayToString(dire[i]));
            Assignment2.reverseDirections(perm[i],dire[i],ME[i]);
            check = CS(arrayToString(dire[i]), arrayToString(ans[i]));
            if (!check) {
                if (!D) {
                    System.out.println("testing #" + (i + 1) + ", mobileIndex:" + ME[i] + " , perm:"+arrayToString(perm[i])+ " , dire:"+arrayToString(dire[i]));
                    space();
                }
                fail();
                flag = true;
                System.out.println("the input should get you dire:"+arrayToString(ans[i]) + " but yours is: "+arrayToString(dire[i]));
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static void t13(boolean D) {
        System.out.println("checking Task13: ");
        boolean flag = false;
        int input;
        boolean check;

        int[] perm0 = {0,1,2,3};
        int[] perm1 = {5,10,13,1};
        int[] perm2 = {100,20,3};
        int[] perm3 = {2,2};
        int[][] perm ={perm0,perm1,perm2,perm3};

        int[] d0 = {1,1,1,-1};
        int[] d1 = {1,-1,1,-1};
        int[] d2 = {1,-1,1};
        int[] d3 = {1,-1};
        int[][] dire ={d0,d1,d2,d3};

        int[] ans = {3,2,0,-1};

        for (int i = 0; i < ans.length; i++) {
            if (D) System.out.println("testing #" + (i + 1) +" , perm:"+arrayToString(perm[i])+ " , dire:"+arrayToString(dire[i]));
            input=Assignment2.findMobileIndex(perm[i],dire[i]);
            check = input==ans[i];
            if (!check) {
                if (!D) {
                    System.out.println("testing #" + (i + 1) +" , perm:"+arrayToString(perm[i])+ " , dire:"+arrayToString(dire[i]));
                    space();
                }
                fail();
                flag = true;
                System.out.println("the input should get you:"+ans[i] + " but yours is: "+input);
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static boolean checker14(int[][] input,boolean[] checker,String[] ans) {
        for(int i=0;i<input.length;i++) {
            String s=arrayToString(input[i]);
            for (int j = 0; j < ans.length; j++)
                if (CS(s,ans[j])) {
                    checker[i] = true;
                    ans[j]="c";
                }
            if(!checker[i])
                return false;
        }
        return true;
    }
    private static void t14(boolean D) {
        System.out.println("checking Task14: ");
        boolean flag = false;
        int[][] input;
        boolean check;
        int[] ns = {2,3,4};


        String[][] ans = new String[3][];
        String[] ans0={"{0,1}","{1,0}"};
        ans[0]=ans0;
        String[] ans1={"{0,1,2}","{0,2,1}","{1,2,0}","{1,0,2}","{2,0,1}","{2,1,0}"};
        ans[1]=ans1;
        String[] ans2={"{0,1,2,3}","{0,1,3,2}","{0,2,1,3}","{0,2,3,1}","{0,3,1,2}","{0,3,2,1}",
                      "{1,0,2,3}","{1,0,3,2}","{1,2,0,3}","{1,2,3,0}","{1,3,0,2}","{1,3,2,0}",
                      "{2,0,1,3}","{2,0,3,1}","{2,1,0,3}","{2,1,3,0}","{2,3,0,1}","{2,3,1,0}",
                      "{3,0,1,2}","{3,0,2,1}","{3,1,0,2}","{3,1,2,0}","{3,2,0,1}","{3,2,1,0}"};
        ans[2]=ans2;

        String[][] ansc = new String[3][];
        String[] ans0c={"{0,1}","{1,0}"};
        ansc[0]=ans0c;
        String[] ans1c={"{0,1,2}","{0,2,1}","{1,2,0}","{1,0,2}","{2,0,1}","{2,1,0}"};
        ansc[1]=ans1c;
        String[] ans2c={"{0,1,2,3}","{0,1,3,2}","{0,2,1,3}","{0,2,3,1}","{0,3,1,2}","{0,3,2,1}",
                "{1,0,2,3}","{1,0,3,2}","{1,2,0,3}","{1,2,3,0}","{1,3,0,2}","{1,3,2,0}",
                "{2,0,1,3}","{2,0,3,1}","{2,1,0,3}","{2,1,3,0}","{2,3,0,1}","{2,3,1,0}",
                "{3,0,1,2}","{3,0,2,1}","{3,1,0,2}","{3,1,2,0}","{3,2,0,1}","{3,2,1,0}"};
        ansc[2]=ans2c;

        boolean[][] checker = new boolean[3][];
        boolean[] checker0 = {false,false};
        boolean[] checker1 = {false,false,false,false,false,false};
        boolean[] checker2 = {false,false,false,false,false,false,
                            false,false,false,false,false,false,
                            false,false,false,false,false,false,
                            false,false,false,false,false,false};
        checker[0]=checker0;
        checker[1]=checker1;
        checker[2]=checker2;


        for (int i = 0; i < ans.length; i++) {
            if (D) {System.out.println("testing #" + (i + 1) + " n: " + ns[i]+ " creating perm:");}
            input = Assignment2.generatePermutations(ns[i]);
            if(D){System.out.println(matrixToString(input));}
            check = (input.length==ans[i].length) && (checker14(input,checker[i],ans[i]));
            if (!check) {
                if (!D) {
                    System.out.println("testing #" + (i + 1) + " n: " + ns[i]+ " creating perm:"+matrixToString(input));
                    space();
                }
                fail();
                flag = true;
                System.out.println("the input should get you all the the arrays in here: " + arrayToString(ansc[i]) + " but yours is: " + matrixToString(input));
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static void t15(boolean D) {
        System.out.println("checking Task15: ");
        boolean flag = false;
        int[] input;
        boolean check;

        boolean[][] flights0 = {{false, true},
                {true, false}};//0,1
        boolean[][] flights1 = {{false, true, true},
                {true, false, true},
                {true, true, false}};//0,1,2 / 0,2,1
        boolean[][] flights2 = {{false, false, true},
                {false, false, true},
                {true, true, false}};//null
        boolean[][] flights3 = {{false, true, true, true},
                {true, false, true, true},
                {true, true, false, false},
                {true, true, false, false}};//0,2,1,3 / 0,3,1,2
        boolean[][] flights4 = {{false, true, false, true,false},
                {true, false, false, false,true},
                {false, false, false, true,true},
                {true, false, true, false,false},
                {false, true, true, false,false}};//0,1,4,2,3 / 0,3,2,4,1
        boolean[][][] flights ={flights0,flights1,flights2,flights3,flights4};
        int[][] ans1={{0,1},{0,1,2},null,{0,2,1,3},{0,1,4,2,3}};
        int[][] ans2={{0,1},{0,2,1},null,{0,3,1,2},{0,3,2,4,1}};

        for (int i = 0; i < flights.length; i++) {
            if (D) {
                System.out.println("testing matrix #" + (i + 1) + " flight: " + matrixToString(flights[i]));
                space();
            }
            input = Assignment2.solve(flights[i]);
            check = (input==null && ans1==null)||CS(arrayToString(input),arrayToString(ans1[i])) || CS(arrayToString(input),arrayToString(ans2[i]));
            if (!check) {
                if (!D) {
                    System.out.println("testing matrix #" + (i + 1) + " flight: " + matrixToString(flights[i]));
                    space();
                }
                fail();
                flag = true;
                System.out.println("the input should get you " + arrayToString(ans1[i]) + " or "+arrayToString(ans2[i])+" but yours is: " + arrayToString(input));
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }
    private static void t16(boolean D) {
        System.out.println("checking Task16: ");
        boolean flag = false;
        boolean input;
        boolean check;

        boolean[][] flights0 = {{false, true},
                {true, false}};//0,1
        boolean[][] flights1 = {{false, true, true},
                {true, false, true},
                {true, true, false}};//0,1,2 / 0,2,1
        boolean[][] flights2 = {{false, false, true},
                {false, false, true},
                {true, true, false}};//null
        boolean[][] flights3 = {{false, true, true, true},
                {true, false, true, true},
                {true, true, false, false},
                {true, true, false, false}};//0,2,1,3 / 0,3,1,2
        boolean[][] flights4 = {{false, true, false, true,false},
                {true, false, false, false,true},
                {false, false, false, true,true},
                {true, false, true, false,false},
                {false, true, true, false,false}};//0,1,4,2,3 / 0,3,2,4,1
        boolean[][] flights5 = {{false, true, false, true,true},
                {true, false, true, false,true},
                {false, true, false, true,true},
                {true, false, true, false,false},
                {true, true, true, false,false}};//0,4,1,2,3 / 0,3,2,4,1

        boolean[][][] flights ={flights0,flights1,flights2,flights3,flights4,flights5};
        boolean[] ans = {false,false,false,false,false,true};

        for (int i = 0; i < flights.length; i++) {
            if (D) {
                System.out.println("testing matrix #" + (i + 1) + " flight: " + matrixToString(flights[i]));
                space();
            }
            input = Assignment2.solve2(flights[i]);
            check = input==ans[i];
            if (!check) {
                if (!D) {
                    System.out.println("testing matrix #" + (i + 1) + " flight: " + matrixToString(flights[i]));
                    space();
                }
                fail();
                flag = true;
                System.out.println("the input should get you " +ans[i]+" but yours is: " + input);
                space();
            } else if (D) {
                good();
                space();
            }
        }
        if (!flag & !D)
            good();
        space();
    }

}
