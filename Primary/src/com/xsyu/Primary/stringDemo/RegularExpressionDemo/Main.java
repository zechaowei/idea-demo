package com.xsyu.Primary.stringDemo.RegularExpressionDemo;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.stringDemo.RegularExpressionDemo
 * Description: 正则表达式
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/17 - 21:48
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        String str = "oo";
        System.out.println(str.matches("o+"));      //+表示对前面这个字符匹配一次或多次，这里字符串是oo，正好可以匹配
        String str1 = "ooo";
        System.out.println(str1.matches("o*"));      //匹配前面的子表达式零次或多次
        String str2 = "o";
        System.out.println(str2.matches("o+a*"));
        String str3 = "ooo";
        System.out.println(str3.matches("o{3}"));       //n 是一个非负整数。匹配确定的 n 次
        String str4 = "abc";
        System.out.println(str4.matches("[abc]*]"));
        String str5 = "opfjjlwe";
        System.out.println(str5.matches("^[abc]*"));

    }
}
