package com.xsyu.Middle.list.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Demo02plus
 * Package: com.xsyu.Middle.list.Demo
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/6 - 16:38
 * @Version: v1.0
 */
public class Demo02plus {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(10));      //添加的是一个对象
        list.remove(new Integer(10));   //删除的是另一个对象
        //结果显示依然删除
        //集合类在删除元素时，只会调用`equals`方法进行判断是否为指定元素，而不是进行等号判断
        //所以说一定要注意，如果两个对象使用`equals`方法相等，那么集合中就是相同的两个对象
        System.out.println(list);
    }
}
