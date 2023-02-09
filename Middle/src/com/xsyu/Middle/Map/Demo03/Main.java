package com.xsyu.Middle.Map.Demo03;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.Map.Demo03
 * Description:  hashMap/LinkedHashMap/
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/9 - 22:44
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("------------ 随机输出 -----------");
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "小魏的信息");
        map.put(1, "小薇的信息");
        map.forEach((k, v) ->{
            System.out.println(k + " = " + v);
        });

        //按照顺序插入
        System.out.println("------------ 按顺序输出 -----------");
        Map<Integer, String> map01 = new LinkedHashMap<>();
        map01.put(2, "小魏的信息");
        map01.put(1, "小薇的信息");
        map01.forEach((k, v) ->{
            System.out.println(k + " = " + v);
        });

        //根据key排序
        System.out.println("------------ 按key排序 -----------");
        Map<Integer, String> map02 = new TreeMap<>();
        map02.put(2, "小魏的信息");
        map02.put(1, "小薇的信息");
        map02.forEach((k, v) ->{
            System.out.println(k + " = " + v);
        });

        System.out.println("------------ 按key逆序排序 -----------");
        Map<Integer, String> map03 = new TreeMap<>((a, b) -> b - a);
        map03.put(2, "小魏的信息");
        map03.put(1, "小薇的信息");
        map03.forEach((k, v) ->{
            System.out.println(k + " = " + v);
        });
    }
}
