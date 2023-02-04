package com.xsyu.Middle.data_StructureDemo.Demo02;

/**
 * ClassName: LinkedList
 * Package: com.xsyu.Middle.data_StructureDemo.Demo02
 * Description: 链表 增删查
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/4 - 14:45
 * @Version: v1.0
 */
public class LinkedList<E> {

    private static class Node<E> {
        private E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    private final Node<E> head = new Node<>(null);
    private int size;

    public void add(E element, int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("插入位置非法，合法的插入位置为: 0 ~ " + size);
        Node<E> prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node<E> node = new Node<>(element);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index > size - 1)
            throw new IndexOutOfBoundsException("删除位置非法，合法的删除位置为: 0 ~ " + (size - 1));
        Node<E> prev = head;
        //到index位置
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        E e = prev.next.element;
        prev.next = prev.next.next;
        size--;
        return e;
    }

    public E get(int index){
        if (index < 0 || index > size - 1)
            throw new IndexOutOfBoundsException("非法的位置，合法的位置为: 0 ~ " + (size - 1));
        Node<E> node = head;
        while (index-- >= 0){
            node = node.next;
        }
        return node.element;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<E> node = head.next;           //从第一个结点开始，一个一个遍历，遍历一个就拼接到字符串上去
        while (node != null) {
            builder.append(node.element).append("  ");
            node = node.next;
        }
        return builder.toString();
    }

}
