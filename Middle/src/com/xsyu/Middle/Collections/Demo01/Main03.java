package com.xsyu.Middle.Collections.Demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: Main03
 * Package: com.xsyu.Middle.Collections.Demo01
 * Description:
 *                      我们也可以对集合的元素进行快速填充，注意这个填充是对集合中已有的元素进行覆盖
 *                      如果集合中本身没有元素，那么`fill`操作不会生效
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 20:03
 * @Version: v1.0
 */
public class Main03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 3, 5, 0, 9, 8, 7));
        Collections.sort(list);
        System.out.println(list);
        //fill()    是对其进行覆盖
        System.out.println("------------fill()是对其进行覆盖-------------");
        Collections.fill(list, 6);
        System.out.println(list);

        //如果集合中本身没有元素，那么`fill`操作不会生效

        System.out.println("------------如果集合中本身没有元素，那么`fill`操作不会生效------------");
        List<Integer> list_demo  = new ArrayList<>(Arrays.asList());
        System.out.println(list_demo);
        Collections.fill(list_demo, 6);
    }
}
