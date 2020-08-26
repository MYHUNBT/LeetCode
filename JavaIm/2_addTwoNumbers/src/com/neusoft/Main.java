package com.neusoft;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ListNode listNode = new ListNode(1);
//        listNode.val = 2;
//        listNode.next = new ListNode(3);
//        while (listNode.next != null){
//            System.out.println(listNode);
//            listNode = listNode.next;
//        }

        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//        while (true){
//            System.out.println(listNode1);
//            listNode1 = listNode1.next;
//            if(listNode1.next == null){
//                System.out.println(listNode1);
//                break;
//            }
//        }
        ListNode l2 = new ListNode(0);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//        while (true){
//            System.out.println(listNode2);
//            listNode2 = listNode2.next;
//            if(listNode2.next == null){
//                System.out.println(listNode2);
//                break;
//            }
//        }
//        System.out.println(addTwoNumbers(l1, l2));
        System.out.println(addTwoNumbers(l1, l2));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = l1;
        if(l1 == null || l2 == null){
            return l1 == null? l2:l1;
        }
        int outer = 0;
        while (true){
            if(l1 == null){
                while (true){
                    if(l2 == null){
                        l1.val += outer;
                        break;
                    }
                    l1 = l2;
                    l2 = l2.next;
                    l1 = l1.next;
                }
                return l3;
            }
            if(l2 == null){
                l1.val = l1.val + outer;
                return l3;
            }
            l1.val += l2.val + outer;
            outer = 0;
            if(l1.val >= 10){
                l1.val -= 10;
                outer = 1;
            }
            l1 = l1.next;
            l2 = l2.next;

        }
    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2){
        if(l1 == null || l2 == null){
            return l1 == null? l2:l1;
        }
        int list1 = 0;
        int list2 = 0;
        int n = 10;
        int mi1 = 0;
        int mi2 = 0;
        while (true){
            if(l1.next == null){
                list1 += (int)(l1.val * Math.pow(n,mi1++));
                break;
            }
            list1 += (int)(l1.val * Math.pow(n,mi1++));
            l1 = l1.next;
        }
        while (true){
            if(l2.next == null){
                list2 += (int)(l2.val * Math.pow(n,mi2++));
                break;
            }
            list2 += (int)(l2.val * Math.pow(n,mi2++));
            l2 = l2.next;
        }
        int sum = list1+list2;
        int max = mi1>mi2? (mi1-1):(mi2-1);
        String[] split = String.valueOf(sum).split("");
//        ListNode l3 = new ListNode(Integer.parseInt(split[split.length-1]));
//        ListNode first = null;
//        ListNode l3 = new ListNode(Integer.parseInt(split[0]));
        ListNode first = new ListNode(0);
        ListNode l3 = first;
        for (int i = max - 1; i >= 0; i--) {
            l3 = new ListNode(Integer.parseInt(split[i]));
            l3 = l3.next;
        }
        return first.next;
    }

}
