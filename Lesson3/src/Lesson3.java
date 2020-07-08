public class Lesson3 {


    public static void main(String[] args) {

//        int a = powOf2(4);
//
//        System.out.println(a); // 16
//
//        printHello(3);
//        int r = powOf(4, 0);// 64
//        System.out.println(r);

//        int a = 3;


//        for (int i = 3; i < 100; i++) {
//
//        }
//        boolean p = isPrime(18);
//        System.out.println(p);



//        for (int i = 20; i < 100; i++) {
//
//            System.out.println("hello");
//            if (isPrime(i)) {
////                break;
//                continue;
//            }
//            System.out.println(i);
//
//
//        }
//        System.out.println("end");

        //printPrimeByRange(20, 100);
        int s = sumOfBaj(15);

        if (s > 100) {
            System.out.println("hello world");
        } else {
            System.out.println("error");
        }
      //  System.out.println(s);
//        System.out.println(t);
    }


    // 15 // 2 3 4 5 6 7 8
    static boolean isPrime(int n) {
//        int baj = getBajCout(n);
//        if (baj == 2) {
//            return true;
//        } else {
//            return false;
//        }

        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    //1568798984
    //20 . 1 2 4 5 10 11 12

    static int getBajCout(int n) {
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    static void printHello(int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.println("Hello");
//        }

        int i = 0;
        while (i < n) {
            System.out.println("Hello");
            i++;
        }

    }

    static int powOf2(int n) {
        int result = 1;

        //1 * 2 * 2 * 2 * 2
        for (int i = 1; i <= n; i++) {
            result = result * 2;
        }
        return result;
    }

    static int powOf(int a, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * a;
        }
        return result;
    }
// printPrimeByRange(2, 999);
    static void printPrimeByRange(int start, int end) {

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // 8 , 1 2, 4 8 == 15

    static int sumOfBaj(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i; // sum = sum + i;
            }
        }
        return sum;
    }

}
