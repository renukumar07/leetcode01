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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode tempAns = ans;
        int carry = 0;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int a = 0;
        int b = 0;
        int c = 0;
        while(temp1!=null || temp2!=null){
            if(temp1 == null){
                a = 0;
            }else{
                a = temp1.val;
                temp1 = temp1.next;
            }
            
            if(temp2 == null){
                b = 0;
            }else{
                b = temp2.val;
                temp2 = temp2.next;
            }
            
            c = a+b+carry;
            carry = c/10;
            c = c%10;
            ListNode node = new ListNode();
            node.val = c;
            tempAns.next = node;
            tempAns = tempAns.next;
        }
        if(carry>0){
            ListNode node = new ListNode();
            node.val = carry;
            tempAns.next = node;
        }
        return ans.next;
    }
}