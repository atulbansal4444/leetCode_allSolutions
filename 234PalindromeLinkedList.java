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
  public boolean isPalindrome(ListNode head)
  {
     Stack <Integer> st = new Stack<>();
     ListNode ref = head;
     while(head!=null)
     {
       st.push(head.val);
       head = head.next;
     }
    while(ref!=null)
    {
      if(ref.val!=st.pop())
        return false;
      ref = ref.next;
    }
    return true;
  }
}