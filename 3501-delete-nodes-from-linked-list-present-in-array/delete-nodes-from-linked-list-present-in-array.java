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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        //adding the values into the set

        for(int num: nums){
            set.add(num);
        }

        ListNode prev = null;
        ListNode curr = head; 

        while(curr != null){
            if(set.contains(curr.val)){
                //this is the first case, when the head of the liskedlist is itself present in the array
                if(curr.val == head.val){
                    head = head.next;
                }
                else{
                    prev.next = curr.next;
                    
                }
            }
            else{
                //this is the condition whem the node is not present in the nums array
                prev = curr;
            }
            curr = curr.next;
            
        }
        return head;
    }
}