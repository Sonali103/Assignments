package apna;

import java.util.ArrayList;

public class Stackclass {
/*
 * 
 * Using Linked list
 * 
 * 
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		    next=null;	
		}
	}
	static class Stack{
		public static Node head;
		
		public static boolean isEmpty() {
			return head==null;
		}
		
		public static void push(int data) {
			Node newNode= new Node(data);
			if(isEmpty()) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
		}
		
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=head.data;
			head= head.next;
			return top;
		}
		
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
	}
*/
	
	static class Stack{
		static ArrayList<Integer> list=new ArrayList<Integer>();
		
		public static boolean isEmpty(){
			return list.size()==0;
		}
		
		public static void push(int data) {
			list.add(data);
		}
		
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
//			System.out.println(s.pop());
		}
		
	}

}
