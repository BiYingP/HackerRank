Print the Elements of a Linked List

Given a pointer to the head node of a linked list, print its elements in order, one element per line. If the head pointer is null (indicating the list is empty), don't print anything.



  /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

  static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
