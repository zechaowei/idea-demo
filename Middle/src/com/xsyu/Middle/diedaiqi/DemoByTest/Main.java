package com.xsyu.Middle.diedaiqi.DemoByTest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.diedaiqi.DemoByTest
 * Description: 深入了解 迭代器 语法
 *              用于阅读 Iterator   源码时做的测试
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/7 - 19:59
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("大小固定，不能修改: ");
        List<String> list = Arrays.asList("A", "B", "C");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("开始使用迭代器: ");
        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());        //输出第一个元素
        System.out.println("-------");
        //输出后面的元素
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("增强for循环: ");
        for (String s : list) {
            System.out.println(s);
        }

        iterator = list.iterator();         //迭代器的指针使用结束，重新一个新的迭代器
        System.out.println("重新生成一个迭代器对象后 第一个元素: " + iterator.next());
        System.out.println("remove操作: ");
//        iterator.remove();
////        while (iterator.hasNext())
////            System.out.println(iterator.next());
//        System.out.println(list);


//        System.out.println("再来一次: ");
//        System.out.println("--------");
//        iterator = list.iterator();
//        System.out.println(iterator.next());
//        iterator.remove();
//        System.out.println(list);


        //ListIterator迭代器，是List的强化版
        System.out.println("-----------------------");
        System.out.println("测试 ListIterator 迭代器");
        ListIterator<String> iteratorDemo = list.listIterator();
        iteratorDemo.next();   //此时得到A
        iteratorDemo.set("X");  //将A原本位置的上的元素设定为成新的
        System.out.println(list);

    }
}
