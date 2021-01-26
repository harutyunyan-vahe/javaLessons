package com.vahe.collections;


import com.vahe.racecondition.RaceConditionMain;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;


public class ThreadSafeCollectionMain {

    public static int THREAD_COUNT = 100;

    public static void main(String[] args) throws InterruptedException {
//        Map<String, String> map = new HashMap<>();
//
//        Map<String, String> stringStringMap = Collections.synchronizedMap(map);
//
//        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        //List<String> list = new ArrayList<>();
        List<String> list = Collections.synchronizedList(new ArrayList<>());

        Map<String, String> map = Collections.synchronizedMap(new HashMap<>());

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();


        List<Thread> threads = getThreads(list);
        threads.forEach(Thread::start);

//        TimeUnit.SECONDS.sleep(2);
        System.out.println(list);

    }

    private static List<Thread> getThreads(List<String> list) {
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            threadList.add(new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    list.add("test");
                }
            }));
        }
        return threadList;
    }
}
