package com.xsyu.Middle.genericsDemo.Demo03;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.genericsDemo.Demo03
 * Description: 泛型方法
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/25 - 22:37
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        String str = test("Hello World!");
        System.out.println(str);
    }

    //在返回值类型前添加<>并填写泛型变量表示这是一个泛型方法
    private static <T> T test(T t){
        return t;
    }
}
