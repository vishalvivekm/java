/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
Memory Usage: 44.8 MB, less than 14.82% of Java online submissions for Add Two Numbers.
*/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode head = ans;
        int carry = 0;

        
        while(l1 != null || l2 != null) {
        int firstDigit = 0;
        int secondDigit = 0;
            if (l1 != null) {
                firstDigit = l1.val;
            }
            if ( l2 != null){
                secondDigit = l2.val;
            }
            int sum = firstDigit + secondDigit + carry;
            ListNode node = new ListNode(sum % 10);
            ans.next = node;
            ans = node;
            carry = sum / 10;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
            if(l1 == null && l2 == null && carry != 0) {
                ans.next = new ListNode(carry);
                
            }
            
        }
        return head.next;
    }
}
