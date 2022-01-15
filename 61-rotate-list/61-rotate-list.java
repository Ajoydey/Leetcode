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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0)
            return head;
        int count = 0;   //to count number of nodes
        ListNode last = null;  //to store last node
        ListNode ptr = head;   //to move accross the linked list
        while(ptr != null)   //Can use ptr.next!=null saving space
        {
            last = ptr;
            ptr = ptr.next;
            count+=1;
        }
        if(k%count == 0) //check if k is a multiple of number of nodes
            return head;
        if(k>count)  //check if k is greater than number of nodes
            k = k%count;
        
        
        last.next = head;
        ptr = head;
        int flag = 0;
        while(flag<count-k)
        {
            last = ptr;
            ptr = ptr.next;
            flag+=1;
        }
        last.next = null;
        head = ptr;
        return head;
    }
}