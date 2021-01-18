package com.vahe.reflection;


import com.vahe.Car;
import com.vahe.Employee;

import java.lang.reflect.*;

//Field, Method, and Constructor
public class RefTest {


    public static void main(String[] args) throws Exception {

        Class clazz;//= new Class();

        Employee vahe = new Employee("vahe", 22);

        Class cl1 = Employee.class;
        Class cl2 = vahe.getClass();
        Class cl3 = Class.forName("com.vahe.Employee");

//        if (cl1 == cl2) {
//            System.out.println("Same");
//        }
        System.out.println(cl1);


        printAllMethods();
        System.out.println("---------------");
        printAllFields();
        System.out.println("-------------");
        callMethod();
        System.out.println("---------");
        createObj();
        System.out.println("----------");
        createObjWithDefaultConstructor("com.vahe.Employee");


        Car car = new Car("bmw", 2010);
//        String str = toStringReflection(car);
        System.out.println(car);
        System.out.println(new Employee("vahe", 22));


//        Class aClass = Class.forName("com.vahe.Employee");
//        System.out.println(aClass);
//        Class<Employee> clazz = Employee.class;

        //  printAllMethods();
//        String str = toStringReflect(new Car("BMW", 2010));
//        System.out.println(str);
        //printAllFields();

    }

    public static void printAllMethods() {
        Class<Employee> clazz = Employee.class;


        Method[] methods = clazz.getDeclaredMethods();

        for (Method m : methods) {

            m.getModifiers();
            System.out.println(m.getName());
        }
    }

    public static void printAllFields() {
        Class<Employee> clazz = Employee.class;


        Field[] fields = clazz.getDeclaredFields();

        for (Field curF : fields) {
            String modifier = Modifier.toString(curF.getModifiers());
            System.out.println(modifier + "  " + curF.getName());
        }
    }

    public static void callMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Employee> clazz = Employee.class;

        Employee emp = new Employee("vahe", 22);
//        Method[] methods = clazz.getDeclaredMethods();


        Method getAgeMet = clazz.getDeclaredMethod("getAge");

        Method getNameMet = clazz.getDeclaredMethod("getName");
        getNameMet.setAccessible(true);

        Object name = getNameMet.invoke(emp);
        System.out.println(name);

        Object age = getAgeMet.invoke(emp);
        System.out.println(age);
    }


    public static void createObj() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Employee> clazz = Employee.class;
        Constructor<Employee> declaredConstructor = clazz.getConstructor(String.class, int.class);

        Employee employee = declaredConstructor.newInstance("vahe", 31);

//        System.out.println(employee.getAge() + "  " + employee.getName());

    }

    public static void createObjWithDefaultConstructor(String className) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
//        Class<Employee> clazz = Employee.class;
        Class clazz = Class.forName(className);
        Constructor declaredConstructor = clazz.getConstructor();

        Object obj = declaredConstructor.newInstance();

        System.out.println(obj);

    }

    public static String toStringReflection(Object obj) {
        StringBuilder sb = new StringBuilder("[");
        Class<?> aClass = obj.getClass();
        sb.append(aClass.getSimpleName() + "  ");
        for (Field f : aClass.getDeclaredFields()) {
            f.setAccessible(true);
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

    private static boolean isStaticField(Field f) {
        return Modifier.isStatic(f.getModifiers());
    }

//    static String toString(int modifiers)
//    returns a string with the modifiers that correspond to the bits set in modifiers.
//    static boolean isAbstract(int modifiers)
//    static boolean isFinal(int modifiers)
//    static boolean isInterface(int modifiers)
//    static boolean isNative(int modifiers)
//    static boolean isPrivate(int modifiers)
//    static boolean isProtected(int modifiers)
//    static boolean isPublic(int modifiers)
//    static boolean isStatic(int modifiers)
//    static boolean isStrict(int modifiers)
//    static boolean isSynchronized(int modifiers)
//    static boolean isVolatile(int modifiers)
}
