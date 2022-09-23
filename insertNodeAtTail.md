Insert a Node at the Tail of a Linked List

Given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. Inset this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node. The given head pointer maybe null, meaning that the list is empty.

Explanation

First the linked list is NULL. 

After inserting 141, the list is 141 -> NULL.

After inserting 302, the list is 141 -> 302 -> NULL.

After inserting 164, the list is 141 -> 302 -> 164 -> NULL.


    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        
        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
        
        if (head == null) return temp;
        
        SinglyLinkedListNode tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = temp;
   
        return head;

    }
