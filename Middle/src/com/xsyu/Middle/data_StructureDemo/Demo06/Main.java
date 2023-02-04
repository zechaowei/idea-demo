package com.xsyu.Middle.data_StructureDemo.Demo06;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.data_StructureDemo.Demo06
 * Description:     哈希表
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/4 - 23:27
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        HashTable<String> table = new HashTable<>();
        //判断哈希表中是否包含该元素，contains()判断即可
        String str = "AAA";
        System.out.println(table.contains(str));
        table.insert(str);
        System.out.println(table.contains(str));


    }
}
