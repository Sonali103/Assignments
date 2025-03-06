package apna;

import java.util.LinkedList;

public class CollectionLinkedlist {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		list.addFirst("this");
		list.addLast("list");
		System.out.println(list);
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ->");
		}
		System.out.println("NULL");
		
//		list.removeFirst();
//		System.out.println(list);
//		
//		list.removeLast();
//		System.out.println(list);
//		
		
		list.remove(3); // removing index
		System.out.println(list);
		
		list.add(3, "bochi uff Archana");
		System.out.println(list);
		
		 		
		


	}

}
