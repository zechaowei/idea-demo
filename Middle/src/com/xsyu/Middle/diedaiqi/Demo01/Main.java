package com.xsyu.Middle.diedaiqi.Demo01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.diedaiqi.Demo01
 * Description: 迭代器的使用
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/5 - 22:44
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        //起初利用 for 循环遍历
        System.out.println("起初遍历: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //集合类都是支持 foreach 语法
        System.out.println("foreach遍历: ");
        for (String s : list) {
            System.out.println(s);
        }

        //----------------------------------------------------------------------------------------------------------------------
        //迭代器
        System.out.println("迭代器遍历: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());            //调用next方法时，返回当前所指向的元素

        System.out.println("迭代器第二次遍历: ");
        iterator = list.iterator();     //迭代器的使用是一次性的，用了之后就不能用了，如果需要再次进行遍历操作，那么需要重新生成一个迭代器对象
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("Lambda表达式遍历: ");
        list.forEach(str -> System.out.println(str));       //将Lambda表达式替换为方法引用之前
        list.forEach(System.out::println);

        System.out.println("--------");
        iterator = list.iterator();
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(list);


        //把剩下的遍历
        System.out.println("-------");
        iterator = list.iterator();
        System.out.println(iterator.next());
        iterator.forEachRemaining(System.out::println);
    }
}
