package com.xsyu.Middle.Stream.Demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.Stream
 * Description:     中级：Stream流
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 17:02
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Aaaa", "Sadness", "Sadness", "Xx", "add", "Xss", "Lbwnb"));
        System.out.println(list);

        //输出每个字符的长度
        List<Integer> collect = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(collect);


        // 删除长度不大于3的字符串
        // 删除首字母不为大写的字符串
        // 去掉重复的字符串
        list = list.stream()
                .filter(str -> str.length() > 3)
                .filter(str -> str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
                .distinct()
                .collect(Collectors.toList());
        //filter(): 满足括号内的条件则保留
        System.out.println(list);
    }
}
