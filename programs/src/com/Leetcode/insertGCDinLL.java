// https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/

package com.Leetcode;

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
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        
        while(temp.next != null) {
            int a = temp.val;
            int b = temp.next.val;
            int gcd = findGCDrecurs(a,b);
            ListNode node = new ListNode(gcd, temp.next);
            temp.next = node;
            
            temp = temp.next.next;
        }

        return head;
        
    }
    public static int findGCDrecurs(int a, int b) {
        if( b == 0) {
            return a;
        }
        int remainder = a%b;
       // System.out.println(remainder);

        return findGCDrecurs(b, remainder);
    }

}
