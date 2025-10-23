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

        Stack<ListNode> stack = new Stack<>();
        if(head == null) return null;
        //First node
        ListNode curr = head;

        //All nodes in a stack
        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }

        ListNode newHead = stack.pop();
        newHead.next = !stack.isEmpty() ? stack.peek() : null;

        ListNode curr2;
        while(!stack.isEmpty()){
            curr2 = stack.pop();
            if(stack.isEmpty()){
                curr2.next = null;
            }else{
                curr2.next = stack.peek();
            }

        }
        return newHead;

    }
}