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
    public void reorderList(ListNode head) {
        Stack<ListNode> check = new Stack<>();
        int count = 0;
        ListNode ptr = head;
        while(ptr!=null)
        {
            check.push(ptr);
            count+=1;
            ptr=ptr.next;
        }
        ptr = head;
        int i=0;
        while(i<count/2)
        {
            ListNode temp = check.pop();
            temp.next = ptr.next;
            ptr.next = temp;
            ptr = ptr.next.next;
            i++;
        }
        
            ptr.next = null;
    }
}