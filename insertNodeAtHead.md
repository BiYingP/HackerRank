Insert a Node at the Head of a Linked List

Given a pointer to the head of a linked list, insert a new node before head. The next value in the new node should point to head and the data value should be replace with a given value. Return a reference to the new head of the list. The head pointer given may be null meaning that the list is empty.

Explanation

Intially the list is NULL.

After inserting 383, the list is 383 -> NULL.

After inserting 484, the list is 484 -> 383 -> NULL.

After inserting 392, the list is 392 -> 484 -> 383 -> NULL.


 /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */


    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(data);
        head.next = llist;
        return head;
    }

