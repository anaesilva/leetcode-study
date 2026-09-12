import utils.ListNode;

public class MergeTwoSortedLists {
//    You are given the heads of two sorted linked lists list1 and list2.
//
//    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//    Return the head of the merged linked list.
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null || list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                current = current.next;

            }
        }

        return current;

    }
}
