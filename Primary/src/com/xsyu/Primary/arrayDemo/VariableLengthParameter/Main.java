package com.xsyu.Primary.arrayDemo.VariableLengthParameter;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.arrayDemo.VariableLengthParameter
 * Description: 可变长参数
 *              1、在使用时，可以传入0 - N个对应类型的实参
 *              2、可变长参数本质就是一个数组
 *              3、如果同时存在其他参数，那么可变长参数只能放在最后
 *
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/17 - 17:44
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        test("Hello", "World", "Test", "ssss");
    }

    private static void test(String... str){
        for (String s : str) {
            System.out.println(s);
        }
    }
}
