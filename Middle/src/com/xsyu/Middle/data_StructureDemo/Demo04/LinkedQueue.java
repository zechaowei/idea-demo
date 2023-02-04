package com.xsyu.Middle.data_StructureDemo.Demo04;

import java.util.NoSuchElementException;

/**
 * ClassName: LinkedQueue
 * Package: com.xsyu.Middle.data_StructureDemo.Demo04
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/4 - 19:51
 * @Version: v1.0
 */
public class LinkedQueue<E> {
    private static class Node<E>{
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    private final Node<E> head = new Node<>(null);

    public void offer(E element){
        //tail不断向后查询，直到最后一个即为插入元素，先进即为最后一个，后出即为第一个
        Node<E> tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = new Node<>(element);
    }

    //出队列
    public E poll(){
        if (isEmpty())
            throw new NoSuchElementException("队列为空");
        E e = head.next.element;
        head.next = head.next.next;
        return e;
    }

    public E peek(){
        if (isEmpty())
            throw new NoSuchElementException("队列为空");
        return head.next.element;
    }

    public boolean isEmpty(){
        return head.next == null;
    }
}
