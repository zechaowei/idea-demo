package com.xsyu.Middle.Collections.Demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.Collections.Demo01
 * Description: Collections工具类
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 19:49
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 3, 5, 0, 9, 8, 7));
        System.out.println(list);
        System.out.println("list's max = " + Collections.max(list));
        System.out.println("list's min = " + Collections.min(list));
        Collections.sort(list);
        System.out.println(list);
    }
}
