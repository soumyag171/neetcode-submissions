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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;

        while(curr !=null){
            length++;
            curr = curr.next;
        }
        if(length==n){
            return head.next;
        }
        curr = head;
        for(int i=1;i<length-n;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
        // ListNode dummy = new ListNode(0);
        // dummy.next = head;
        // ListNode left = dummy;
        // ListNode right = dummy;

        // for (int i = 0; i < n; i++) {
        //     right = right.next;
        // }
        // while (right.next != null) {
        //     left = left.next;
        //     right = right.next;
        // }
        // left.next = left.next.next;
        // return dummy.next;
    }
}
