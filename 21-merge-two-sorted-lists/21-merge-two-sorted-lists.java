/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = null;
        ListNode head = null;
        
        while(list1!=null && list2!=null)
        {
            int temp;
            if(list1.val<list2.val)
            {temp = list1.val; list1 = list1.next;}
            else 
            {temp = list2.val; list2 = list2.next;}
            ListNode ptr = new ListNode(temp,null);
            if(merge == null)
            {merge = ptr;head = merge;}
            else
            { 
                merge.next = ptr;
                merge = merge.next;
            }
        }
        while(list1!=null)
        {
            ListNode ptr = new ListNode(list1.val,null);
            if(merge == null)
            {merge = ptr;head = merge;}
            else
            { 
                merge.next = ptr;
                merge = merge.next;
            }
            list1 = list1.next;
        }
        while(list2!=null)
        {
            ListNode ptr = new ListNode(list2.val,null);
            if(merge == null)
            {merge = ptr; head = merge;}
            else
            { 
                merge.next = ptr;
                merge = merge.next;
            }
            list2 = list2.next;
        }
        return head;
    }
}