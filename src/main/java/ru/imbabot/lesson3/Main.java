package ru.imbabot.lesson3;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static String[] arr =
            {
                    "a", "b", "c", "a",
                    "c", "d", "e", "e",
                    "e", "a", "d", "f",
                    "f", "c", "d", "z",
                    "x", "x", "c", "d"
            };

    private static Set<String> findUnique(String[] arr){
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            set.add(arr[i]);
        }
        return set;
    }

    private static Map<String, Integer> countWords(String[] arr){
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        return map;
    }


    public static void main(String[] args) {
        System.out.println(findUnique(arr));
        System.out.println(countWords(arr));
    }
}
