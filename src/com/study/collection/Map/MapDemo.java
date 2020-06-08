package com.study.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    private String name;
    private Integer score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


    public static void main(String[] args) {
        MapDemo mapDemo = new MapDemo();
        mapDemo.setName("王磊");
        mapDemo.setScore(99);
        Map<String, MapDemo> map = new HashMap<>();
        map.put("王磊", mapDemo);
        MapDemo target = map.get("王磊");
        System.out.println(target == mapDemo);
        System.out.println(target.score);
    }
}
