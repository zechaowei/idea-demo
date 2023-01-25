package com.xsyu.Primary.Working;

/**
 * ClassName: Demo03plus
 * Package: com.xsyu.Primary.Working
 * Description: Demo03的递归程序设计
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/21 - 23:35
 * @Version: v1.0
 */
public class Demo03plus {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 4));
    }


    private static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right)
            return -1;
        int mid = (left + right) / 2;
        if (arr[mid] > target)
            return binarySearch(arr, left, mid - 1, target);
        else if (arr[mid] < target)
            return binarySearch(arr, mid + 1, right, target);
        else
            return mid;
    }
}
