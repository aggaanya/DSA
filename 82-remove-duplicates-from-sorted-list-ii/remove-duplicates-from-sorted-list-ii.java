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
    public ListNode deleteDuplicates(ListNode head) {
        //taking the temp node which is pointing to head node
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            if(curr.next != null && curr.val == curr.next.val){
                //storing the 1st duplicate value in val
                int val = curr.val;
                while(curr != null && curr.val == val){
                    curr = curr.next;
                }
                if(prev != null){
                    prev.next = curr;
                }else{
                    head = curr;
                }

            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}