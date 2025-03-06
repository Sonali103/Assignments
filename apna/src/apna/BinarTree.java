package apna;

import java.util.LinkedList;
import java.util.Queue;

public class BinarTree {
	
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
	
	static class BinaryTree{
		
		static int idx=-1;
		public static Node buildTree(int nodes[]) {
			idx++; //first time call hoga toh apne aap upgrade ho jayega
			if(nodes[idx]==-1) {
				return null;
			}
			
			Node newNode = new Node(nodes[idx]);
			newNode.left= buildTree(nodes);
			newNode.right=buildTree(nodes);
		
			return newNode;
		}
	}
	
	public static void preorder(Node root) {
		/*
		 * rules for preorder is that 
		 * 1st root with print then left subtree and last right subtree
		 * */
		if (root == null) {
			return;
		}
		
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
	}
	
	public static void inorder(Node root) {
		/*
		 * rules for inorder that
		 * 1st leftsubtree will be printed then root and at last right subtree
		 * */
		if(root==null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static void post(Node root) {
		/*
		 * lst left subtree will be printed then right subtree and at last root
		 * */
		if(root==null) {
			return;
		}
		post(root.left);
		post(root.right);
			System.out.print(root.data+" ");
	}
	
	public static void levelorder(Node root) {
		if(root==null) {
			return;
		}
		Queue<Node>a= new LinkedList<>();
		a.add(root);
		a.add(null);
		
		while(!a.isEmpty()) {
			Node currentNode=a.remove();
			if(currentNode == null) {
				System.out.println();
//				for last node
				if(a.isEmpty()) {
					break;
				}else {
					a.add(null);
				}
			}else {
				System.out.print(currentNode.data+" ");
				if(currentNode.left!=null) {
					a.add(currentNode.left);
				}
				if(currentNode.right!=null) {
					a.add(currentNode.right);
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildTree(nodes);
		System.out.println(root.data);
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		post(root);
		System.out.println();
		levelorder(root);
	}

}
