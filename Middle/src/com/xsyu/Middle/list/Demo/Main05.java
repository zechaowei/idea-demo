package com.xsyu.Middle.list.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Main05
 * Package: com.xsyu.Middle.list.Demo01
 * Description:     removeIf(...  )   删除满足给定谓词的次集合的所有元素。
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/5 - 20:03
 * @Version: v1.0
 */
public class Main05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("AAAA");
        list.add("AAAAA");
        list.removeIf(s -> s.length() == 3);        //Lambda表达式，参考Primary --> innerclassDemo --> Demo04(JavaSE比较 四 重制版)
        System.out.println(list);
    }
}
