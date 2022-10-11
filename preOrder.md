Tree: Preorder Traversal

Complete the preOrder function below, wich has 1 parameter: a pointer to the root of a binary tree. It must print the values in the tree's preorder traversal as single line of space-separated values.


Sample Input

	1
	 \
	  2
	   \
	    5
	    /\
	   3  6
	    \
	     4


Sample Output

1 2 5 3 4 6


Explanation

The preorder traversal of the binary tree is printed.



/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void preOrder(Node root) {
        if (root != null){
            System.out.print(root.data + " ");
        }
        if (root.left != null){
            preOrder(root.left);  
        }
        if (root.right != null){
            preOrder(root.right); 
        }  
    }
