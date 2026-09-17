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
        if(head==null ||head.next==null)
        return head;
        ListNode curr=head;
        while(curr.next!=null){
            ListNode nxt=curr.next;
            int ans=remainder(curr.val,nxt.val);
         ListNode gcD=new ListNode(ans);
         curr.next=gcD;
         gcD.next=nxt;
         curr=nxt;
        }
        return head;
    }
    private int remainder(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    
    }