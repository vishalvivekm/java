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
// https://leetcode.com/problems/swap-nodes-in-pairs/
/*
runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
*/
class Solution {
    public ListNode swapPairs(ListNode head) {
        return r(head);
    }
    private static ListNode r(ListNode node) {
        if (node == null) {
            return null;
        }
        ListNode nextNode = node.next;
        if(nextNode == null) return node;
        ListNode temp = nextNode.next;
        nextNode.next = node;
        node.next = r(temp);
        
        return nextNode;
    }
}
