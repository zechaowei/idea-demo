package com.xsyu.Primary.stringDemo.RegularExpressionDemo;

/**
 * ClassName: Email_Test
 * Package: com.xsyu.Primary.stringDemo.RegularExpressionDemo
 * Description: 使用java的正则表达式判断输入的邮箱是否符合邮箱格式
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/17 - 21:59
 * @Version: v1.0
 */
public class Email_Test {
    public static void main(String[] args) {
        String mail = "zechaowei2001@gmail.com";
        String target = "\\w+@\\w+(\\.[a-zA-Z]+)+";
        boolean match = mail.matches(target);
        if (match) {
            System.out.println(mail + " 是邮箱!");
        } else {
            System.out.println(mail + " 不是邮箱!");
        }
    }
}
