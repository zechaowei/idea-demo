package com.xsyu.Middle.list.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Demo06
 * Package: com.xsyu.Middle.list.Demo
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/6 - 16:58
 * @Version: v1.0
 */
public class Demo06 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(){{
           //使用匿名内部类（匿名内部类在Java8无法使用钻石运算符，但是之后的版本可以）
           add("A");
           add("B");
           add("C");
        }};
        System.out.println(list);
    }
}
