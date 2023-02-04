package com.xsyu.Middle.data_StructureDemo.Demo03;

import java.util.NoSuchElementException;

/**
 * ClassName: LinkedStack
 * Package: com.xsyu.Middle.data_StructureDemo.Demo03
 * Description: 栈
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/4 - 19:28
 * @Version: v1.0
 */
public class LinkedStack<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }


    private final Node<E> head = new Node<E>(null);


    //入栈   -----> 头结点入栈
    public void push(E element) {
        Node<E> node = new Node<>(element);
        node.next = head.next;
        head.next = node;
    }

    //出栈
    public E pop() {
        if (isEmpty())
            throw new NoSuchElementException("栈为空");
        E e = head.next.element;
        head.next = head.next.next;
        return e;
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return head.next == null;
    }
}
