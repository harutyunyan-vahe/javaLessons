package aghas;

//import com.vahe.harutyunyan.MinMaxInfo;

import com.vahe.harutyunyan.MinMaxInfo;

public class Lesson8 {


    public static void main(String[] args) {


//        int[] arr = {5, 6, 7, 9, 1};
//        removeElement(arr, 7);
//        showArray(arr);
//
//        int g = 6;
//
//        int[] arr = {5, 6, 7, 9, 1, 5, 10};
//        int t = max(arr);
//
////        int[] tem = {5, 6, 7, 9, 1, 5, 10, 33, 100};
//        int m = maxVarArgs(5, 6, 7, 9, 1, 5, 10, 33, 100);
//        System.out.println(m);

//        int uu = 0;
//        if (3 > 1) {
//            int gg = 7;
//
//            if (2 > 1) {
//                System.out.println(gg);
//            }
//        }
//
//        for (int i = 0; i < 10; i++) {
//            int kk = 1;
//        }
//
//        {
//            int yy = 1;
//
//            {
//                System.out.println(yy);
//            }
//        }
//
//        int yy = 33;
//
//        for (int i = 0; i < 100; i++) {
//
//            System.out.println();
//        }
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println();
//        }
//
//        System.out.println(yy);

        int[] temp = {5, 6, 7, 9, 1, 5, 10, 33, 100};

//        int[] ar = maxAvrageMin(temp);

        MinMaxInfo info = maxAvrageMinWithClass(temp);


        System.out.println(info.minimum);
        System.out.println(info.maximum);
        System.out.println(info.avrg);

//        System.out.println(ar[0]);
//        System.out.println(ar[1]);
//
        int a = 22;
        long l = 444;
        double d = 33.4;
        float f = 5.3F;

        boolean bb = true;// false
        String str = "kjasdflkj";
        char ch = '$';

//        com.vahe.harutyunyan.MinMaxInfo mm = new com.vahe.harutyunyan.MinMaxInfo();
//        mm.minimum = 99;
//        mm.maximum = 444;
//        mm.avrg = 33.3;


//        System.out.println(mm.minimum);


//        int[] arr = {5, 67, 9};
        // String k = maxAvrageMinStr(tem);
        //  System.out.println(k);
    }

    static int maxVarArgs(int... arr) {
        int m = arr[0];
        for (int cur : arr) {
            if (cur > m) {
                m = cur;
            }
        }
        return m;
    }

    static MinMaxInfo maxAvrageMinWithClass(int[] arr) {
        int minimum = min(arr);
        int maximum = max(arr);
        double avrg = avrg(arr);

        MinMaxInfo info = new MinMaxInfo();
        info.minimum = minimum;
        info.maximum = maximum;
        info.avrg = avrg;

        return info;

//        int[] result = new int[3];
//        result[0] = minimum;
//        result[1] = maximum;
//        result[2] = avrg;

//        return result;
    }

    /**
     * return array , first element is min, second element is max
     *
     * @param arr
     * @return
     */
//    static int[] maxAvrageMin(int[] arr) {
//        int minimum = min(arr);
//        int maximum = max(arr);
//        double avrg = mijinTvabanakan(arr);
//        int[] result = new int[3];
//        result[0] = minimum;
//        result[1] = maximum;
//        result[2] = avrg;
//
//        return result;
//    }

    static String maxAvrageMinStr(int[] arr) {
        int minimum = min(arr);
        int maximum = max(arr);
        double avrg = avrg(arr);
//        int[] result = new int[3];
//        result[0] = minimum;
//        result[1] = maximum;
//        result[2] = avrg;

        return minimum + "  " + maximum + "  " + avrg;

//        return result;
    }

    static int min(int[] arr) {
        int minimum = arr[0];

        for (int cur : arr) {
            if (cur < minimum) {
                minimum = cur;
            }
        }

        return minimum;
    }

    static int max(int[] arr) {
        int m = arr[0];

        for (int cur : arr) {
            if (cur > m) {
                m = cur;
            }
        }

        return m;
    }

    static void removeElement(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
//                arr[i]  =  0;
                while (i != arr.length - 1) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    i++;
                }
            }
        }
        arr[arr.length - 1] = 0;
    }

    static double avrg(int[] arr) {
        int s = sum(arr);
//
//        for (int cur : arr) {
//            sum += cur;
//        }
//        int mijin = s / arr.length;
        return s / arr.length;
    }

    static int sum(int[] arr) {
        int s = 0;

        for (int cur : arr) {
            s += cur;
        }
        return s;
    }


    static void showArray(int[] arr) {
        for (int cur : arr) {
            System.out.print(cur + " ");
        }
        System.out.println();
    }

    static boolean find(int[] arr, int n) {
        for (int current : arr) {
            if (current == n) {
                return true;
            }
//            else {
//                return false;
//            }
        }
        return false;
    }

//    static void test() {
//
//        for (int i = 0; i < 100; i++) {
//
//            if (i % 3 == 0) {
//                break;
//            }
//
//            System.out.println(i);
//        }
//    }


}
