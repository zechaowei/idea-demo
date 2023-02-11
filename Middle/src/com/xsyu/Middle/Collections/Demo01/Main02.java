package com.xsyu.Middle.Collections.Demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.Collections.Demo02
 * Description:     我们可以对一个集合进行二分搜索（注意，集合的具体类型，必须是实现Comparable接口的类）
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 19:59
 * @Version: v1.0
 */
public class Main02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 3, 5, 0, 9, 8, 7));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 3));
    }
}
