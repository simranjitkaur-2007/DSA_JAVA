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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
len+=1;
temp=temp.next;
        }
        int size=len/k;
        int xtra=len%k;
 ListNode[] result = new ListNode[k];
 temp=head;
        for(int i=0;i<k;i++){
            result[i]=temp;
           int currSize=size;
        
if(xtra>0){
    currSize++;
    xtra--;
}
        
int count = 1;
while(count < currSize && temp != null) {
    temp = temp.next;
    count++;
}
 if(temp != null) {
        ListNode next = temp.next;
        temp.next = null;
        temp = next;
    }
        }
        

return result;
    }
}