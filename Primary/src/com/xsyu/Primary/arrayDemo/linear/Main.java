package com.xsyu.Primary.arrayDemo.linear;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.arrayDemo.linear
 * Description: 一维数组
 *          1、数组本身也是一个对象，数组对象也是具有属性的，比如长度
 *          2、类型[] 变量名称 = new 类型[数组大小];
 *             类型 变量名称[] = new 类型[数组大小];  //支持C语言样式，但不推荐！
 *             类型[] 变量名称 = new 类型[]{...};  //静态初始化（直接指定值和大小）
 *             类型[] 变量名称 = {...};   //同上，但是只能在定义时赋值
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/17 - 16:21
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("基本数据类型 的 静态初始化数组 a 的第一个元素为: " + a[0]);
        String[] b = new String[5];
        System.out.println("引用数据类型 的 静态初始化数组 b 的第一个元素为: " + b[0]);

        //数组本身也是一个对象，数组对象也是具有属性的，比如长度
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println("数组 array 的第一个元素为: " + array[0]);
        System.out.println("数组 array 的长度为: " + array.length);

        //类的重写
        System.out.println(array.toString());
        System.out.println(array.equals(array));
        //所以说通过`toString()`打印出来的结果，好丑，只不过我们可以发现，数组类型的类名很奇怪，是`[`开头的。
        //
        //因此，如果我们要打印整个数组中所有的元素，得一个一个访问
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("--------");

        //equals方法重写
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {1, 2, 3, 4, 5};
        System.out.println("数组 x 和 y 是否相等" + equals(x, y));


        //很遗憾，除了clone()之外，这些方法并没有被重写，也就是说依然是采用的Object中的默认实现
        int[] clone = array.clone();
        System.out.print("clone方法: ");
        for (int i = 0; i < clone.length; i++) {
            System.out.print(clone[i] + " ");
        }
        System.out.println();
        //foreach语法 语法糖
        System.out.println("foreach 语法糖: ");
        for (int z : array){
            System.out.print(z + " ");
        }
        System.out.println();
        System.out.println("---------");

        //final的数组可以修改值，但是不能够修改其对象
//        final int[] array2 = new int[]{1, 2, 3};
//        array2 = new int[]{4, 5, 6};
        int[]  array3 = new int[]{1, 2, 3};
        System.out.println(array3[0] = 10);

    }

    //equals()方法重写
    private static boolean equals(int[] x, int[] y){
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) return false;
        }
        return true;
    }
}
