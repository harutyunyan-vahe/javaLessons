public class Lesson4 {


    public static void main(String[] args) {


//        printDigits(15668);
//        System.out.println(18859 / 10);
//        System.out.println(revers(15626));

//        int s = sumNumbers(5);
//        System.out.println(s);

//        boolean k = isAdalt(55);
//        System.out.println(k);
//        int r = revers(156);
//        System.out.println(r);

        String w = getWeekDay(2);
        System.out.println(w);


    }


    static String getWeekDay(int n) {

        String weekDay = "";

        switch (n) {
            case 1:
                weekDay = "erkushapti";
                break;

            case 2:
                weekDay = "eregshapt";
                break;

            case 3:
                weekDay = "chorpat";
                System.out.println("test");
                break;
            case 4:
                weekDay = "hignahs";
                break;

            default:
                weekDay = "sxal arje";
                break;

        }

        return weekDay;

//
//        if (n == 1) {
//            weekDay = "erkushapti";
//        }
//
//        if (n == 2) {
//            weekDay = "eregshapt";
//        }
//
//        if (n == 3) {
//            weekDay = "chorpat";
//        }
//
//        if (n == 4) {
//            weekDay = "hignahs";
//        }
//        if (n == 5) {
//            weekDay = "sab";
//        }
//        if (n == 6) {
//            weekDay = "kiraki";
//        }
//        if (n == 7) {
//            weekDay = "kiraki2";
//        }

//        if(n >= 7){
//            weekDay = "sxal arj";
//        }
//
//        return weekDay;


    }


    static boolean isAdalt(int n) {

        if (n > 18) {
            return true;
        } else {
            return false;
        }
    }


    static int sumNumbers(int n) {
        int s = 0;

        for (int i = 1; i <= n; i--) {
            s = s + i;
        }

        return s;
    }


    //151
    //1551
    //12221
    static boolean isPolindrom(int n) {
        int rev = revers(n);

//        boolean b = rev == n;
//        return b;

//        return rev == n;
        return rev == n;
    }

    //156
    static int revers(int n) {
        int revers = 0;

        while (n != 0) {
            int rem = n % 10;
            System.out.println("rem is " + rem);
            revers = revers * 10 + rem;
            n = n / 10;
        }
        return revers;
    }

    static boolean isPrime(int n) {

//        boolean t = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
//                t = false;
//                break;
                return false;
            }
        }
        return true;
    }

    //156
    static void printDigits(int n) {
        n = revers(n);
        while (n != 0) {
            int d = n % 10;
            System.out.println(d);
            n = n / 10;
        }

    }

}
