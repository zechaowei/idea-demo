package com.xsyu.Middle.data_StructureDemo.Demo02;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.data_StructureDemo.Demo02
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/4 - 14:44
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("AAA", 0);
        list.add("BBB", 1);
        list.add("CCC", 2);
        list.remove(0);
        System.out.println(list);
        for (int i = 0; i < 2; i++) {
            System.out.println("第" + (i + 1) + "个位置的元素为: " + list.get(i));
        }
    }
}
