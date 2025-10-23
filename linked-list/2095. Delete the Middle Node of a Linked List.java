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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null ||head.next == null){
            return null;
        }

        //Mängden noder i listan
        int count = 0;
        //The current element initialized to the head
        ListNode curr = head;

        //Beräknar längden på listan
        while(curr!=null){
            count++;
            curr = curr.next;
        }

        int middleNodeIndex = count/2;

        ListNode middleNode;
        ListNode nodeBeforeMiddleNode = null;
        curr = head;

        //Ta dig till mittennoden
        //noden före mittennoden till noden efter mittennoden
        while(middleNodeIndex!=0){
            if(middleNodeIndex == 1){
                //Noden före mittennoden
                nodeBeforeMiddleNode = curr;
            }
            curr = curr.next;
            middleNodeIndex--;
        }
        //Nu är vi på middlenoden
        middleNode = curr;

        //Noden före mittennoden ska kopplas med mittennodens next.
        nodeBeforeMiddleNode.next = middleNode.next;
        middleNode.next = null;

        return head;

    }
}