package com.xsyu.Primary.packtechDemo;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.packtechDemo
 * Description: 基本包装类
 *
 *      1、包装类是一个类，不是基本类型，所以说两个不同的对象，那么是不相等的
 *      2、包装类支持字符串直接转换
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/16 - 19:45
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        /**
         *     private final int value;
         *
         *     public Integer( int value){
         *          this.value = value;
         *     }
         */
        Integer i = new Integer(10);
        System.out.println("i = " + i);

        Integer j = 10;
        System.out.println("j = " + j);
        Integer j2 = Integer.valueOf(j);
        System.out.println("j2 = " + j2);


        /**
         * 包装类是一个类，不是基本类型，所以说两个不同的对象，那么是不相等的
         */
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        System.out.println("a 与 b 是否相等: " + (a == b)); //虽然a和b的值相同，但是并不是同一个对象，所以判断为假

        //自动装箱
        Integer c = 10, d = 10;
        System.out.println("c 与 d 是否相等: " + (c == d));


        /**
         * 包装类支持字符串直接转换
         */
        Integer integer = new Integer("666");
        System.out.println(integer);        //直接将字符串666转换为数字666
        System.out.println(integer * i);    //验证

        //字符串转 Integer 有多个方法
        System.out.println("字符串转 Integer");
        Integer i2 = Integer.valueOf("5555");
        System.out.println(i2);
        Integer i3 = Integer.parseInt("5555");
        System.out.println(i3);

        //十六进制和八进制字符串进行解码，得到对应的int值：
        Integer i4 = Integer.decode("0xA6");
        System.out.println("0xA6对应的十进制为: " + i4);

        //也可以将十进制转换为其他进制的字符串
        System.out.println("十进制 166 转换为十六进制为: 0x" + Integer.toHexString(166));
    }
}
