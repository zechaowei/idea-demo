package com.xsyu.Middle.data_StructureDemo.Demo06;

/**
 * ClassName: HashTable
 * Package: com.xsyu.Middle.data_StructureDemo.Demo06
 * Description:     哈希表
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/4 - 23:27
 * @Version: v1.0
 */
public class HashTable<E> {
    private final int TABLE_SIZE = 10;
    private final Object[] TABLE = new Object[TABLE_SIZE];

    public void insert(E obj){
        int index = hash(obj);          //计算哈希值
        TABLE[index] = obj;             //赋值操作
    }

    public boolean contains(E obj){
        int index = hash(obj);
        return TABLE[index] == obj;
    }

    private int hash(E obj){
        int hashCode = obj.hashCode();
        return hashCode % TABLE_SIZE;
    }
}
