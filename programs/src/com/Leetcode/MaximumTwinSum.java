// Leetcode 2137
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
    public int pairSum(ListNode head) {
        int max = 0;
        ListNode temp = head;
        ListNode prev = null; 
        ArrayList<Integer> sums = new ArrayList<>();
        int n = 1;
        
        while(temp != null) {
            sums.add(temp.val);
            ListNode t = temp.next;
            temp.next = prev;
            prev = temp;
            temp = t;
            n++;
        }
        int j = 0;
        while(j < (n / 2)){
            max = Math.max(sums.get(j++) + prev.val, max);
            prev = prev.next;
        }
        
        return max;
    }
}
