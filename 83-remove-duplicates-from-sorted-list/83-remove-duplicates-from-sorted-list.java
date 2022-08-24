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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode ptr = head;
        while(ptr != null)
        {
            ListNode temp = ptr.next;
            while(temp!=null && temp.val == ptr.val)
                temp = temp.next;
            ptr.next = temp;
            ptr = temp;
            
        }
        return head;
        
    }
}