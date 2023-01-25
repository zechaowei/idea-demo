package com.xsyu.Primary.innerclassDemo.Demo04;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.innerclassDemo.Demo04
 * Description: Lambda表达式
 *              1、和匿名内部类不同，Lambda仅支持接口，不支持抽象类
 *              2、一个接口中有且只有一个待实现的抽象方法可以使用Lambda，该接口可以有多个默认实现，但是必须留一个抽象方法出来，比如：default void test();
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/19 - 21:41
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
//        Study study = new Study() {
//            @Override
//            public String study(int a) {
//                System.out.println("我是学习方法");
//                return "今天学会了" + a;             //实际上这里面就是方法体，该咋写就咋写
//            }
//        };

        //replace with lambda
//        Study study = a -> {
//            System.out.println("我是学习方法");
//            return "今天学会了" + a;             //实际上这里面就是方法体，该咋写就咋写
//        };


        //甚至更可以简化
        Study study = a -> "今天学会了" + a;

        System.out.println(study.study(10));

        test(new Study() {
            @Override
            public String study(int a) {
                return (a + "");
            }
        });
        /**
         * ChatGPT提供解决方案
         * 可以使用Java中的Integer.toString(int a)函数将int a转换为String类型。例如：
         *
         * int a = 5;
         * String b = Integer.toString(a);
         *
         * 也可以使用String.valueOf(int a) 函数
         *
         * int a = 5;
         * String b = String.valueOf(a);
         *
         * 也可以使用 +"" 转换
         *
         * int a = 5;
         * String b = a + "";
         */

    }
    private static void test(Study study){
        System.out.println("静态 static test函数: " + study.study(10));
    }
}
