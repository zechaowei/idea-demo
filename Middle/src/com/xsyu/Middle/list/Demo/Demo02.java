package com.xsyu.Middle.list.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Demo02
 * Package: com.xsyu.Middle.list.Demo
 * Description:         特别注意一下，我们在使用Integer时，要注意传参问题：
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/6 - 16:32
 * @Version: v1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        list.add(10);           //添加Integer的值10
        //remove()方法: 删除列表中指定位置的元素(可选操作)。将所有后续元素向左移动(从它们的下标减去1)。返回从列表中移除的元素。
        //list.remove(10);//error:Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 1
        list.remove((Integer) 10);
        //注意，不能直接用10，默认情况下会认为传入的是int类型值，删除的是下标为10的元素，我们这里要删除的是刚刚传入的值为10的Integer对象
        System.out.println(list);
    }
}
