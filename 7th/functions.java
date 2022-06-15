import java.util.*; 

public class functions {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // String str = scn.nextLine(); // nextLine will take entire string
        // System.out.println("Input String is: " + str);

        // String str1 = scn.next(); // next will take only string till first space
        // encounter.
        // System.out.println("Input String is: " + str1);

        public static boolean isOdd(int n) {
            if(n % 2 == 0)
                return false;
            else
                return true;
        }

        public static boolean isEven(int n) {
            if(n % 2 == 0)
                return true;
            else
                return false;
        } 

        public static boolean isPrime(int n) {
            for(int i = 2; i < n; i++) {
                if(n % i == 0)
                    return false;
            }
            return true;
        }

        public static int getFactorial(int n) {
            int fact = 1;
            for(int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }

        public static int getFibonacci(int n) {
            int fib = 0;
            int fib1 = 1;
            int fib2 = 0;
            for(int i = 0; i < n; i++) {
                fib = fib1 + fib2;
                fib2 = fib1;
                fib1 = fib;
            }
            return fib;
        }

        public static int getGcd(int a, int b) {
            if(b == 0)
                return a;
            else
                return getGcd(b, a % b);
        }


        public static void printStatement(String str) {
            System.out.println(str);
        }

        public static void printStatement(int n) {
            System.out.println(n);
        }

        public static void printStatement(double n) {
            System.out.println(n);
        }

        public static void printStatement(boolean b) {
            System.out.println(b);
        }

        public static void printStatement(char c) {
            System.out.println(c);
        }

        public static void printStatement(float f) {
            System.out.println(f);
        }

        public static void printStatement(long l) {
            System.out.println(l);
        }

        public static void printStatement(short s) {
            System.out.println(s);
        }

        public static void printStatement(byte b) {
            System.out.println(b);
        }

        public static void printStatement(Object obj) {
            System.out.println(obj);
        }

        public static void printStatement(char[] ch) {
            System.out.println(ch);
        }

        public static int add(int a, int b) {
            a = scn.nextInt();
            b = scn.nextInt();
            return a + b;
        }

        public static int subtract(int a, int b) {
            a = scn.nextInt();
            b = scn.nextInt();
            return a - b;
}

        public static int multiply(int a, int b) {
            a = scn.nextInt();
            b = scn.nextInt();
            return a * b;
        }

        public static int divide(int a, int b) {
            a = scn.nextInt();
            b = scn.nextInt();
            return a / b;
        }

        public static int modulus(int a, int b) {
            a = scn.nextInt();
            b = scn.nextInt();
            return a % b;
        }

        public static int power(int a, int b) {
            a = scn.nextInt();
            b = scn.nextInt();
            return (int)Math.pow(a, b);

        }

public static void main(String[] args) {
    
}