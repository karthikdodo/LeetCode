/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class LeetCode_Question237 {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        
    }
}