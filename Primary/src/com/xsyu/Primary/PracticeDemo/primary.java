package com.xsyu.Primary.PracticeDemo;

/**
 * ClassName: primary
 * Package: com.xsyu.Primary
 * Description: 位运算
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/8 - 13:20
 * @Version: v1.0
 */
public class primary {
    public static void main(String[] args) {
        //正常的右移操作，高位补1，移了还是-1
        //-1  ----> 10000001(原码) ----> 111111111(补码) ----> 符号位为1，右移高位补1，移动后为11111111，结果不变
        int c = -1 >> 1;
        System.out.println("c = " + c);

        //无符号右移:三个大于符号连载一起，移动会直接考虑符号位，高位补0
        int d = -1 >>> 1;   //11111111  ----> 01111111
        System.out.println("d = " + d);
        if (d == Math.pow(2, 31) - 1) {
            System.out.println("结果相等!");
        } else {
            System.out.println("结果有误!");
        }
        System.out.println("");


        /**
         * 位移操作缩写
         */
        int e = -1;
        e = e << 2;
        System.out.println("普通位移操作:e = " + e);
        int f = -1;
        f <<= 2;
        System.out.println("位移操作缩写:e = " + e);
        if (e == f){
            System.out.println("普通位移操作 和 缩写操作得出结果一致");
        }else {
            System.out.println("普通位移操作 和 缩写操作得出结果不一致");
        }

    }
}
