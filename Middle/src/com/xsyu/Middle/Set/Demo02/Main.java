package com.xsyu.Middle.Set.Demo02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * ClassName: Test
 * Package: com.xsyu.Middle.Set.Demo01
 * Description:
 *                  由于底层采用哈希表实现，所以说无法维持插入元素的顺序
 *                  还有一种Set叫做TreeSet，它会在元素插入时进行排序
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/8 - 12:27
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //由于底层采用哈希表实现，所以说无法维持插入元素的顺序
        set.add("BBB");
        set.add("CCC");
        set.add("AAA");
        for (String s : set) {
            //输出顺序随机
            System.out.println(s);
        }

        //维护顺序
        System.out.println("------------- 维持顺序01 --------------");
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("BBB");
        set1.add("CCC");
        set1.add("AAA");
        for (String s : set1) {
            System.out.println(s);
        }

        System.out.println("------------- 数字输出02 --------------");
        //默认从小到大输出
        Set<Integer> set2 = new TreeSet<>((a, b) -> b - a);     //同样是一个Comparator
        set2.add(1);
        set2.add(3);
        set2.add(2);
        System.out.println(set2);
        for (Integer integer : set2) {
            System.out.println(integer);
        }
    }
}
