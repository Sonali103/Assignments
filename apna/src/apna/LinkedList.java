package apna;

public class LinkedList {
	Node head;
	private int size;
	
	
	public LinkedList() {
		super();
		this.size=0;
	}


	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	
//	add -first /last
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head= newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
		
	}
//	add last
	public void addLasr(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head= newNode;
			return;
		}
		
		Node currNode=head; 
		while(currNode.next!=null) {
//			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	
//	print
	public void printList() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
		}
		System.out.println("NULL");
	}                              

//	delete first
	public void deletefirst() {
		if(head==null) {
			System.out.println("this is empty");
			return;
		}
		size--;
		head=head.next;
	}
	
//	delete last
	public void deletelast() {
		if(head==null) {
			System.out.println("this is empty");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		 Node secondlast=head;
		 Node lastNode=head.next;
		 while(lastNode.next!=null) 
		 {
		  lastNode=lastNode.next;
		  secondlast=secondlast.next;
		  }
		 secondlast.next=null;
	}
	
	public int getsize() {
		return size;
	}
	
	public void reverseIterate() {
		
		if(head==null || head.next==null) {
			return;
		}
		
		
		Node prevNode=head;
		Node currNode=head.next;
		
		while(currNode!=null) {
			Node nextNode=currNode.next;
			currNode.next=prevNode;
			
//			update
			prevNode=currNode;
			currNode=nextNode;
		}
		head.next=null;
		head=prevNode;
	}
	public Node reverseRecursive(Node head){
//		 if their only single element
		 if(head== null  || head.next==null) {
			 return head;
		 }
		 
		
		Node newHead=reverseRecursive(head.next);
		head.next.next=head;
		head.next=null;
		
		return newHead;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
//		list.addFirst("a");
//		list.addFirst("is");
//		list.printList();
//		list.addLasr("list");
//		list.printList();
//		list.addFirst("This");
//		list.printList();
		
//		list.deletefirst();
//		list.printList();
//		
//		list.deletelast();
//		list.printList();
		
//	    System.out.println(	list.getsize());
//	    list.addFirst("hello");
//	    System.out.println(list.getsize());
		
//		 list.addLasr(1);
//		list.addLasr(2);
//		list.addLasr(3);
//		list.addLasr(4);
		list.printList();
//	    list.reverseIterate();
//	    list.printList();
	    list.head=list.reverseRecursive(list.head);
	    list.printList();
	
	}

}
