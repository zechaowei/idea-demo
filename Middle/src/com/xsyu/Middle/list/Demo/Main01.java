package com.xsyu.Middle.list.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Main01
 * Package: com.xsyu.Middle.list.Demo01
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/5 - 17:50
 * @Version: v1.0
 */
public class Main01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BBB");
        list.add("AAA");
        list.sort(String::compareTo);       //反转，如果没有这一行，输出结果为[BBB  AAA]，执行这一行后输出结果为[AAA  BBB]
        System.out.println(list);
    }
}
