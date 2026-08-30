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
        int c=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            c++;
        }
        if (c==n){
        return head.next;
        }
         int s=c-n-1;
        ListNode temp2=head;
         while(s>0){
            
              temp2=temp2.next;
              s--;
               } 
            temp2.next=temp2.next.next;
            return head;
    }
}