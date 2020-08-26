package com.neusoft;

import java.util.Arrays;

/**
 * @author liuboting
 * @date 2020/8/16 14:58
 */

public class Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = l1;
        for (int i = 0; i < 2; i++) {
            l2 = l2.next;
            l2 = new ListNode(2);
        }

        System.out.println(l1.next);
    }
}
