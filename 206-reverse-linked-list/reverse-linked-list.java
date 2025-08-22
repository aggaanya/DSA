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
    public ListNode reverseList(ListNode head) {
        //creating a stack
        Stack<Integer> stack = new Stack();
        ListNode temp = head;
        while(temp != null){
            stack.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            temp.val = stack.pop();
            temp = temp.next;
        }
        return head;
    }
}
//TC: O(2n)
//SC: O(2n)