package com.xsyu.Primary.Tools.arrayTools;

import java.util.Arrays;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.Tools.arrayTools
 * Description: 数组工具类
 * 关键字Arrays
 * 1、打印数组，可以通过toString方法转换字符串
 * 2、数组排序:Arrays.sort(arr)
 * 3、快速填充
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/21 - 15:26
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 8, 2, 0, 9, 7, 3, 6};
        //打印数组
        System.out.println("打印数组 toString() 方法: " + Arrays.toString(arr));
        System.out.println("------------------------------------------------------------");
        //数组排序
        Arrays.sort(arr);       //排序后的数组覆盖了之前的数组元素
        System.out.println("数组排序 sort() 方法: " + Arrays.toString(arr));
        System.out.println("------------------------------------------------------------");

        //快速填充
        int[] array = new int[10];
        Arrays.fill(array, 5);
        System.out.println("快速填充 fill() 方法: " + Arrays.toString(array));
        System.out.println("------------------------------------------------------------");

        //数组拷贝
        //拷贝整个数组
        int[] arr01 = new int[]{1, 2, 3, 4, 5};
        int[] target = Arrays.copyOf(arr01, 5);
        System.out.println("数组拷贝 copyOf() 方法: " + Arrays.toString(target));
        System.out.println("------------------------------------------------------------");

        //拷贝某个范围的内容
        int[] target01 = Arrays.copyOfRange(arr01, 3, 5);
        System.out.println("范围拷贝 copyOfRange() 方法: " + Arrays.toString(target01));
        System.out.println(arr01 == target);
        System.out.println("------------------------------------------------------------");

        //将一个数组中的内容拷贝到其他数组中
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[5];
        System.arraycopy(a, 0, b, 0, 5);//使用System.arraycopy进行搬运
        System.out.println("System.arraycopy() 方法快速搬运: " + Arrays.toString(b));
        System.out.println("------------------------------------------------------------");

        //对于一个有序的数组（从小到大排列）我们可以使用二分快速找到对应的元素在哪个位置
        int[] c = new int[]{1, 3, 45, 552, 62};
        System.out.println("排序前的数组c: " + Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("排序后的数组c: " + Arrays.toString(c));
        System.out.println("有序数组 二分搜索binarySearch() 方法 该数据在数组中的下标位置为: " + Arrays.binarySearch(c, 45));
        System.out.println("------------------------------------------------------------");

        //二维数组打印
        int[][] arrays = new int[][]{
                {2, 8, 4, 1},
                {9, 2, 0, 3}
        };
        System.out.println("二维数组打印 deepToString() 方法: " + Arrays.deepToString(arrays));
        System.out.println("------------------------------------------------------------");

        //判断两个二维中的元素是否相同
        int[] x = {1, 2, 3, 4};
        int[] y = {1, 2, 3, 4};
        System.out.println("判断x 和 y 两个数组是否相同: " + Arrays.equals(x, y));
    }
}
