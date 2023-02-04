package com.xsyu.Middle.data_StructureDemo.Demo04;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.data_StructureDemo.Demo04
 * Description: 队列：先进后出
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/4 - 19:51
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        while (!queue.isEmpty())
            System.out.println(queue.poll());
    }
}
