package com.atguigu.java;

import java.util.HashMap;

/**
 * @author Tide
 * @date 2018-11-03-17:02
 */
public class DebugTest {

    public static void main(String[] args) {

        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
        }


        HashMap<String, String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);

    }
}
