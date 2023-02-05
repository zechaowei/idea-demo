package com.xsyu.Middle.list.Demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Main04
 * Package: com.xsyu.Middle.list.Demo01
 * Description:   list.set(int index, E element)  用指定的元素替换此列表中指定位置的元素
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/5 - 19:59
 * @Version: v1.0
 */
public class Main04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        System.out.println("替换前: " + list);
        list.set(0, "BBB");
        System.out.println("替换后: " + list);
    }
}
