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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        
        if(length < 3){
            return head;
        }
        
        ListNode curr = head;
        ListNode prev = null;
        int count = 1;
        while(curr != null){
            count = Math.min(count, length);
            length -= count;
            
            if(count % 2 == 1){
                for(int i = 0; i < count; i++){
                    prev = curr;
                    curr = curr.next;
                }
            }else{
                for(int i = 1; i < count; i++){
                    ListNode next = curr.next;
                    curr.next = next.next;
                    next.next = prev.next;
                    prev.next = next;
                }
                prev = curr;
                curr= curr.next;
            }
            count++;
        }
        return head;
    }
}