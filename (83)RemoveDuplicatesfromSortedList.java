//83. Remove Duplicates from Sorted List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      ListNode ref = head;
        while(head!=null && head.next!=null) {
          if(head.next.next == null && head.val==head.next.val)
          {
            head.next = null;
          }
          if(head.next!=null && head.val == head.next.val)
          {
            head.next = head.next.next;
          } 
          else
          {
            head = head.next;
          }
        }
      return ref;
    }
}