package com.xsyu.Middle.list.Demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.list.Demo01
 * Description: list列表
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/5 - 17:25
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        System.out.println(list);
        //remove返回的是一个boolean类型的值
        System.out.println(list.remove("AAA"));
        System.out.println(list);
    }
}
