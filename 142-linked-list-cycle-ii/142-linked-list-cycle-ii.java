/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> cycle = new HashSet<>();
        ListNode  ptr = head;
        while(ptr != null)
        {
            if(cycle.contains(ptr))
                return ptr;
            cycle.add(ptr);
            ptr=ptr.next;
        }
        return null;
    }
}