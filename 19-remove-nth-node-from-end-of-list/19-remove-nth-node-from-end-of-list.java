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
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int fromFront = len-n;
        if(fromFront == 0) return head.next;
        temp = head;
        ListNode prev = null;
        for(int i = 0;i<fromFront;i++){
            prev = temp;
            temp=temp.next;
        }
        prev.next = temp.next;
        return head;
    }
}