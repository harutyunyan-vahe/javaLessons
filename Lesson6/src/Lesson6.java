public class Lesson6 {

    public static void main(String[] args) {
        int[] myArray = new int[5];

        myArray[0] = 5;
        myArray[1] = 20;
        myArray[2] = 333;
        myArray[3] = 9;
        myArray[4] = 11;

//        int[] neg = negateArray(myArray);
//        printArray(neg);
//        System.out.println("-----------");
//        printArray(myArray);

//        printArray(myArray);
//        System.out.println("--------------------");
//        int[] revers = reversArray(myArray);
//        printArray(revers);

//        for (int i = 0; i < neg.length; i++) {
//            System.out.println(neg[i]);
//        }
//        System.out.println(neg);
        //int[] a = -myArray[0];


//        printArray(myArray);
//        int s = sumOfArray(myArray);
//        System.out.println(s);

//        int m = maxOfArray(myArray);
//        System.out.println(m);

//        int s = sumOfPrimes(myArray);
//        System.out.println(s);
//        int c = countOfOddElements(myArray);
//        System.out.println(c);

        int count = countOfRangeElements(myArray, 10, 20);
        System.out.println(count);
    }

    // [ 6 , 7 , -8]  [ -6, -7, 8]

    static boolean isPrime(int n) {
        // boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
//                isPrime = false;
//                break;
                return false;
            }
        }
        return true;
//        return isPrime;
    }

    static int[] negateArray(int[] arr) {

        int[] negativ = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            negativ[i] = -1 * arr[i]; //- 2 * arr[i];
        }

        return negativ;
    }


    static int max(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        return max;
    }

    static int maxOfArray(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int sumOfArray(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        return result;
    }

    static void printArray(int[] arr) {
        System.out.print(" [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println(" ] ");
    }


    static void printNumber(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

    static int fibonaci(int n) {

        if (n < 2) {
            return 1;
        }

        int first = 0;
        int second = 1;
        int result = 0;
        for (int i = 2; i < n; i++) {
            result = first + second;

            first = second;
            second = result;
        }
        return result;
    }

    static int fiboRec(int n) {

        if (n <= 2) {
            return 1;
        }
        return fiboRec(n - 1) + fiboRec(n - 2);
    }

    static int bigDivider(int a, int b) {
        if (a == b) {
            return a;
        }
        while (a != 0) {
            int m = a;
            a = b % a;
            b = m;
        }
        return b;
    }


    // [99,5,8,16] ,  [16, 8, 5, 99]
    //  0  1 2  3      0  1 2 3


    static int[] reversArray(int[] myArray) {
        int[] reversArr = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            reversArr[i] = myArray[myArray.length - 1 - i];
        }
        return reversArr;
    }

    // [ 5, 7 , 10]

    static int sumOfPrimes(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = isPrime(arr[i]);
            if (isPrime) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    static int countOfOddElements(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    // [150, 8, 101, 130, 110] , start = 100 ,end = 250 should return  4
    static int countOfRangeElements(int[] arr, int start, int end) {
        int count = 0;
//        for (int i = start; i <= end; i++) {
//            count++;
//        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= start && arr[i] <= end) {
                count++;
            }
        }
        return count;

    }

}
