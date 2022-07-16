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
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode ptr = head;
        ListNode prev = null;
        while(ptr != null)
        {
            if (ptr.next == null)  // for odd no of nodes;
                break;
            
            ListNode temp = ptr.next;
        
            ptr.next = temp.next;
            
            temp.next = ptr;
            
            if(prev != null)
                prev.next = temp;
            if(prev == null)
                head = temp;
            
            prev = ptr;
            
            ptr = ptr.next;
            
            
        }
        
        return head;
    }
}