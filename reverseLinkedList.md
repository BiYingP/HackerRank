Reverse a Linked List

Given the pointer to the head node of a linked list, change the next pointer of the nodes so that their order is reversed. The head pointer given maybe null meaning that the initial list is empty.

Example

head references the list 1 -> 2 -> 3 -> NULL

Manipulate the next pointers of each node in place and return head, now referencing the head of the list 3 -> 2 -> 1 -> NULL.



/*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = llist;
        while(curr != null){
            SinglyLinkedListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
