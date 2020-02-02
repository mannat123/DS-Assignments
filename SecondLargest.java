
import java.util.*;
public class SecondLargest {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter no. elements: ");
		int n=obj.nextInt();
		for(int i=0;i<n;i++) 
		{
			li.add(obj.nextInt());
		}
		int largest=li.get(0);
		int secondLargest=li.get(0);
		for(int i=0;i<n;i++)
		{
			if(li.get(i)>largest)
			{
				secondLargest=largest;
				largest=li.get(i);
			}
			if(li.get(i)>secondLargest &&li.get(i)!=largest)
			{
				secondLargest=li.get(i);
			}
		}
		System.out.println("Largest: "+largest+" Second largest: "+secondLargest);
	}
}
