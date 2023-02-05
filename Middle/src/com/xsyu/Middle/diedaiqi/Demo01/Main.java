package com.xsyu.Middle.diedaiqi.Demo01;

import java.util.Arrays;
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
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
