package com.xsyu.Middle.list.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Demo04
 * Package: com.xsyu.Middle.list.Demo
 * Description:     集合类是支持嵌套使用的，一个集合中可以存放多个集合
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/6 - 16:50
 * @Version: v1.0
 */
public class Demo04 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        System.out.println(list.get(0).isEmpty());
    }
}
