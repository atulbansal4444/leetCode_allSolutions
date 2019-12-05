//141. Linked List Cycle

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
    public boolean hasCycle(ListNode head) {
      if(head == null || head.next == null)
        return false;
      ListNode s = head;
      ListNode f = head.next;
        while(s!=null && f!=null && f.next!=null)  {
            s=s.next;
            f=f.next.next;
            if(s==f)
                return true;
        }      
      return false;
    }
}