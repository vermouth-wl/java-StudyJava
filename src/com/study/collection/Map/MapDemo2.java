package com.study.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> user = new HashMap<>();
        user.put("苦艾酒", 32);
        user.put("贝尔摩德", 28);
        for (String key: user.keySet()) {
            Integer age = user.get(key);
            System.out.println("{" + key + ": " + age + "}");
        }
    }
}
