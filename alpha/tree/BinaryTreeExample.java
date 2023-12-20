package alpha.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BinaryTreeExample {
	
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
	
//	static class Info{
//		int dia;
//		int height;
//		public Info(int dia,int height){
//			this.dia=dia;
//			this.height=height;
//		}
//	}
	
	static class Pair{
		Node node;
		int hd;
		Pair(Node node,int hd){
			this.node=node;
			this.hd=hd;
		}
	}

	
	static class BinaryTree {
		static int idx=-1;
		public static Node buildTree(int [] nodes) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			
			return newNode;
		}
		public static void preorder(Node root) {
			if(root == null) {
				return;
			}
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
		
		public static void inorder(Node root) {
			if(root == null) {
				return;
			}
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
		
		public static void postorder(Node root) {
			if(root == null) {
				return;
			}
			inorder(root.left);
			inorder(root.right);
			System.out.println(root.data);
		}
		
		public static void levelOrder(Node root) {
			if(root==null) {
				return;
			}
			
			Queue<Node > q = new LinkedList<>();
			q.add(root);
			q.add(null);
			while(!q.isEmpty()) {
				Node x = q.remove();
				if(x==null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					}
					else {
						q.add(null);
					}
				}
				else {
					System.out.print(x.data);
					if(x.left!=null) {
						q.add(x.left);
					}
					if(x.right!=null) {
						q.add(x.right);						
					}
				}
			}
		}
		
		public static boolean searchNode(Node root,int key) {
			if(root==null) {
				return false;
			}
			if(root.data==key) {
				return true;
			}
			return (searchNode(root.left, key) || searchNode(root.right, key));
		}
		
		public static int height(Node root) {
			if(root==null) {
				return 0;
			}
			int lh=height(root.left);
			int rh=height(root.right);
			return 1+Math.max(lh, rh);		
		}
		
		public static int countNodes(Node root) {
			if(root==null) {
				return 0;
			}
			int lh=countNodes(root.left);
			int rh=countNodes(root.right);
			return lh+rh+1;		
		}
		
		public static int sumNodes(Node root) {
			if(root==null) {
				return 0;
			}
			int lh=sumNodes(root.left);
			int rh=sumNodes(root.right);
			return lh+rh+root.data;		
		}
		
		
		
		public static boolean isIdentical(Node root,Node subRoot) {
			if(root==null && subRoot ==null) {
				return true;
			}
			else if(root==null || subRoot == null || root.data!=subRoot.data) {
				return false;
			}
			
			return isIdentical(root.left, subRoot.left)&&isIdentical(root.right, subRoot.right);
			
		}
		
		public static boolean isSubtree(Node root,Node subRoot) {
			if(root==null) {
				return false;
			}
			if(root.data==subRoot.data) {
				if(isIdentical(root,subRoot)) {
					return true;
				}
			}
			
			
			return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
			
		}
		
		public static ArrayList<Integer> topView(Node root){
			ArrayList<Integer> ans = new ArrayList<Integer>();
			if(root==null) {
				return ans;
			}
			Map<Integer,Integer> map = new TreeMap<>();
			Queue<Pair> q = new LinkedList<>();
			q.add(new Pair(root,0));
			while(!q.isEmpty()) {
				Pair it = q.remove();
				int hd=it.hd;
				Node temp = it.node;
				if(map.get(hd)==null) {
					map.put(hd, temp.data);
				}
				if(temp.left!=null) {
					q.add(new Pair(temp.left,hd-1));
				}
				if(temp.right!=null) {
					q.add(new Pair(temp.right,hd+1));
				}
			}
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				ans.add(entry.getValue());
			}
			return ans;
		}
		
		
		
		public static ArrayList<Integer> bottomView(Node root){
			ArrayList<Integer> ans = new ArrayList<Integer>();
			if(root==null) {
				return ans;
			}
			Map<Integer,Integer> map = new TreeMap<>();
			Queue<Pair> q = new LinkedList<>();
			q.add(new Pair(root,0));
			while(!q.isEmpty()) {
				Pair it = q.remove();
				int hd=it.hd;
				Node temp = it.node;
				map.put(hd, temp.data);
				if(temp.left!=null) {
					q.add(new Pair(temp.left,hd-1));
				}
				if(temp.right!=null) {
					q.add(new Pair(temp.right,hd+1));
				}
			}
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				ans.add(entry.getValue());
			}
			return ans;
		}
		
		
		public static ArrayList<Integer> rightView(Node root) {
	        ArrayList<Integer> ans = new ArrayList<>();
	        if (root == null) {
	            return ans;
	        }

//	        Map<Integer, Integer> map = new TreeMap<>();
	        Queue<Node> q = new LinkedList<>();
	        q.add(root);

	        while (!q.isEmpty()) {
	            int size = q.size(); // Keep track of the number of nodes at the current level
				for (int i = 0; i < size; i++) {
					Node temp = q.remove();
					
					if(i==size-1) {
						ans.add(temp.data);
					}
					if (temp.left != null) {
						q.add(temp.left);
					}
					if (temp.right != null) {
						q.add(temp.right);
					}	
				}
	        }
	        return ans;
	    }
		
		
		public static ArrayList<Integer> leftView(Node root) {
	        ArrayList<Integer> ans = new ArrayList<>();
	        if (root == null) {
	            return ans;
	        }

//	        Map<Integer, Integer> map = new TreeMap<>();
	        Queue<Node> q = new LinkedList<>();
	        q.add(root);

	        while (!q.isEmpty()) {
	            int size = q.size(); // Keep track of the number of nodes at the current level
				for (int i = 0; i < size; i++) {
					Node temp = q.remove();
					
					if(i==0) {
						ans.add(temp.data);
					}
					if (temp.left != null) {
						q.add(temp.left);
					}
					if (temp.right != null) {
						q.add(temp.right);
					}	
				}
	        }
	        return ans;
	    }
		
		
		public void invertTreeHelper(Node root){
	        if(root==null){
	            return;
	        }
	        Node temp = root.left;
	        root.left=root.right;
	        root.right=temp;
	        invertTreeHelper(root.left);
	        invertTreeHelper(root.right);
	    }
	    public Node invertTree(Node root) {
	        invertTreeHelper(root);
	        return root;
	    }
	    
	    public boolean isSymmetricHelper(Node left,Node right){
	        if(left==null||right==null){
	            return left==right;
	        }
	        if(left.data!=right.data){
	            return false;
	        }
	        return (isSymmetricHelper(left.left,right.right)&&isSymmetricHelper(left.right,right.left));
	    }
	    public boolean isSymmetric(Node root) {
	        if(root==null){
	            return false;
	        }
	        return isSymmetricHelper(root.left,root.right);
	    }
		
	}
	
	
	public BinaryTreeExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = BinaryTree.buildTree(nodes);
		//System.out.println(root.data);
		//System.out.println(BinaryTree.searchNode(root, 7));
		//BinaryTree.preorder(root);
		//BinaryTree.inorder(root);
		//BinaryTree.postorder(root);
		//BinaryTree.levelOrder(root);
		//System.out.println(BinaryTree.diameterApp1(root));
		
		//Info obj = BinaryTree.diameterApp2(root);
		//System.out.println(obj.dia);
		
		//Node subRoot = new Node(2);
		//subRoot.left = new Node(4);
		//subRoot.right = new Node(5);
		
		//System.out.println(BinaryTree.isSubtree(root, subRoot));
		
		//ArrayList<Integer> ans = BinaryTree.topView(root);
		//for(int x :ans) {
		//	System.out.println(x);
		//}
		
		
		//ArrayList<Integer> ans = BinaryTree.bottomView(root);
		//for(int x :ans) {
			//System.out.println(x);
		//}
		
		
		/*ArrayList<Integer> ans = BinaryTree.leftView(root);
		for(int x :ans) {
			System.out.println(x);
		}*/
		
		
		/*ArrayList<Integer> ans = BinaryTree.rightView(root);
		for(int x :ans) {
			System.out.println(x);
		}*/
		
		
		
		
	}

}
