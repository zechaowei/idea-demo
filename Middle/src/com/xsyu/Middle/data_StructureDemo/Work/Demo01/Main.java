package com.xsyu.Middle.data_StructureDemo.Work.Demo01;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.data_StructureDemo.Work.Demo01
 * Description: 反转链表
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/5 - 10:27
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {

    }

    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null, node = head;
        while (node != null){
            ListNode tmp = node;
            node = node.next;
            tmp.next = prev;
            prev = tmp;
        }
        return prev;
    }
}
