package com.xsyu.Middle.Collections.Demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: Main05
 * Package: com.xsyu.Middle.Collections.Demo01
 * Description:         寻找子集合的位置
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 20:16
 * @Version: v1.0
 */
public class Main05 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 3, 5, 0, 9, 8, 7));
        //测试，4和5的顺序不在一起，但是测试时结果为-1，说明不存在连续的4和5
        System.out.println(Collections.indexOfSubList(list, Arrays.asList(4, 5)));
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.indexOfSubList(list, Arrays.asList(4, 5)));
    }
}
