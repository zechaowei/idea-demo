package com.xsyu.Middle.Queue_Deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.Queue_Deque
 * Description:     Deque 和 Queue
                 * 阅读源码，学习部分方法
                 * add(E e) 和 offer(E e)操作
                 * //队列的添加操作，是在队尾进行插入（只不过List也是一样的，默认都是尾插）
                 * //如果插入失败，会直接抛出异常
                 * boolean add(E e);
                 * //同样是添加操作，但是插入失败不会抛出异常
                 * boolean offer(E e);
                 * poll() 和 peek()
                 * //仅获取队首元素，不进行出队操作，但是如果队列已经为空，那么会抛出异常
                 * E element();
                 * <p>
                 * //同样是仅获取队首元素，但是如果队列为空，会返回null
                 * E peek();
 *                  双端队列
 *                  Deque<~>
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/8 - 11:34
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("AAA");
        queue.offer("BBB");
        queue.offer("CCC");
        System.out.println(queue);

        //仅获取队首元素，不进行出队操作，因此下面操作会不断输出第一个元素AAA
//        while (!queue.isEmpty())
//            System.out.println(queue.element());

        while (!queue.isEmpty())
            System.out.println(queue.poll());         //移除队首元素，但是如果队列为空，会返回null

        //仅获取队首元素，但是如果队列为空，会返回null
        System.out.println(queue.peek());


        System.out.println("----------------验证 poll() 和 peek() 方法-----------------");
        queue.offer("AAA");
        queue.offer("BBB");
        queue.offer("CCC");
        System.out.println(queue.poll());       //移除队首元素       输出结果为AAA
        System.out.println(queue.peek());       //仅获取队首元素     输出结果为BBB，说明AAA已被移除


        System.out.println("------------   双端队列   -------------------");
        Deque<String> stack = new LinkedList<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
//        while (!stack.isEmpty())
//            System.out.println(stack.pop());
        System.out.println("栈中包含的元素为: " + stack);
        System.out.println("栈的最后一个元素为: " + stack.peekFirst());
        System.out.println("栈的第一个元素为: " + stack.peekLast());

        /**
         * 一下三行代码说明:
         * pop()方法:检索并删除由该deque表示的队列的头(换句话说，该deque的第一个元素)，如果该deque为空则返回null。
         */
        System.out.println(stack.pop());
        System.out.println("----");
        System.out.println(stack);


        System.out.println("----------------------- 优先级(PriorityQueue) -----------------------------");
        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.offer(10);
        queue1.offer(1);
        queue1.offer(5);
        System.out.println("正常输出" + queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());


        //比较器
        System.out.println("比较器---> 从大到小");
        Queue<Integer> queue2 = new PriorityQueue<>((a, b) -> b - a);
        queue2.offer(10);
        queue2.offer(1);
        queue2.offer(5);
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
    }
}
