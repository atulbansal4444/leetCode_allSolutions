//234. Palindrome Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null)
        {
            return true;
        }
        ListNode start = head;
        Stack<Integer> st = new Stack<>();
        while(start!=null)
        {
            st.push(start.val);
            start = start.next;
        }
        start = head;
        while(start != null)
        {
            if(start.val != st.pop())
            {
                return false;
            }
             start = start.next;   
        }
        return true;
    }
}