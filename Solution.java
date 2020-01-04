/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*//*
//非递归
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode list = null;
        ListNode cur = null;
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                if(list == null){
                    cur = list1;
                    list = cur;
                }else{
                    cur.next = list1;
                    cur = cur.next;
                }
                list1 = list1.next;
            }else{
                if(list == null){
                    cur = list2;
                    list = cur;
                }else{
                    cur.next = list2;
                    cur = cur.next;
                }
                list2 = list2.next;
            }
        }
        if(list1 == null){
            cur.next = list2;
        }else{
            cur.next = list1;
        }
        return list;
    }
}*/
//递归
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode res = null;
        if(list1.val <= list2.val){
            res = list1;
            list1.next = Merge(list1.next,list2);
        }else {
            res = list2;
            list2.next = Merge(list1,list2.next);
        }
        return res;
    }
}
