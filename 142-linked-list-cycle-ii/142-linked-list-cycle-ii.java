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
    
    
    //More efficient approach 2 pointers Floyd's cycle detection
    //Once cycle is detected point one pointer head, move each pointer one step at once, the node where  the 2 pointers meet is the required node
    
    public ListNode detectCycle(ListNode head) {
        /*
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
        */
        if(head == null)
            return null;
        if(head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
            return null;
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}