package org.src.example;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> hashMap = new LinkedHashMap<>();
        hashMap.put(1,"One");
        hashMap.put(4,"Four");
        hashMap.put(2,"Two");
        hashMap.put(3,"Three");
        hashMap.put(5,"Five");

        System.out.println(hashMap);

        System.out.println(hashMap.get(3));

        Set<Integer> keySet = hashMap.keySet();
        System.out.println(keySet);
    }
}
