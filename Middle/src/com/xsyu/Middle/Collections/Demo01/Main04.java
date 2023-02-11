package com.xsyu.Middle.Collections.Demo01;

import java.util.Collections;
import java.util.List;

/**
 * ClassName: Main04
 * Package: com.xsyu.Middle.Collections.Demo01
 * Description:
 *                  有些时候我们可能需要生成一个空的集合类返回，那么我们可以使用`emptyXXX`来快速生成一个只读的空集合
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 20:09
 * @Version: v1.0
 */
public class Main04 {
    public static void main(String[] args) {
        List<Integer> list = Collections.emptyList();
        // list.add(10);                //不支持，会直接抛出异常
        System.out.println(list);
    }
}
