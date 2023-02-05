package com.xsyu.Middle.list.Demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Main04
 * Package: com.xsyu.Middle.list.Demo01
 * Description:         asList(T... a): 返回由指定数组支持的固定大小的列表   固定大小，不能增加，也不能减少
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/5 - 19:53
 * @Version: v1.0
 */
public class Main03 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AAA", "BBB", "CCC");
        System.out.println(list);
        //list.add("DDD");        //UnsupportedOperationException   不支持的异常操作
        //list.remove("AAA");

        List<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("AAA", "BBB", "CCC"));
        System.out.println(list1);
    }
}
