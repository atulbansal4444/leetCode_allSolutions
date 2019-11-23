//19. Remove Nth Node From End of List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = head;
        int j=0;
        if(dummy==null || dummy.next==null) {
            return null;
        }
        while(dummy!=null) {
            dummy = dummy.next;
            j++;
        }
        if(n==j)
        {
            return head.next;
        }
        n = j-n;
        dummy = head;
        for(int i=0;i<n;i++)
        {
            if(i==n-1) {
                head.next = head.next.next;
            }
            else {
                head = head.next;
            }
            
        }
        return dummy;
    }
}