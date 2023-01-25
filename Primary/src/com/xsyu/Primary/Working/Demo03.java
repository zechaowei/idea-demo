package com.xsyu.Primary.Working;

/**
 * ClassName: Demo03
 * Package: com.xsyu.Primary.Working
 * Description: 青蛙跳台阶问题
 *
 * 现在一共有n个台阶，一只青蛙每次只能跳一阶或是两阶，那么一共有多少种跳到顶端的方案？
 *
 * 例如n=2，那么一共有两种方案，一次性跳两阶或是每次跳一阶。
 *
 * 现在请你设计一个Java程序，计算当台阶数为n的情况下，能够有多少种方案到达顶端。
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/21 - 22:32
 * @Version: v1.0
 */
public class Demo03 {
    public static void main(String[] args) {
        System.out.println(jump(4));
    }

    private static int jump(int n){
        int[] arr = new int[n + 1]; //当n = 0时的情况不好理解
        arr[0] = 1;
        arr[1] = 1;
        /**
         * 解题思路：从后往前看
         *          eg:三个跳台，1/2/3
         *              方法：1 -> 2 -> 3
         *                   1 -> 3
         *               eg:1/2/3/4
         *               方法：1 -> 2 -> 3 -> 4
         *                    1 -> 3 -> 4.。。
         *     假设有n个台阶，从最后一个台阶看，青蛙只能从n-1或者n-2这两个台阶上面跳到第n阶台阶，因此只需要知道前n-1个和n-2个台阶的方法即可，获取n-1和n-2台阶的方法同理
         */
        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];
        return arr[n];
    }
}
