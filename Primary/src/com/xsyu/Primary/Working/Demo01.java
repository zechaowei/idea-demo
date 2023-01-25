package com.xsyu.Primary.Working;

import java.util.Arrays;

/**
 * ClassName: Demo01
 * Package: com.xsyu.Primary.Working
 * Description: 冒泡排序算法
 * 从小到大排序下面数组中的元素
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/21 - 20:46
 * @Version: v1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 2, 9, 0, 6, 1, 8, 4};

        //直接使用 sort() 方法排序
        int[] target = Arrays.copyOf(arr, 10);
        Arrays.sort(target);
        System.out.println("使用 数组工具类 进行排序: " + Arrays.toString(target));

        //自定义方法sort()方法
        sort(arr);
        System.out.println("自定义sort方法排序: " + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
}
