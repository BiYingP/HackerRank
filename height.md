Tree: Height of a Binary Tree

The height of a binary tree is the number of edges between the tree's root and its furthest leaf.


Example

Input:

	    4
	   / \
	  2   6
	 / \ / \
	1  3 5  7
	

Output:

2


	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
          if (root == null) return -1;
          return Math.max(height(root.left), height(root.right)) + 1;
    }
