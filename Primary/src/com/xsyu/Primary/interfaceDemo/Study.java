package com.xsyu.Primary.interfaceDemo;

/**
 * ClassName: Study
 * Package: com.xsyu.Primary.interfaceDemo
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/15 - 20:29
 * @Version: v1.0
 */
public interface Study {

    //接口中只能定义访问权限为public抽象方法，其中public和abstract关键字可以省略
    public abstract void study();


    default void test(){
        System.out.println("我是接口的默认实现");
    }

    //接口中不允许存在成员变量和成员方法，但是可以存在静态变量和静态方法，接口中定义的静态变量只能是public static final的
    public static final int a = 10;



    public static void testStatic(){
        System.out.println("我是Study接口中的静态方法");
    }

}
