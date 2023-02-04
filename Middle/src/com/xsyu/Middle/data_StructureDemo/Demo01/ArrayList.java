package com.xsyu.Middle.data_StructureDemo.Demo01;

/**
 * ClassName: ArrayList
 * Package: com.xsyu.Middle.data_StructureDemo.Demo01
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/3 - 17:33
 * @Version: v1.0
 */
public class ArrayList<E> {
    private int size = 0;
    private int capacity = 10;
    private Object[] array = new Object[capacity];

    public void add(E element, int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("插入位置非法，合法的插入位置为: 0 ~ " + size);
        //扩容操作
        if (size >= capacity) {
            int newCapacity = capacity + (capacity >> 1);       //扩容为原来的1.5倍，右移相当于除以2
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            capacity = newCapacity;
        }
        for (int i = size; i > index; i--)
            array[i] = array[i - 1];
        array[index] = element;
        size++;
    }


    //删除操作
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index < 0 || index > size - 1)
            throw new IndexOutOfBoundsException("删除位置非法，合法的删除位置为: 0 ~ " + (size - 1));
        E e = (E) array[index];
        for (int i = index; i < size; i++)
            array[i] = array[i + 1];
        size--;
        return e;
    }

    @SuppressWarnings("unchecked")
    public E get(int index){
        if (index < 0 || index > size - 1)
            throw new IndexOutOfBoundsException("查询位置非法，合法的查询位置为: 0 ~ " + (size - 1));
        return (E) array[index];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString() {
        System.out.println("顺序表的总容量: " + capacity);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append(array[i]).append("  ");
        }
        return builder.toString();
    }
}
