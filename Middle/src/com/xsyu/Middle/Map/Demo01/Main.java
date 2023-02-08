package com.xsyu.Middle.Map.Demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.Map.Demo01
 * Description: Map(一)
 *                  简单使用一下Map的方法，Map并没有继承Collection，因此并不是集合
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/8 - 22:57
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "小魏的信息");
        map.put(2, "小薇的信息");
        map.put(3, "小红的信息");
        System.out.println(map.get(1));
        System.out.println(map.get(2));

        System.out.println("--------------- 移除元素之前 ---------------");
        System.out.println(map);
        //输出所有的键值
        System.out.println("获取所有元素键值: " + map.keySet());
        //只获取value的值
        System.out.println("获取values的值: " + map.values());

        //else  仔细了解
        map.entrySet().forEach(entry ->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });


        System.out.println("--------------- 移除元素之后 ---------------");
        //移除键值为 3 的元素
        map.remove(3);
        System.out.println(map);
        System.out.println("获取所有元素键值: " + map.keySet());
        System.out.println("获取values的值: " + map.values());
    }
}
