package com.xsyu.Middle.list.Demo;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Demo05
 * Package: com.xsyu.Middle.list.Demo
 * Description:
 *                  在Arrays工具类中，我们可以快速生成一个只读的List
 *                  注意，这个生成的List是只读的，不能进行修改操作，只能使用获取内容相关的方法，否则抛出 UnsupportedOperationException 异常
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/6 - 16:52
 * @Version: v1.0
 */
public class Demo05 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        System.out.println(list);
    }
}
