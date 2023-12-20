package alpha.tree;

import alpha.tree.BinaryTreeExample.Node;

public class BinarySearchTreeExample {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static class BinarySearchTree{
		public static Node root;
		
		public static Node getRoot() {
			return root;
		}
		
		public static void add(int value) {
	        root = addNode(root, value);
	    }
	    private static Node addNode(Node currentRoot, int value) {
	        // Case 1: When root is null
	        if (currentRoot == null) {
	            return new Node(value);
	        }

	        // Case 2: When root is not null
	        if (value < currentRoot.data)
	            currentRoot.left=addNode(currentRoot.left, value);
	        else
	            currentRoot.right=addNode(currentRoot.right, value);

	        return currentRoot;
	    }
	    
	    private static int findMinNode(Node subRoot){
	    	int min=subRoot.data;
	    	
	    	while(subRoot.left!=null){
	    		min=subRoot.left.data;
	    		subRoot=subRoot.left;
	    	}
	    	return min;
	    }
	    private static Node deleteNode(Node root,int value){
	    	if(root==null)
	    		return root;
	    	if(value<root.data)
	    		root.left=deleteNode(root.left,value);
	    	else if(value>root.data)
	    		root.right=deleteNode(root.right,value);
	    	else
	    		if(root.left==null)
	    			return root.right;
	    		else if(root.right==null)
	    			return root.left;
	    		else
	    			root.data=findMinNode(root.right);
	    			root.right=deleteNode(root.right,root.data);
	    			
	    	return root;	
	    	
	    }
	    
	    public static void inorder(Node root) {
			if(root == null) {
				return;
			}
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	    
	    
	}

	public BinarySearchTreeExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] values= {1,2,3,4,5,6,7,8,9,10};
		Node root;
		for(int x:values) {
			BinarySearchTree.add(x);
		}
		BinarySearchTree.inorder(BinarySearchTree.getRoot());
		BinarySearchTree.deleteNode(BinarySearchTree.getRoot(), 5);
		BinarySearchTree.inorder(BinarySearchTree.getRoot());
		
	}

}
