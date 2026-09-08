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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       ListNode a=slow.next;
       ListNode b=head;;
        slow.next = null;

        ListNode l1=sortList(a);
         ListNode l2=sortList(b);
    return sortLL(l1,l2);
    }

    public ListNode sortLL(ListNode l1,ListNode l2){
        ListNode dummyNode=new ListNode(-1,null);
        ListNode temp=dummyNode;
        while(l1!=null && l2!=null){
        if(l1.val<=l2.val){
            temp.next=l1;
            l1=l1.next;
        }
        else{
            temp.next=l2;
            l2=l2.next;
        }
        temp=temp.next;
        }
    if(l1!=null)
    temp.next=l1;
    else
    temp.next=l2;
        
        return dummyNode.next;
    }
}