package com.xsyu.Primary.stringDemo;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.stringDemo
 * Description: 字符串
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/17 - 19:38
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";
        System.out.println(str1);
        System.out.println(str1 == str2);

        //创建新的对象，因此不相等
        String str3 = new String("Hello World!");
        String str4 = new String("Hello World!");
        System.out.println(str3 == str4);
        //判断字符串是否相等调用 `equals()` 函数
        System.out.println(str3.equals(str4));
        System.out.println("--------");

        //裁剪
        String str = "Hello World!";
        System.out.print("裁剪前三位: ");
        System.out.println(str.substring(0, 3));
        System.out.print("裁剪后三位: ");
        System.out.println(str.substring(str.length() - 3, str.length()));
        System.out.println("--------");

        System.out.print("分割: ");
        String[] org = str.split(" ");
        for (String s : org) {
            System.out.println(s);
        }
        System.out.println("--------");

        System.out.print("将此字符串转换为新的字符数组: ");
        char[] chars = str.toCharArray();
        System.out.println(chars);
        System.out.println(chars[0]);
        System.out.println("--------");

        //包含
        if (str.contains("World")) {
            System.out.println("str字符串中包含 World");
        }
        System.out.println(str.contains("World"));
        System.out.println("--------");


        //返回指定索引处的 char值
        System.out.println("返回指定索引处的 char值: ");
        System.out.println("第0个位置" + str.charAt(0));
        System.out.println("第4个位置" + str.charAt(4));
        System.out.println("--------");

        //全部转换为大写或小写
        //注意：这里转换为大小写是重新生成了一个新的String对象，而不是覆盖之前的String对象
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);
        System.out.println("--------");


        //测试此字符串是否以指定的前缀开头
        if (str.startsWith("He")){
            System.out.println("此字符串以指定的前缀开头！");
        }
        System.out.println(str.startsWith("He"));
        System.out.println("--------");


        //返回指定子字符串第一次出现的字符串内的索引
        //如果没有出现这个字符串则返回 -1
        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("Word"));
        System.out.println("--------");


        //判断是否为空串
        if (!str.isEmpty()){
            System.out.println("该字符串不为空！");
        }else {
            System.out.println("该字符串为空！");
        }
        System.out.println(str.isEmpty());
        System.out.println("--------");

        //替换操作
        String s = str.replace("Hello", "Hi");
        System.out.println(s);
        //System.out.println(str.replaceAll("Hello", "Hi"));
    }
}
