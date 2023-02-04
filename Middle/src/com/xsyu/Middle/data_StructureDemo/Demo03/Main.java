package com.xsyu.Middle.data_StructureDemo.Demo03;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.data_StructureDemo.Demo03
 * Description: 栈
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/4 - 19:27
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
