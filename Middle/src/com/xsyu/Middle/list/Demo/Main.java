package com.xsyu.Middle.list.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.list.Demo01
 * Description: list列表
 *                  List是集合类型的一个分支，它的主要特性有：
 *                      1、是一个有序的集合，插入元素默认是插入到尾部，按顺序从前往后存放，每个元素都有一个自己的下标位置
 *                      2、列表中允许存在重复元素
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
