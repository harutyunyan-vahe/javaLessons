public class Lesson2 {

    public static void main(String[] args) {


//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println(6);
//        System.out.println(7);

//        int d = 5;
//        d =  d - 1;// d -= 12; d--;
//        System.out.println(d);// 4


//        for(int a = 1; a <= 4; a++){
//            System.out.println(a);
//            System.out.println("Hello ");
//        }

//        for (int a = 100; a > 0; a--) {
//            System.out.println("Test " + a);
//        }

//        int a = 100;
//        while ( a > 0){
//            System.out.println("Test " + a);
//
//            a--;
//        }

//        int t = 1;
//        while (t < 100) {
//            System.out.println(t);
//            t--;
//        }
//
//
//
//        System.out.println("end");

//
//        int d = 4;
//
//        d += 2;
////        d = d + 2;
//
//        d += 1;
//        // d = d + 1;
//
//        d++; // d += 1, d = d + 1


//        for (int i = 0; i < 100; i++) {
//
//        }


//        printOddNumbers(1_000_000);
        //printNumbersWithFor(18, 10);

        //10, 1 2 5 10
        //15, 1 3 5 15
        //20, 1 2 4 5 10 20, 11, 12, 13, 14, 15,  20

//        printBajEffectiv(20_000_000);
        int c = getBajCount(100_000_000);
        System.out.println(c);

        isParz(8);


        boolean t = true; // false /.. 3, "vahe" .
        boolean tRev = !t;
        System.out.println(t);
        System.out.println(tRev);
//        boolean bbb = c == 999;
//        ///System.out.println(bbb);
//        if (bbb) {
//            System.out.println("Duq shahel eq");
//        } else{
//
//        }

        boolean b = isParzNumber(17);
        System.out.println(b);

        if(b){
            System.out.println("ays tivey parz e");
        }
    }


    static boolean isParzNumber(int n) {
        int count = getBajCount(n);
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    static void isParz(int n) {
        int count = getBajCount(n);
        if (count == 2) {
            System.out.println("Tiv@ parz e");
        } else {
            System.out.println("Tivey parz che");
        }
    }

    static int getBajCountEffctive(int n) {
        int count = 1;
        for (int i = 1; i <= n / 2; i++) {

            if (n % i == 0) {
//                count = count + 1;
                count++;
            }
        }

        return count;
    }

    static int getBajCount(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
//                count = count + 1;
                count++;
            }
        }
        return count;
    }

    static void printBajEffectiv(int n) {
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {// ete aranc mnacrot bajanvuma tvin, ayd depqum bajanarara
                System.out.println(i);
            }
        }
        System.out.println(n);
    }

    static void printBaj(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {// ete aranc mnacrot bajanvuma tvin, ayd depqum bajanarara
                System.out.println(i);
            }
        }
    }

    static void printOddNumbers(int n) {
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) { // ete tivy kenta
                System.out.println(i);
            }
        }
    }

    static void printEvenNumbers(int n) {
        for (int i = 2; i <= n; i++) {

            if (i % 2 == 0) { // ete tivy zug e
                System.out.println(i);
            }
        }
    }

    static void printNumbersWithWhile(int start, int end) {
        int i = start;
        while (i <= end) {
            System.out.println(i);
            i++;
        }
    }

    static void printNumbersWithFor(int start, int end) {

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    static void printNumbersWithForWithValidation(int start, int end) {

        if (start >= end) {
            System.out.println("Wrong input values start = " + start + " end=" + end + "start should be < end");
        } else {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }

    }

    static void printNumberWithFor(int g) {

        for (int i = 1; i <= g; i++) {
            System.out.println(i);
        }

    }

    static void printNumberWithWhile(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }


    public static int max(int a, int b, int c, int d) {
        int m = a;

        if (b > m) {
            m = b;
        }

        if (c > m) {
            m = c;
        }
        if (d > m) {
            m = d;
        }
        return m;
    }

}
