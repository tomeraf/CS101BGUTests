import java.util.Scanner;

public class Main {
    private static boolean legalInput(String s)
    {
        boolean checkAll,checkDisplay;
        checkAll = CS(s,"1") | CS(s,"2") | CS(s,"3a") | CS(s,"3b") |  CS(s,"4a") | CS(s,"4b") |CS(s,"4c") |CS(s,"4d") |CS(s,"4e") |CS(s,"4f") |CS(s,"5");
        checkDisplay = CS(s,"1.0") | CS(s,"2.0") | CS(s,"3a.0") | CS(s,"3b.0") |  CS(s,"4a.0") | CS(s,"4b.0") |CS(s,"4c.0") |CS(s,"4d.0") |CS(s,"4e.0") |CS(s,"4f.0") |CS(s,"5.0");
        return checkAll || checkDisplay;
    }

    public static void main(String[] args) {
        println("created by: Tomer Cohen (aka Tomer The Tester)");
        println("for private tutoring: 0584477500");
        space();
        println("put a number from 1-5");
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
        boolean isDisplay = CS(s,"1.0") | CS(s,"2.0") | CS(s,"3a.0") | CS(s,"3b.0") |  CS(s,"4a.0") | CS(s,"4b.0") |CS(s,"4c.0") |CS(s,"4d.0") |CS(s,"4e.0") |CS(s,"4f.0") |CS(s,"5.0");
        if(isDisplay)
            s=s.substring(0,s.length()-2);

        if(CS(s,"1")|CS(s,"5")){t1(isDisplay);}
        if(CS(s,"2")|CS(s,"5")){t2(isDisplay);}
        if(CS(s,"3a")|CS(s,"5")){t3a(isDisplay);}
        if(CS(s,"3b")|CS(s,"5")){t3b(isDisplay);}
        if(CS(s,"4a")|CS(s,"5")){t4a(isDisplay);}
        if(CS(s,"4b")|CS(s,"5")){t4b(isDisplay);}
        if(CS(s,"4c")|CS(s,"5")){t4c(isDisplay);}
        if(CS(s,"4d")|CS(s,"5")){t4d(isDisplay);}
        if(CS(s,"4e")|CS(s,"5")){t4e(isDisplay);}
        if(CS(s,"4f")|CS(s,"5")){t4f(isDisplay);}
    }

    private static void t1(boolean D) {
        System.out.print("checking Task1: ");
        boolean input;
        boolean check;
        int[] a = {10,3,-2,7};
        int[] b = {4,0,2,1};
        int[] q = {2,2,3,3};
        int[] r = {1,3,-8,4};
        boolean[] ans= {false, false, true,false};

        for(int i=0;i<a.length;i++) {
            println("please type:");
            System.out.println(a[i]);
            System.out.println(b[i]);
            System.out.println(q[i]);
            System.out.println(r[i]);
            input = TasksCode.Task1();
            check= input==ans[i];
            if(!check) {
                fail();
                println("the input should get you: " + ans[i] + " but yours is" +input);
            }
            else {
                good();
                space();
            }
        }
    space();
    }
    private static void t2(boolean D) {
        System.out.print("checking Task2: ");
        int input;
        boolean check;
        int[] a = {0,0,5,-10};
        int[] b = {100,1,5,10};

        for(int i=0;i<a.length;i++) {
            println("please type:");
            System.out.println(a[i]);
            System.out.println(b[i]);
            input = TasksCode.Task2();
            check= input>=a[i] &&  input<=b[i];
            if(!check) {
                fail();
                println("the randomized number was not between: " + a[i] + " and " +b[i]);
            }
            else {
                good();
                space();
            }
        }
        space();
    }
    private static void t3a(boolean D) {
        System.out.print("checking Task3a: ");
        int input;
        boolean check;
        int[] n = {0,1,11,31};
        int[] ans = {1,2,2048,-2147483648};

        for(int i=0;i<n.length;i++) {
            println("please type:");
            System.out.println(n[i]);
            input = TasksCode.Task3a();
            check= input==ans[i];
            if(!check) {
                fail();
                println("2^"+n[i]+"="+ans[i]+ " but your answer is"+input);
            }
            else {
                good();
                space();
            }
        }
        space();
    }
    private static void t3b(boolean D) {
        System.out.print("checking Task3b: ");
        int input;
        boolean check;
        int[] n = {0,2,10,35};
        int[] k = {1,3,54,151};
        int[] ans= {0,1,52,32};

        for(int i=0;i<n.length;i++) {
            println("please type:");
            System.out.println(n[i]);
            System.out.println(k[i]);
            input = TasksCode.Task3b();
            check= input==ans[i];
            if(!check) {
                fail();
                println("2^"+n[i]+"%"+k[i]+"="+ans[i]+ "but your answer is"+input);
            }
            else {
                good();
                space();
            }
        }
        space();
    }
    private static void t4a(boolean D) {
        System.out.print("checking Task4a: ");
        boolean input;
        boolean check;
        int[] n = {0,0,5,-10};
        boolean[] ans = {true,true,true,false,false};

        for(int i=0;i<n.length;i++) {
            println("please type:");
            System.out.println(n[i]);
            input = TasksCode.Task4a();
            check= input==ans[i];
            if(!check) {
                fail();
                println("the answer to if the number "+n[i]+ "is prime is "+ans[i]+", but your answer is: "+input);
            }
            else {
                good();
                space();
            }
        }
        space();
    }
    private static void t4b(boolean D) {
        System.out.print("checking Task4b: ");
        int input;
        boolean check;
        int[] n = {2,3,4,10};
        int[] ans = {1,2,2,4};

        for(int i=0;i<n.length;i++) {
            println("please type:");
            System.out.println(n[i]);
            input = TasksCode.Task4b();
            check= input==ans[i];
            if(!check) {
                fail();
                println("the amount of prime number less or equal to "+ n[i]+ " is "+ans[i]+", but your answer is"+ input);
            }
            else {
                good();
                space();
            }
        }
        space();
    }
    private static void t4c(boolean D) {
        System.out.print("checking Task4c: ");
        boolean input;
        boolean check;
        int[] a = {3,2,4,3,20,10};
        int[] n = {5,6,31,57,56,99};
        boolean[] ans={true,false,true,false,true,true};

        for(int i=0;i<a.length;i++) {
            println("please type:");
            System.out.println(a[i]);
            System.out.println(n[i]);
            input = TasksCode.Task4c();
            check= input==ans[i];
            if(!check) {
                fail();
                println("a="+a[i]+" and n="+n[i]+" should be "+ans[i]+ ", but your answer is: "+ input);
            }
            else {
                good();
                space();
            }
        }
        space();
    }
    private static void t4d(boolean D) {
        System.out.print("checking Task4d: ");
        int input;
        boolean check;
        int[] a = {33,91};
        int[] ans = {1,3};
        println("please type:");
        System.out.println(a[0]);
        System.out.println(ans[0]);
        input = TasksCode.Task4d();
        println("the number should be 1 or maybe 2 and yours is :"+ input);

        println("please type:");
        System.out.println(a[1]);
        System.out.println(ans[1]);
        input = TasksCode.Task4d();
        println("the number should be 1 or maybe 2 or 3 and yours is :"+ input);
        space();
    }
    private static void t4e(boolean D) {
        System.out.print("checking Task4e: ");
        boolean input;
        boolean check;
        int[] n = {2,3,7,15,48,9547};
        boolean[] ans = {true,true,true,false,false,true};

        for(int i=0;i<n.length;i++) {
            println("please type:");
            System.out.println(n[i]);
            input = TasksCode.Task4e();
            check= input==ans[i];
            if(!check) {
                fail();
                println("is the number "+ n[i] + " answer is " +ans[i]+", but your answer is"+ input);
            }
            else {
                good();
                space();
            }
        }
        space();
    }
    private static void t4f(boolean D) {
        System.out.print("checking Task4f: ");
        int input;
        boolean check;
        int[] x = {2,2000,3};
        int[] y = {10,2022,3};
        int[] ans1 ={2,3,5,7};
        int[] ans2 = {2003,2011,2017};
        int[] ans3 = {3};
        int[][] ans={ans1,ans2,ans3};
        for(int i=0;i<ans.length;i++) {
            println("please type:");
            System.out.println(x[i]);
            System.out.println(y[i]);
            input = TasksCode.Task4f();
            check=false;
            int j=0;
            while(!check ||j<ans[i].length)
            {
                if(input==ans[i][j])
                    check=true;
                else
                    j++;
            }

            if(!check) {
                fail();
                println("the number "+input+" that was selected  between: " + x[i] + " and " +y[i]+ "was not prime");
            }
            else {
                good();
                space();
            }
        }
        space();
    }

    private static void fail() {
        System.out.println();
        System.out.print("fail: ");
    }
    private static void good() {

        System.out.println("good");
    }



    public static void println(String message){ThePrinter(message,25);}
    public static  void space(){System.out.println();}
    public static void ThePrinter(String message, int speed) {//print at a reduced speed
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            System.out.print(message.charAt(i));
            try {
                Thread.sleep(speed); // Sleep 100= 100ms (0.1 seconds)
            }
            catch(InterruptedException ex){}
        }
        space();
    }
    public static boolean CS(String s1,String s2) {
        return s1.equalsIgnoreCase(s2);
    }

}