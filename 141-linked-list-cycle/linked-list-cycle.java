/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //this is the condition that the list may be empty or list have only one node
        //hence no loop
        if (head == null || head.next == null){
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        while (head != null){
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}