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
    public ListNode middleNode(ListNode head) {
        ListNode oneStep=head;
        ListNode twoStep=head;
        while(twoStep!=null && twoStep.next!=null ){
            oneStep=oneStep.next;
            twoStep=twoStep.next.next;
        }
        return oneStep;
    }
}