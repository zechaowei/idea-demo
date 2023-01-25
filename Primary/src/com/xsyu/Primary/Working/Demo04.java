package com.xsyu.Primary.Working;

import java.util.Scanner;

/**
 * ClassName: Demo04
 * Package: com.xsyu.Primary.Working
 * Description:“回文串”是一个正读和反读都一样的字符串，请你实现一个Java程序，判断用户输入的字符串（仅出现英文字符）是否为“回文”串。
 * <p>
 * >  ABCBA   就是一个回文串，因为正读反读都是一样的
 * >
 * >  ABCA   就不是一个回文串，因为反着读不一样
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/24 - 10:13
 * @Version: v1.0
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println("是否为回文字符串: " + test());
    }

    public static boolean test() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        int i = 0;
        while (i < chars.length / 2) {
            if (chars[i] != chars[chars.length - 1 - i])
                return false;
            i++;
        }
        return true;
    }

//低配版本
//    public static boolean test() {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        char[] chars = str.toCharArray();
//        int i = 0, j = chars.length - 1;
//        while (i < j) {
//            if (chars[i] != chars[j])
//                return false;
//            i++;
//            j--;
//        }
//        return true;
//    }
}
