class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        int n = 1;
        while (temp.next != null) {
            temp = temp.next;
            n++;
        }
        k = k % n;
        if (k == 0)
            return head;
        temp.next=head;
        ListNode temp2=head;
        int steps=n-k-1;

        while(steps>0) {
            temp2=temp2.next;
            steps--;
        }

        head=temp2.next;
        temp2.next=null;
        return head;
    }
}