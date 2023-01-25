package com.xsyu.Primary.stringDemo.StringBuilderDemo;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.stringDemo.StringBuilderDemo
 * Description: StringBuilder类
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/17 - 21:29
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();            //一开始创建时，内部什么都没有
        builder.append("AAA");              //可以使用append方法来将字符串拼接到后面
        builder.append("BBB");

        //根据下标删除选择区域内容
        builder.delete(0, 2);
        System.out.println(builder);

        //替换
        builder.replace(0, 3, "CCC");
        System.out.println(builder);

        //反转
        builder.reverse();
        System.out.println(builder);

        //链式
        builder
                .append("AAA")
                        .append("BBB")
                                .append("CCC")
                                        .reverse();
        System.out.println(builder);        //字符串编辑完成后，就可以使用toString转换为字符串了
    }
}
