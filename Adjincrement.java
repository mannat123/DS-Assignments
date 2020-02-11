/* input has an array 1 2 3 3 4 5 with multiple frequency of elements then all outputs are to be shown and the outputs are as follows :
1 2 3 4 4 5
1 2 3 4 5 5
1 2 3 4 5 6
*/
import java.util.*;
public class Adjincrement
{
	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int arr[]=new int[n];
	int f=0;
	for(int i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	    for(int j=i+1;j<n;j++)
	    {
	        if(arr[i]==arr[j])
	        {
	            arr[j]=arr[i]+1;
				f=1;
	        }
	    }
		if(f==1)
		{
	    for(int k=0;k<n;k++)
	    {
	        System.out.print(arr[k]+" ");
	    }
	    System.out.println();
		}
		f=0;
	}	
}
}
