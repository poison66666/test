import java.util.*;


 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Partition {
     public ListNode partition(ListNode pHead,int x){
         if(pHead == null || pHead.next == null){
             return pHead;
         }
         ListNode cur = pHead;
         ListNode Shead = new ListNode(-1);
         ListNode Bhead = new ListNode(-1);
         ListNode Stmp = null;
         ListNode Btmp = null;

         while (cur != null){
             if(cur.val < x){
                 Stmp.next = new ListNode(cur.val);
                 Stmp = Stmp.next;
             }else{
                 Btmp.next = new ListNode(cur.val);
                 Btmp = Btmp.next;
             }
             cur = cur.next;
         }
         //第一个链表的头
         cur = Shead;
         cur.next = Bhead.next;
         return Shead.next;
     }

}
/*
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        ListNode result1 = null;
        ListNode last1 = null;
        ListNode result2 = null;
        ListNode last2 = null;
        ListNode cur = pHead;
        while(cur != null){
            if(cur.val < x){
                ListNode next = cur.next;
                if(result1 == null){
                    result1 = cur;
                }else{
                    last1.next = cur;
                }
                last1 = cur;
                cur = next;
            }else{
                ListNode next = cur.next;
                if(result2 == null){
                    result2 = cur;
                }else {
                    last2.next = cur;
                }
                last2 = cur;
                cur = next;
            }
        }
        if(result1 == null){
            return result2;
        }else{
            last1.next = result2;
            if(last2 != null)
                last2.next = null;
            return result1;
        }
    }
}*/
