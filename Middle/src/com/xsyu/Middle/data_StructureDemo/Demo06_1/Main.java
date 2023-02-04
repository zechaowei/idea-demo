package com.xsyu.Middle.data_StructureDemo.Demo06_1;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.data_StructureDemo.Demo06_1
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/4 - 23:33
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        HashTable<Integer> table = new HashTable<>();
        for (int i = 0; i < 100; i++) {
            table.insert(i);
        }
        System.out.println(table);
    }
}
