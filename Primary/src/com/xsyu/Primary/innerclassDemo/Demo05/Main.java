package com.xsyu.Primary.innerclassDemo.Demo05;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.innerclassDemo.Demo05
 * Description: 方法引用
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/19 - 22:20
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Study study = (a, b) -> a + b;
        System.out.println("study.sum = " + study.sum(10, 20));

        Study study01 = (a, b) -> Integer.sum(a, b);
        System.out.println("study01.sum = " + study01.sum(10, 20));

        Study study02 = Integer::sum;
        System.out.println("study02.sum = " + study02.sum(10, 20));

        Study01 study03 = String::new;
        System.out.println(study03.study01().isEmpty());

        Main main = new Main();
        System.out.println(main.testDemo());
    }

    public String testDemo(){
        return "卡布奇诺今犹在，不见当年倒茶人";
    }
}