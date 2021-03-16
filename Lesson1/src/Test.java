public class Test {

    public static void main(String[] arg) {
        System.out.println("Vahe");
        System.out.println("Tigran");

        //  asdj jadskf j

        /*

        asdfjkaldf
        asdj
        faksdfjalksdfj
        asdfjklasjdf
        asdf
        ds

         */

//        void k;
        byte by = 12; // 1 byte
        short sh = 3; // 2 byte, -2^15
        int vahe = 444; //4 byte, 32 bit, 2^31 - 2^31-1
        long lo = 45645465456465L;// 8 byte , 2^63

        float fl = 4.5F;// 4 byte
        double test2 = 4.5; // 8 byte,

        char chll = '$';// 2 byte

        boolean b1 = true;
        boolean b2 = false;

        String str = "Vahe Harutyunyan";

        System.out.println(str);

        System.out.println(vahe);
        System.out.println(test2);


        int i1 = 4;
        int i2 = 2;
        int i3 = i1 * i2;
        System.out.println(i3);

        if (i3 > 10) {
            System.out.println("Mec e 10ic");
        } else {
            System.out.println("Mec che 10ic");
        }
//        if(i3 <= 10){
//            System.out.println("Mec che 10ic");
//        }


        String str1 = "Anna";
        String str2 = " Karapetyan ";
        String str3 = str1 + str2;
        System.out.println(str3);


        int r = gumar(5, 9);
        System.out.println(r);

        int r2 = gumar(2, 6);
        System.out.println(r2);

        int p = minus(7, 2);
        System.out.println(p);

        printInfo("vahe");
    }

    static int gumar(int a, int b) {
        int c = a + b;
        return c;
    }

    static int minus(int a, int b) {
        int k = a - b;
        return k;
    }

    static void printInfo(String str) {
        System.out.println(str);
    }

}
