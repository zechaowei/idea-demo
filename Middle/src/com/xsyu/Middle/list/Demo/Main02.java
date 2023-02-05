package com.xsyu.Middle.list.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Main03
 * Package: com.xsyu.Middle.list.Demo01
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/5 - 19:37
 * @Version: v1.0
 */
public class Main02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BBB");
        list.add("AAA");
        list.add("AAA");
        //ArrayList<E> 中 indexOf(Object o) 返回此列表中第一次出现的索引，如果此列表不包含元素，则返回-1
        System.out.println(list.indexOf("CCC"));
        System.out.println(list.indexOf("AAA"));        //返回列表中第一次出现的索引
        System.out.println(list.indexOf("BBB"));
        //lastIndexOf(Object o) 返回此列表中最后一次出现的索引，如果此列表不包含元素，则返回-1
        System.out.println(list.lastIndexOf("AAA"));
    }
}
