Linked List: Print in Reverse

Given a pointer to the head of a singly-linked list, print each data value from the reversed list. If the given list is empty, do not print anything.

Example:

head refers to linked list with data values 1 -> 2 -> 3 -> NULL

Print the following:

3

2

1



    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static void reversePrint(SinglyLinkedListNode llist) {
    // Write your code here
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = llist;
        
        // reverse linked list
        while (curr != null){
            SinglyLinkedListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // print reverse linked list
        while (prev != null){
            System.out.println(prev.data);
            prev = prev.next;  
        }
    }



