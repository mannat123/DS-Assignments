import java.util.*;
public class Stackusing2queue {
	
	static Queue<Integer> q1 = new LinkedList<>();
	static Queue<Integer> q2 = new LinkedList<>();
	
	public static void push(int a) {
		q1.add(a);
	}
	
	public static void pop() {

			int count=0;
			int n=q1.size()-1;
			while(count!=n) {
				q2.add(q1.poll());
				count++;
			}
		
		
		System.out.print(q1.poll()+" ");
		
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		push(1);
		push(2);
		push(3);
		push(5);
		System.out.println(q1);
		pop();
	System.out.println(q1);
		pop();
		System.out.println(q1);
		push(4);
		System.out.println(q1);
		pop();
		System.out.println(q1);
		pop();
		System.out.println(q1);
		
//		System.out.println(q1);

	}

}