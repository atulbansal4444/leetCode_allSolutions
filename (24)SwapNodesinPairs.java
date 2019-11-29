//24. Swap Nodes in Pairs

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
      ListNode dummy=null;
        if(head!=null) 
        {
            dummy = head.next;
        }
      if(head==null || dummy==null)
       {
           return head;
       }
      else 
      {
           ListNode curr = swapPairs(dummy.next);
           dummy.next=head;
           head.next=curr;
           return dummy;
      }
    }
}
