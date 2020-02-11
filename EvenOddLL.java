import java.util.*;
public class EvenOddLL {
Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public static EvenOddLL insert(EvenOddLL li,int data){
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head==null)
		{
			li.head=newNode;
		}
		else {
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return li;
	}
	public static void evenOdd(EvenOddLL li)
	{
		int count=0;
		int sum=0;
		Node current=li.head;
		while(current!=null)
		{
		sum=sum+current.data;
		current=current.next;
		count++;
		}
		sum=sum/count;
		if(sum%2==0)
		{
			System.out.println("Even Linked List");
		}
		else if(sum%2!=0)
		{
			System.out.println("Odd Linked List");
		}
		
	}
public static void main(String arg[])
{
	EvenOddLL list=new EvenOddLL();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no. of elements to be added in linked list");
	int n=sc.nextInt();
	System.out.println("Enter the elements in the linked list");
	for(int i=0;i<n;i++)
	{
		list.insert(list,sc.nextInt());
	}
	list.evenOdd(list);
}
}

