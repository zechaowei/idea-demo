package com.xsyu.Middle.Stream.Demo02;

import java.util.Random;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.Stream.Demo02
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 17:14
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        random
                .ints(-100,100) //生成-100~100之间的，随机int型数字(本质上是一个IntStream)
                .limit(20)  //只获取前20个数据(这是一个无限制的流，如果不加以限制，将会无限进行下去！)
                .filter(i -> i > 0) //只保留大于0的数字     ----> 断言表达式
                .sorted()           //默认从小到大排序
                .forEach(System.out::println);      //依次打印
    }
}
