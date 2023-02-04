package com.xsyu.Middle.data_StructureDemo.Demo05;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.data_StructureDemo.Demo05
 * Description: 二叉树
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/4 - 21:59
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        TreeNode<Character> a = new TreeNode<>('A');
        TreeNode<Character> b = new TreeNode<>('B');
        TreeNode<Character> c = new TreeNode<>('C');
        TreeNode<Character> d = new TreeNode<>('D');
        TreeNode<Character> e = new TreeNode<>('E');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        System.out.println(a.left.left.element);
    }

    public static class TreeNode<E> {
        public E element;
        public TreeNode<E> left, right;

        public TreeNode(E element) {
            this.element = element;
        }
    }
}
