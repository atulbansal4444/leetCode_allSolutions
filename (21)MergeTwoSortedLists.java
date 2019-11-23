//21. Merge Two Sorted Lists


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode dummyNode = new ListNode(0);
        ListNode tail = dummyNode;
        while(true)
        {
            if(A == null) 
            { 
                tail.next = B; 
                break; 
            } 
            if(B == null) 
            { 
                tail.next = A; 
                break; 
            }
            if(A.val>B.val)
            {
                tail.next = B;
                B = B.next;
                
            }
            else
            {
                tail.next = A;
                A = A.next;
            }
            tail = tail.next;
        }
        return dummyNode.next;
    }
}