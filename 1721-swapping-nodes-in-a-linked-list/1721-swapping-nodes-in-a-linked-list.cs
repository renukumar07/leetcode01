/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode SwapNodes(ListNode head, int k) {
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        ListNode left = head;
        for(int i=1;i<k;i++){
            left = left.next;
        }
        
        ListNode right = head;
        for(int i = 1;i<length-k+1;i++){
            right = right.next;
        }
        int tempVal = left.val;
        left.val = right.val;
        right.val = tempVal;
        return head;
    }
}