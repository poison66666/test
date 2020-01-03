/*
import java.util.*;
*/
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*//*

public class Plus {
    public static ListNode plusAB(ListNode a, ListNode b) {
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }
        ListNode p1 = a,p2 = b;
        ListNode head = new ListNode(0);
        ListNode p = head;
        int sum = 0;
        while (p1 != null || p2 != null || sum != 0){
            if(p1 != null){
                sum += p1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                sum += p2.val;
                p2 = p2.next;
            }
            p.next = new ListNode(sum % 10);
            sum /= 10;
            p = p.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode A = new ListNode(123);
        ListNode B = new ListNode(321);
        System.out.println(plusAB(A,B).val);
    }
}*/



public class Plus {
    public static ListNode plusAB(ListNode a, ListNode b) {
        //将链表转为整数
        int aValue = listNodeConvertIntValue(a);
        int bValue = listNodeConvertIntValue(b);

        //计算求和
        int sumValue = aValue + bValue;

        //将整数转化为链表
        return intValueConvertListNode(sumValue);
    }

    //将整数转化为链表
    private static ListNode intValueConvertListNode(int value) {
        char[] array = String.valueOf(value).toCharArray();
        ListNode node = new ListNode(Integer.parseInt(String.valueOf(array[array.length-1])));
        ListNode cur = node;
        for(int i = array.length-2;i>=0;i--){
            ListNode newNode = new ListNode(Integer.parseInt(String.valueOf(array[i])));
            cur.next = newNode;
            cur = newNode;
        }
        return node;
    }

    //将链表转化为整数
    private static int listNodeConvertIntValue(ListNode node) {
        StringBuilder sb = new StringBuilder();
        ListNode cur = node;
        while (cur != null){
            sb.append(cur);
            cur = cur.next;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
}