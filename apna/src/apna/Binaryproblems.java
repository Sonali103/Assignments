package apna;

public class Binaryproblems {
	
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
	static class Binarytree{
		static int index=-1;
		
		public static Node buildtree(int nodes[]) {
			index++;
			if(nodes[index]== -1) {
				return null ;
			}
			Node newnode=new Node(nodes[index]);
			newnode.left=buildtree(nodes);
			newnode.right=buildtree(nodes);
			
			return newnode;
			
		}
	}
	
	public static int countofNodes(Node root){
		if(root==null) {
			return 0;
		}
		
		int leftNodes=countofNodes(root.left);
		int rightNodes=countofNodes(root.right);
		
		return leftNodes+rightNodes+1;
	}
	
	public static int sumofNodes(Node root) {
		if(root==null) {
			return 0;
		}
		int leftsum=sumofNodes(root.left);
		int rightsumm=sumofNodes(root.right);
		
		return leftsum+rightsumm+root.data;
	}
	
	public static int height(Node root) {
		if(root==null) {
			return 0;
		}
		int leftheight=height(root.left);
		int rightheight=height(root.right);
		
		int myHeight= Math.max(leftheight, rightheight)+1;
		return myHeight;
				 
	}
	public static int diameter(Node root) {
		if(root==null) {
			return 0;
		}
		int diam1=diameter(root.left);
		int diam2=diameter(root.right);
		int diam3=height(root.left)+height(root.right)+1;
		
		return Math.max(diam3,Math.max(diam1, diam2));
		
		}
	static class TreeInfo{
		int ht;
		int diameter;
		
		 TreeInfo(int ht, int diameter) {
			
			this.ht = ht;
			this.diameter = diameter;
		}
		
		
	}
	
	public static TreeInfo diameter2(Node root) {
		if(root==null) {
			return new TreeInfo(0, 0);
		}
		TreeInfo left=diameter2(root.left);
		TreeInfo right=diameter2(root.right);
		
		int myHeight=Math.max(left.ht,right.ht)+1;
		
		int diam1=left.diameter;
		int diam2=right.diameter;
		int diam3=left.ht+right.ht+1;
		
		int mydiam=Math.max(Math.max(diam1, diam2),diam3);
		
		TreeInfo myInfo=new TreeInfo(myHeight,mydiam);
		return myInfo;
		
	}
	public static int sumofkthLevel(Node root,int k) {
		if(root==null) {
			return 0;
		}
		if(k==1) {
			return root.data;
		}
		return sumofkthLevel(root.left,k-1)+ sumofkthLevel(root.right, k-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Binarytree t= new Binarytree();
		Node root=t.buildtree(nodes);
//		System.out.println(countofNodes(root));
//		System.out.println();
//		System.out.println(sumofNodes(root));
//		System.out.println(height(root));
//		System.out.println(diameter(root));
//
//		System.out.println(diameter2(root).diameter);
		System.out.println(sumofkthLevel(root,3));
		
	}
	

}
