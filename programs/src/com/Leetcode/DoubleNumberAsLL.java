// LC 2816
// Runtime: 4 ms, faster than 84.01% of Java
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
Test case 1
Input: head = [1,8,9]
Output: [3,7,8]

Test case 2
Input: head = [9,9,9]
Output: [1,9,9,8]
*/

class Solution {
    public ListNode doubleIt(ListNode head) {
      // head: 1 -> 8 -> 9
        // reverse the list first
      // 1 <-8 <- 9: reversedHead
      
        ListNode reversedHead = reverseList(head);
        ListNode curr = reversedHead;
        int carry = 0;
        while(curr != null){
            int product = (curr.val * 2 ) + carry;
            curr.val = product % 10;
            if(curr.next == null){ // last digit
                if(product > 9){ // if product is two digit number like 18, assign curr node value to 8 and add a new Node(1)
                    carry = product / 10;
                     ListNode lastNode = new ListNode(carry);
                    curr.next = lastNode;
                }
                break;
            } else {
                carry = product / 10;
                curr = curr.next;
            }
        }
      // reverseHead: 8 -> 7 -> 3
      // expected: 3 -> 7 -> 8
      
        return reverseList(reversedHead);
    }
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while(temp != null) {
            ListNode nxt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;
        }
        // prev now is the head of reversed list
        
        return prev;
    }
}
