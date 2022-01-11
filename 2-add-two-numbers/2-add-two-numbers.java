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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = null;
        ListNode sum1 = null;
        int carry =0;
        while(l1 != null && l2!= null)
        {
            int temp = l1.val+l2.val+carry;
            ListNode ptr = new ListNode(temp%10, null);
            carry = temp/10;
            if(sum == null)
            {sum = ptr; sum1 = ptr;}
            else
            {
                sum.next = ptr;
                sum = ptr;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null)
        {
            int temp = l1.val+carry;
            ListNode ptr = new ListNode(temp%10, null);
            carry = temp/10;
            if(sum == null)
            {sum = ptr; sum1 = ptr;}
            else
            {
                sum.next = ptr;
                sum = ptr;
            }
            l1 = l1.next;
        }
        while(l2 != null)
        {
            int temp = l2.val+carry;
            ListNode ptr = new ListNode(temp%10, null);
            carry = temp/10;
            if(sum == null)
            {sum = ptr; sum1 = ptr;}
            else
            {
                sum.next = ptr;
                sum = ptr;
            }
            l2 = l2.next;
        }
        if(carry != 0)
        {
            ListNode ptr = new ListNode(carry, null);
            sum.next = ptr;
            sum = ptr;
        }
        return sum1;
    }
}