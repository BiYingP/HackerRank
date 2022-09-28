Insert a Node at a Specific Position in a Linked List

Given the pointer to the head node of a linked list and an integer to insert at a specific position, create a new node with the given integer as its data attribute, insert this node at the desired position and return the head node.

A position of 0 indicates head, a posiiton of 1 indicates one node away from the head and so on. The head pointer given may be null, meaning that initial list is empty.


Explanation

The inital linked list is 16 -> 13 -> 7. 

Insert 1 at the position 2 which currently has 7 in it. 

The updated linked list is 16 -> 13 -> 1 ->7.



    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
    
    SinglyLinkedListNode current = llist;
    SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
    
    for (int i = 0; i < position-1; i++){
        current = current.next;
    }
    new_node.next = current.next;
    current.next = new_node;
    return llist;
    }



