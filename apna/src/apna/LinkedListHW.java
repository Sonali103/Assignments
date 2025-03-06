package apna;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListHW {
/*
	Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

	Node head;
	 
	class Node{
		int data;
		Node next;
		
		Node(int data){
		this.data=data;
		this.next=null;
	}
  }
	
	public void addlast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	public void printList() {
		if(head==null) {
			System.out.println(" this is empty");
			return;
			
		}
		Node currNode=head;
		while(currNode!=null) {
		System.out.print(currNode.data+ " ->");
		currNode=currNode.next;
		}
		System.out.println("NULL");
	}
	
	public int search(int key) {
		Node currNode=head;
		int index=0;
		
		while(currNode!=null) {
			if(currNode.data==key) {
				return index;
			}
			currNode=currNode.next;
			index++;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListHW list= new LinkedListHW();
		int[]elements= {1,5,7,3,8,2,3};
		for(int element:elements) {
		list.addlast(element);
		}
		list.printList();
		
		int key=7;
		int index=list.search(key);
		
		if(index!= -1) {
			System.out.println("Element " + key + " found at index: " + index);
		}
		else {
			System.out.println("Element " + key + "not found in the list");
		}
		*/
	
	
//	Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		LinkedList<Integer>list = new LinkedList<>();
		System.out.println("Enter the number of elements you want to add(range 1-50)");
		int n=sc.nextInt();
		
		System.out.println("Enter " +n+ " elements you want to add(range 1-50)");
		
		for(int i=1;i<n;i++) {
			int ele=sc.nextInt();
			if(ele>=1 && ele<=50) {
				list.add(ele);
			}
			else {
				System.out.println("Please enter the number between 1 and 50");
				i--;
			}
		}
		System.out.println("ORIGINAL LIST" +list);
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			if(itr.next()>25) {
				itr.remove();
			}
		}
		
		System.out.println("Updated list" +list);
		

	}

}
