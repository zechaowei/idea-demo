package com.xsyu.Primary.Tools.mathTools;

import java.util.Random;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.mathTools
 * Description: 数学工具类
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/21 - 13:16
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        double a = 3, b = 4, c = -10;
        //pow(a, b) ----> 计算a的b次方
        System.out.println("3^5 = " + Math.pow(a, b));
        //abs()  ----> 求绝对值
        System.out.println("|c| = " + Math.abs(c));
        //max()  ----> 求最大值
        System.out.println("a 和 b 的最大值为: " + Math.max(a, b));
        //min()  ----> 求最小值
        System.out.println("a 和 b 的最小值为: " + Math.min(a, b));
        //sqrt() ----> 求算术平方根
        System.out.println("b 的算数平方根为: " + Math.sqrt(b));

        /**
         * 三角函数
         */
        //正弦函数
        System.out.println("sin(π / 2) = " + Math.sin(Math.PI / 2));
        //余弦函数
        System.out.println("cos(π) = " + Math.cos(Math.PI));
        //正切函数
        System.out.println("tan(π / 4) = " + Math.tan(Math.PI / 4));

        /**
         * 反三角函数
         */
        //反正弦函数
        System.out.println("arcsin(1) = " + Math.asin(1));
        //反余弦函数
        System.out.println("arccos(1) = " + Math.acos(1));
        //反正切函数
        System.out.println("arctan(0) = " + Math.atan(1));

        /**
         * 特殊案例
         */
        System.out.println("sin(π) = " + Math.sin(Math.PI));        //无线趋近于0

        /**
         * 对数函数
         */
        System.out.println("lne = " + Math.log(Math.E));
        System.out.println("以10为底的对数函数: log10(100) = " + Math.log10(100));    //以10为底的对数函数
        //换底公式
        double A = Math.log(4) / Math.log(2);       //log(2)4 = ln4 / ln2
        System.out.println("换底公式: " + A);

        /**
         * 特殊计算  向上取整/向下取整
         */
        System.out.println("向上取整: "+Math.ceil(4.5));
        System.out.println("向下取整: "+Math.floor(4.5));

        /**
         * 生成随机数
         */
        Random random = new Random();   //创建Random对象
        System.out.print("0~100之间的30个随机数：");
        for (int i = 0; i < 100; i++) {
            System.out.print(random.nextInt(100) + " ");        //nextInt(x)方法可以指定创建 0~x 之内的随机数
        }
        System.out.println();
        System.out.println("0~1之间的1个随机数"+random.nextDouble());
    }
}
