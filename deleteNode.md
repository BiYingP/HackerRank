Delete a Node

Delete the node at a given posiiton in a linked list nd return a reference to the head node. The head is at position 0. The list maybe empty after you deltet the node. In that case, return a null value.

Explanation

The original list is 20 -> 6 -> 2 -> 19 -> 7 -> 4 -> 15 -> 9.

After deleting the node at position 3, the list is 20 -> 6 -> 2 -> 7 -> 4 -> 15 ->9.


    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here
    SinglyLinkedListNode current = llist;
    for (int i = 0; i < position-1; i++){
        current = current.next;
    }
    current.next = current.next.next;
    return llist;
    

    }
 
