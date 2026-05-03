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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // List<ListNode> nodes = new ArrayList<>();
        // ListNode curr = head;
        // while(curr!=null){
        //     nodes.add(curr);
        //     curr=curr.next;
        // }

        // int removedIndex = nodes.size() - n ;
        // if(removedIndex == 0){
        //     return head.next;
        // }

        // nodes.get(removedIndex-1).next = nodes.get(removedIndex).next;
        // return head;


        //2 pointer apporoch

        ListNode dummy = new ListNode(0,head);
        ListNode left = dummy;
        ListNode right = head;

        while(n>0){
            right=right.next;
            n--;
        }

        while(right!=null){
            left=left.next;
            right=right.next;
        }
        left.next=left.next.next;
        return dummy.next;

    }
}
