package queues;

import java.util.Stack;

public class QueueImplUsingStacks {

	static class Queue{
		static Stack<Integer> s1 = new Stack<Integer>();
		static Stack<Integer> s2= new Stack<Integer>();
		
		static void enqueue(int x) {
			while(!s1.isEmpty()) {
				s2.add(s1.pop());
			}
			
			s1.add(x);
			
			while(!s2.isEmpty()) {
				s1.add(s2.pop());
			}
		}
		
		static int dequeue() {
			if(s1.isEmpty()) {
				return -1;
			}
			int x = s1.peek();
			s1.pop();
			return x;
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}
