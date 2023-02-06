package com.xsyu.Middle.list.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Demo01
 * Package: com.xsyu.Middle.list.Demo
 * Description:
 * 此处的demo均为个人练习，主要参考 Main 函数系列
 *
 * 使用接口的引用来操作具体的集合类实现，是为了方便日后如果我们想要更换不同的集合类实现，而且接口中本身就已经定义了主要的方法，所以说没必要直接用实现类
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/6 - 16:22
 * @Version: v1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //使用接口的引用来操作具体地集合类实现，是为了方便日后如果我们想要更换不同的集合类实现，而且接口中本身就已经定义了主要的方法，所以说没必要直接用实现类
        list.add("科技与狠活");
        list.add("上头啊");
        System.out.println(list);
    }
}
