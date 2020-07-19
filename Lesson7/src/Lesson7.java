public class Lesson7 {

    public static void main(String[] args) {

//        int[] a = fillArray(10, 500);// [500, 500, 500, 500]
//        printArray(a);

//        int[] k = new int[4];
//
//        k[0] = 4;
//        k[1] = 2;
//        k[2] = 55;
//        k[3] = 88;

//        int[] k = new int[]{4, 2, 55, 88};
        int[] a = {4, 5, 44, 3, 55};
        int[] b = {5, 7, 9, 44, 11};


        //      {5, 7, 44, 44, 55}

        // {4, 2, 55, 88, 55, 5, 7, 9}

//        int[] arr = merge(a, b);
//        printArray(arr);
//        printArrayRevers(k);
        //

//        int last = getLastElement(k);
//        System.out.println(last);
//        int[] c = sumOfArray(a, b);
//        printArray(c);

//        printArray(a);
//        makeArrayEven(a);
//        printArray(a);
//
        // 5 4 9 10 22 1
        // 4 5 9 10 1 22

        // 4 5 9 1 10 22
        // 4 5 1 9 10 22
        // 4 1 5 9 10 22
        // 1 4 5 9 10 22


        int[] k = {5, 4, 9, 10, 22, 1};
        bubbleSort(k);
        printArray(k);

//        int x = 6;
//        int y = 55;
//
//        int temp = x;
//        x = y;
//        y = temp;


    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // System.out.println("hello ");
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    static void makeArrayEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i]++;
            }
        }
    }


    static int[] maxOfArray(int[] a, int[] b) {
        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
//            if (a[i] > b[i]) {
//                c[i] = a[i];
//            } else {
//                c[i] = b[i];
//            }
            c[i] = max(a[i], b[i]);
        }

        return c;
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static void calculateFactorial(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = factorRec(arr[i]);
        }
    }


    //5! = 5 * 4 * 3 * 2 * 1
    static int factorRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorRec(n - 1);

    }

    static int[] sumOfArray(int[] a, int[] b) {
        int[] c = new int[a.length];
        //c = a + b;
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    static int[] merge(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        return c;
    }


    static int getLastElement(int[] arr) {
        return arr[arr.length - 1];
    }

    static int getFirstElement(int[] arr) {
        return arr[0];
    }

    static void printArrayRevers(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int cur : arr) {
            System.out.print(cur + "  ");
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println("]");
    }


    static int[] fillArray(int n, int a) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
        return arr;
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

    static int maxOfArrayForeach(int[] arr) {

        int max = arr[0];
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
        for (int current : arr) {

            if (current > max) {
                max = current;
            }
        }
        return max;
    }


}
