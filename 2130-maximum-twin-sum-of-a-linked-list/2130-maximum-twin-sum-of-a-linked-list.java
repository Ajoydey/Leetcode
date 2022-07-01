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
    public int pairSum(ListNode head) {
        ListNode mid = reverse(middle(head));
        int max = Integer.MIN_VALUE;
        while(mid != null)
        {
            if(head.val+mid.val > max)
                max = head.val + mid.val;
            head = head.next;
            mid = mid.next;
        }
        return max;
        
    }
    public ListNode middle(ListNode node){
        ListNode slow = node;
        ListNode fast = node;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode rev = null;
        while(head != null){
            ListNode ptr = head.next;
            head.next = rev;
            rev = head;
            head = ptr;
        }
        return rev;
    }
}