Tree: Postorder Traversal

Complete the postOrder function in the editor below. It received 1 parameter: a pointer to the root of a binary tree. It must print the values in the tree's postorder traversal as a single line of space-separated vales.

Example

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

4 3 6 5 2 1

Explanation

The postorder traversal is shown.


/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void postOrder(Node root) {
     
        if (root.left != null){
            postOrder(root.left);
        }
        if (root.right != null){
            postOrder(root.right);
        }
        System.out.print(root.data + " ");

    }
