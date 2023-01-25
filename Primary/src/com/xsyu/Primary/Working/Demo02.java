package com.xsyu.Primary.Working;

/**
 * ClassName: Demo02
 * Package: com.xsyu.Primary.Working
 * Description: 二分搜索算法
 * <p>
 * 现在有一个从小到大排序的数组，给你一个目标值`target`，现在我们想要找到这个值在数组中的对应下标，如果数组中没有这个数，请返回`-1`：
 * int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
 * int target = 3;
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/21 - 22:00
 * @Version: v1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
        System.out.println(search(arr, 8));
    }


//    常规查找方法，已经经过优化
//    public static int search(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            //因为这是一个从小到大的数组，如果还没有找到target的话，说明后面更没有了，直接跳出循环，返回-1即可
//            if (arr[i] > target) break;
//            if (arr[i] == target)
//                return i;
//        }
//        return -1;
//    }


    //二分查找
    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            int i = arr[mid];
            if (i < target) {        //说明在右边
                left = mid + 1;
            } else if (i > target) {   //说明在左边
                right = mid - 1;
            } else {                 //说明中间变量就是target
                return mid;
            }
        }
        return -1;
    }
}
