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
    public ListNode mergeKLists(ListNode[] lists) {
        //Min Heap
        
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        
        for(ListNode list: lists)
        {
            ListNode ptr = list;
            while(ptr != null)
            {
                ans.add(ptr.val);
                ptr = ptr.next;
            }
        }
        
        ListNode list = null, head = null;
        
        while(!(ans.isEmpty()))
        {
            ListNode temp = new ListNode(ans.poll(), null);
            
            if(list == null)
            {
                list = temp;
                head = list;
            }
            else
            {
                list.next = temp;
                list = list.next;
            }
        }
        return head;
        
    }
}