/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA!= null){
           ListNode p = headB;
            while (p!= null){
                if(headA == p){
                    return headA;
                    }
                p = p.next;
            }
            headA = headA.next;
        }
         return null;
    }
   
}