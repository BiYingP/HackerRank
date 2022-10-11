Tree: Inorder Traversal

Complete the inOrder function in the editor below, which has 1 parameter: a pointer to the root of a binary tree. It must print the values in the tree's inorder traversal as a single line of space-separated values.

Example:

Input:

	1
	 \
	  2
	   \
	    5
	   / \
	  3   6
	   \
	    4

Output:

1 2 3 4 5 6 


/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void inOrder(Node root) {
        if (root.left != null){
            inOrder(root.left);
        }
        System.out.print(root.data + " ");
        if (root.right != null){
            inOrder(root.right);
        }
    }
