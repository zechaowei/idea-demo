package com.xsyu.Middle.Set.Demo01;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.Set.Demo01
 * Description:     Set集合
 *                      - 不允许出现重复元素
 *                      - 不支持随机访问（不允许通过下标访问）
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/8 - 12:18
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("AAA"));         //set(E e)返回的是一个boolean类型的值---> boolean set(E e)
        System.out.println(set.add(new String("AAA")));     //即使创建一个新的对象，也是不可以的，因为使用equals方法判断
        System.out.println(set);


        //在Set接口中并没有定义支持指定下标位置访问的添加和删除操作，我们只能简单的删除Set中的某个对象
        set.add("CCC");
        set.add("BBB");
        set.add("DDD");
        System.out.println(set);
        System.out.println("删除BBB: " + set.remove("BBB"));
        System.out.println(set);
    }
}
/**
 * Navigate to duplicate 导航到复制
 */