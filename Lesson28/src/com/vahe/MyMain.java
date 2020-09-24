package com.vahe;

public class MyMain {

    public static void main(String[] args) {

//        LinkedList<String> list = new LinkedList<>();
//
//        list.add("test1");
//        list.add("test2");
//        list.add("test3");
//        list.add("test4");
//        list.add("test5");
//        list.add("test6");
//        list.add("test7");
//
//
//        ListIterator<String> iterator = list.listIterator();
//
//        for (int i = 0; i < 5; i++) {
//            iterator.next();
//        }
//
//        iterator.add("gg");
////        iterator.add("gg");
////        iterator.add("gg");
//
////        list.add(5, "gg");
////        list.add(5, "gg");
//        list.add(5, "gg");
//
//
//        System.out.println(list);

//
//        LinkedList<String> languages = new LinkedList<>();
//
//        languages.add("Java");
//        languages.add("C++");
//        languages.add("Python");
////        languages.add("Python");
////        languages.add("Python");
//
//        // does NOT result Exception
//        for (String cur : languages) {
//            System.out.println(cur);
//            if (cur.equals("Java")) {
//                languages.remove("Java");
//            }
//        }


//        HashMap<String, Integer> map = new HashMap<>();
//
////        map.put("vahe", 30);
//        map.put("vahe", 31);
//        map.put("hayk", 31);
//        map.put("karen", 24);
//
//        map.remove("vahe");
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//
//        Collection<Integer> values = map.values();
//        System.out.println(values);
//        Set<String> keys = map.keySet();
//        System.out.println(keys);
//
//        System.out.println(map.size());

        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put("vahe", 30);
        myHashMap.put("Aghas", 34);
        myHashMap.put("Varzdat", 22);

        Integer vaheAge = myHashMap.get("Varzdat");
        System.out.println(vaheAge);
//        for (Map.Entry<String, Integer> curr : entries) {
//
//            System.out.println(curr.getKey() + " --- " + curr.getValue());
//        }

    }
}
