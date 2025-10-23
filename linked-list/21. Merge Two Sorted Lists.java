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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //you are given the heads of two sorted linked lists list1 and list2
        //merge the two lists into one sorted list. The list should be made by
        //splicing togther the nodes of the first two lists.

        if (list1 == null && list2 == null)
            return null;
        if (list1 == null && list2 != null)
            return list2;
        if (list1 != null && list2 == null)
            return list1;

        ListNode head;

        if (list1.val >= list2.val) {
            head = list2;
            list2 = list2.next;
        } else {
            head = list1;
            list1 = list1.next;
        }
        //Now we have the fiste elem

        //Compare the first element in both lists
        // Choose the smaller one and move forward

        //first elem is now curr
        ListNode curr = head;

        while (list1 != null && list2 != null) {

            if (list1 == null) {
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            } else if (list2 == null) {
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            } else if (list1.val >= list2.val) {
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            } else if (list1.val < list2.val) {
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            }
        }

        if (list1 != null)
            curr.next = list1;
        else
            curr.next = list2;

        return head;

    }
}