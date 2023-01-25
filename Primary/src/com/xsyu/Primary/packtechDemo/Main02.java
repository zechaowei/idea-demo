package com.xsyu.Primary.packtechDemo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * ClassName: Main02
 * Package: com.xsyu.Primary.packtechDemo
 * Description: 特殊包装类
 *              1、用于计算超大数字的BigInteger
 *              2、BigDecimal可以实现小数的精确计算
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/17 - 10:14
 * @Version: v1.0
 */
public class Main02 {
    public static void main(String[] args) {
        /**
         * BigInteger
         */
        BigInteger integer = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("Long.MAX_VALUE = " + integer);

        BigInteger i = integer.multiply(BigInteger.valueOf(Long.MAX_VALUE));
        System.out.println("Long.MAX_VALUE * Long.MAX_VALUE = " + i);

        BigInteger a = integer.pow(100);
        System.out.println("Long.MAX_VALUE ^ 100 = " + a);

        /**
         * BigDecimal 浮点精度
         */
        BigDecimal d = BigDecimal.valueOf(10);
        d = d.divide(BigDecimal.valueOf(3), 100, RoundingMode.CEILING);
        BigDecimal e = BigDecimal.valueOf(10);
        e = e.divide(BigDecimal.valueOf(3), 100, RoundingMode.FLOOR);
        //计算10/3的结果，精确到小数点后100位
        //RoundingMode是舍入模式，就是精确到最后一位时，该怎么处理，这个CEILING表示向上取整，FLOOR表示向下取整
        System.out.println("向上取整: " + d);
        System.out.println("向下取整: " + e);
    }
}

/**
 * Soft-Wrap    换行打印
 * Scroll to End
 * Open Grep Console settings   打开Grep控制台设置
 * Previous Console Highlight   以前的控制台突出显示
 * Next Console Highlight       下一个控制台突出显示
 */