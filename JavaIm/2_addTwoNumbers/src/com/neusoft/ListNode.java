package com.neusoft;

import java.util.List;

/**
 * @author liuboting
 * @date 2020/8/16 10:01
 */

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
