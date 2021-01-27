package com.vahe.old;

import java.util.*;

public class OldCollections {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();//ArrayList

        vector.add("vahe");
        vector.add("karen");

        List<String> syncArrayList = Collections.synchronizedList(new ArrayList<>());


        Hashtable<String, Integer> hashtable = new Hashtable<>();//HashMap

        //Collections.synchronizedMap(new HashMap<>()); ConcurrentHashMap



    }
}
