package com.vahe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyHashSet implements Iterable<String> {
    private static Object SOME_OBJECT = new Object();

    private Map<String, Object> map;

    public MyHashSet() {
        map = new HashMap<>();
    }

    public void add(String element) {
        map.put(element, SOME_OBJECT);
    }

    public boolean contains(String elem) {
        return map.get(elem) != null;
    }

    public void remove(String elem) {
        map.remove(elem);
    }



    @Override
    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }
}
