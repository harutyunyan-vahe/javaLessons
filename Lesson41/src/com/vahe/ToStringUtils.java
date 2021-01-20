package com.vahe;

import com.vahe.annotations.IgnoreInToString;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToStringUtils {

//    public static Object fromStringToObject(String str, Class clazz) {
//     //[Human  name=vahe age=22 sex=male ]
//
//        Pattern compile = Pattern.compile("\\w+=\\w+");
//        Matcher matcher = compile.matcher(str);
//        while (matcher.find()) {
//            String group = matcher.group();
//            System.out.println(group);
//        }
//
//        try {
//            Constructor declaredConstructor = clazz.getDeclaredConstructor();
//
//            Object newEmptyObject = declaredConstructor.newInstance();
//            Field[] declaredFields = clazz.getDeclaredFields();
//            for (Field f : declaredFields) {
//                f.getName();
//                f.set(newEmptyObject, );
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public static String toStringReflection(Object obj) {
        StringBuilder sb = new StringBuilder("[");
        Class<?> aClass = obj.getClass();
        sb.append(aClass.getSimpleName() + "  ");
        for (Field f : aClass.getDeclaredFields()) {
            f.setAccessible(true);
            if (isIgnored(f)) {
                continue;
            }
            if (!isStaticField(f)) {
                try {
                    sb.append(f.getName())
                            .append("=")
                            .append(f.get(obj))// obj.name
                            .append(" ");
                } catch (IllegalAccessException e) {
                    // pass, don't print
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private static boolean isIgnored(Field f) {
        Annotation[] annotations = f.getAnnotations();
        for (Annotation cur : annotations) {

            // System.out.println(cur.getClass());
            if (cur.annotationType().equals(IgnoreInToString.class)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isStaticField(Field f) {
        return Modifier.isStatic(f.getModifiers());
    }
}
