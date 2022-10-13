Compare Tow Linked Lists

Given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked lists to check if they are equal. If all data attibutes are equal and the lists are the same length, return true. Otherwise, return false.

Example

List1 = 1 -> 2 -> 3 -> NULL

List2 = 1 -> 2 -> 3 -> 4 -> NULL

The tow lists have equal data attributes for the first 3 nodes. List2 is longer, though, so the lists are not equal. Return false.


   // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode cur1 = head1;
        SinglyLinkedListNode cur2 = head2;
        while (cur1 != null && cur2 != null){
            if (cur1.data != cur2.data){
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if (cur1 != null || cur2 != null){
                return false;
        }

        return true;


    }
