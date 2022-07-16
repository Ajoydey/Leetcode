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
    public ListNode swapNodes(ListNode head, int k) {
        
        int count =0;
        ListNode ptr = head;
        while(ptr != null)
        {
            count++;
            ptr = ptr.next;
        }
        
        int[] arr = new int[count];
        
        ptr = head;
        int i=0;
        while(ptr != null)
        {
            arr[i++] = ptr.val;
            ptr=ptr.next;
        }
        int temp = arr[k-1];
        arr[k-1] = arr[count-k];
        arr[count-k] = temp;
        i=0;
        ptr= head;
        while(ptr!=null)
        {
            ptr.val = arr[i++];
            ptr= ptr.next;
        }
        return head;
    }
}