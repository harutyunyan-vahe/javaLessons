package com.vahe;


public class MyHashMapMain {

    public static void main(String[] args) {

        MyHashMap1 myHashMap1 = new MyHashMap1();
        myHashMap1.put("vahe", 22);
        myHashMap1.put("aram", 18);
        myHashMap1.put("aram2", 18);
        myHashMap1.put("aram3", 18);
        myHashMap1.put("aram4", 18);
        myHashMap1.put("aram5", 18);
        myHashMap1.put("aram6", 18);
        myHashMap1.put("aram7", 18);
        myHashMap1.put("aram8", 18);
        myHashMap1.put("aram9", 18);
        myHashMap1.put("aram910", 18);
        myHashMap1.put("aram9121", 18);

        Integer vahe = myHashMap1.get("aram");
        System.out.println(vahe);

//        Employee employee = new Employee("vahe");
//
//        System.out.println(employee.hashCode());

    }
}
