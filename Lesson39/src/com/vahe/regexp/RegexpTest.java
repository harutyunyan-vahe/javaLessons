package com.vahe.regexp;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//https://regex101.com/
//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
public class RegexpTest {
    public static void main(String[] args) {

        //.
        //\s
        // + *
        //[]
        // [0-9] , \d, \D
        // ^ beggining, & end

//        \d	A digit: [0-9]
//        \D	A non-digit: [^0-9]
//        \s	A whitespace character: [ \t\n\x0B\f\r]
//        \S	A non-whitespace character: [^\s]
//        \w	A word character: [a-zA-Z_0-9]
//        \W	A non-word character: [^\w]


//        X?	X, once or not at all
//        X*	X, zero or more times
//        X+	X, one or more times
//        X{n}	X, exactly n times
//        X{n,}	X, at least n times
//        X{n,m}	X, at least n but not more than m times

//        Logical operators
//        XY	X followed by Y
//        X|Y	Either X or Y
//        (X)	X, as a capturing group


        String fullname = "vahe####harutyunyan";
        String fullname2 = "vahe     harutyunyan";
        System.out.println(Arrays.toString(fullname.split("[\\s#]+")));
        System.out.println(Arrays.toString(fullname2.split("[\\s#]+")));

//
//
//        Pattern pattern = Pattern.compile("(\\w+) \\d{1,3} ");
//
//        Matcher matcher = pattern.matcher("vahe 158 karen 2289");
//
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//            System.out.println(matcher.group(1));
//        }


    }
}
