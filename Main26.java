public class Main26 {
    public ListNode Merge(ListNode list1,ListNode list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode result = null;
        ListNode cur = null;
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                if(result == null){
                    result = cur = list1;
                }else{
                    cur.next = list1;
                    cur = cur.next;
                }
                list1 = list1.next;
            }else{
                if(result == null){
                    result = cur = list2;
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
        return result;
    }
}
