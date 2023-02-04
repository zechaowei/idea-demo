package com.xsyu.Middle.data_StructureDemo.Demo01;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.data_StructureDemo.Demo01
 * Description: 顺序表的基本操作
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/3 - 17:33
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
//        list.add("AAA", 0);
//        list.add("BBB", 1);
//        list.add("CCC", 3);
//        //测试扩容操作
//        for (int i = 0; i < 30; i++) {
//            list.add(i + "", i);
//        }

        //测试删除操作
        list.add("AAA", 0);
        list.add("BBB", 1);
        list.add("CCC", 2);
        list.remove(1);     //下标为1的元素，即BBB

        System.out.println("查询位置: " + list.get(1));
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
/**
 * branch 'master' set up to track 'origin/master'.
 */