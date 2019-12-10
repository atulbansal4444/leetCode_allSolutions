/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution
{
    public ListNode removeElements(ListNode head, int val)
    {
      if(head==null) 
      {
        return null;
      }
      while(head.val==val)
      {
        head = head.next;
        if(head==null)
        {
          return null;
        }
      }
      ListNode ref = head;
      while(ref.next!=null)
      {
        if(ref.next.val==val)
        {
          ref.next=ref.next.next;
        }
        else
        {
          ref=ref.next;
        }
      }
      return head;
    }
}