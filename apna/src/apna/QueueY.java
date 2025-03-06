package apna;

public class QueueY {
	
	static class Queue{
		static int arr[];
		static int size;
		static int rear=-1;
		static int front=-1;  //Circular queue
		
		
		
		Queue(int n){
			arr= new int[n];
			this.size=n;
		}
		
		
		public static boolean isEmpty() {
			return rear ==-1 && front==-1;
		}
		
		public static boolean isFull()
		{
			return (rear+1) %size ==front;
			}		
//		enqueue
		public static void add(int data) {
			/*if(rear==size-1) {
				System.out.println("Full queue");
				return;
			}
			rear++;
			arr[rear]=data;*/
			
			if(isFull()) {
				System.out.println("full queue");
				return;
			}
//			int front=arr[0];
			if(front==-1) {
				front=0;
			}
			rear=(rear+1) %size; // to store data in rear
			arr[rear]=data;
		}
		
//		dequeue
		public static int remove() {
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
		}
		
//		int front=arr[0];
			int result=arr[front];
	/*	for(int i=0;i<rear;i++) {
			arr[i]=arr[i+1];
		}*/
			if(rear==front) {
				rear=front=-1;
			}else {
				front=(front+1)%size;
			}
//		rear--;
		return front;
	}
		public static int peek() {
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
//			return arr[0];
			return arr[front];
		}
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q= new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.remove());
		q.add(6);
		System.out.println(q.remove());
		q.add(7);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
