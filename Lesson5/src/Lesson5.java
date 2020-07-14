public class Lesson5 {


    public static void main(String[] args) {

        // zangvac , armenia
        // masiv , russian
        // arrary, english

//        int a = 4;
//        double d = 2.4;
//
//        String k = "vahe";
//
//        int[] myArray = new int[10];
//
//        myArray[0] = 4; // int a = 4
//        myArray[1] = 9; // int b  = 9
//        myArray[2] = 10; // int c  = 10
//        myArray[3] = -5; // int d = -5
//
//        System.out.println(myArray[0]);
//        System.out.println(myArray[1]);
//        myArray[1] = 88;// b = 88
//        System.out.println(myArray[1]);
//
//        System.out.println(myArray[65]);

        int[] salaryArray = new int[4_000];

        System.out.println(salaryArray.length);

//        salaryArray[0] = 68_000;
//        salaryArray[1] = 68_000;
//        salaryArray[2] = 68_000;
//        salaryArray[3] = 68_000;
//        salaryArray[4] = 68_000;
//        //.....
//        salaryArray[999] = 68_000;


        for (int i = 0; i < salaryArray.length; i++) {
            salaryArray[i] = 68_000;
        }


//        System.out.println(salaryArray[0]);
//        System.out.println(salaryArray[1]);
//        System.out.println(salaryArray[2]);
//        System.out.println(salaryArray[3]);
//        for (int i = 0; i < salaryArray.length; i++) {
//            System.out.println("index " + i + " havasar e  " + salaryArray[i]);
//        }
        printArray(salaryArray);


    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    //5! = 5 * 4 * 3 * 2 * 1; == 5 * 4! = 5 * 4 * 3! == 5 * 4 * 3 * 2! = 5 * 4 * 3 * 2 * 1!
    //4! = 4 * 3 * 2 * 1

    // n! = n * (n-1)!
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int factorialRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialRec(n - 1);
    }

    //1 1 2 3 5 8 13 21  34  55
    //1 2 3 4 5 6 7  8  9  10 ...


    // fib (5)  = fib(4) + fib(3)
    //fib(4) = fib(3) + fib(2)
    //fib(3) = fib(2 ) + fib(1)
    static int fibonachi(int n) {
        int first = 0;
        int second = 1;

        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = first + second;

            first = second;
            second = res;
        }

        return res;
    }

    static int fibonachiRec(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonachiRec(n - 1) + fibonachiRec(n - 2);
    }

    //15 20

    //5 ,15(20 - 5)

    //5 10(15 - 5)

    //5 5(10 - 5)

    // 15  - 1 3 5 15
    // 20 - 1 2 4 5 10 20

    // 15 , (20 - 15) , 15,   5, 15, (15- 5) , 5

    // n , m == max(n, m) - min(n, m), min


    static int begestDivider(int n, int m) {
        System.out.println("n = " + n + "  m = " + m);
        if (n == m) {
            return n;
        }

        if (n > m) {
            return begestDivider(n - m, m);
        }
//        else {// m > n
        return begestDivider(m - n, n);
//        }

    }

    static int plus(int a, int b) {
        return a + b;
    }


    // 4 +  3, 1 + ( 4  +  2 ) ==  1 + 1 + 4 + 1
    static int plusRec(int a, int b) {
        System.out.println("a = " + a + "  b = " + b);
        if (b == 0) {
            return a;
        }
        return  plusRec(a + 1, b - 1);
    }
}
