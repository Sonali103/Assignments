package apna;

import java.util.LinkedList;
import java.util.*;

public class Queue_using_LinkedList {
	/*
	static class Node{
		 int data;
		 Node next;
		
		Node(int data){
			this.data=data;
			next=null;
			
		}
	}
	static class Queue{
		static Node head= null;
		static Node tail=null;
		
		public static boolean isEmpty() {
			return head==null && tail ==null;
		}
	
	
	public static void add(int data) {
		Node newNode= new Node(data);
		if(tail == null) {
			tail=head=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	
	public static int remove() {
		if(isEmpty()){
			System.out.println("empty queue");
			return -1;
		}
		
		int front=head.data;
//		for single element in linked list
		if(head==tail){
			tail=null;
		}
		
		head=head.next;
		return front;
		
	}
	public static int peek() {
		if(isEmpty()) {
			System.out.println("empty queue");
			return -1;
		}
		return head.data;
	}
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue q1=new Queue();
//		Queue<Integer>q1=new LinkedList<>();
		Queue<Integer>q1=new ArrayDeque<Integer>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
//		System.out.println(q1.remove());
//		q1.add(6);
//		System.out.println(q1.remove());
//		q1.add(7);
//		
		while(!q1.isEmpty()) {
			System.out.println(q1.peek()); 
			q1.remove();
		}

	}

}
