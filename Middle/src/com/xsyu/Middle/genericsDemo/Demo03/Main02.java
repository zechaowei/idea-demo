package com.xsyu.Middle.genericsDemo.Demo03;

import java.util.Arrays;

/**
 * ClassName: Main02
 * Package: com.xsyu.Middle.genericsDemo.Demo03
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/25 - 22:41
 * @Version: v1.0
 */
public class Main02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 4, 5, 2, 6, 3, 0, 7, 9, 8};
        Arrays.sort(arr);
        System.out.println("升序排序: " + Arrays.toString(arr));
        Arrays.sort(arr, (o1, o2) -> {
            return o2 - o1;
            //compare方法要求返回一个int来表示两个数的大小关系，大于0表示大于，小于0表示小于
            //这里直接o2-o1就行，如果o2比o1大，那么肯定应该排在前面，所以说返回正数表示大于
        });

        System.out.println("降序排序: " + Arrays.toString(arr));
    }
}
