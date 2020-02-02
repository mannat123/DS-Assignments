/* Given a string s,recursively remove adjacent duplicate characters from the string s.
The output string should not have any adjacent duplicates. 
example:-
input:
2
geeksforgeek
acaaabbbacdddd
output:
gksforgk
acac */ 

import java.util.*;
public class Removeadj
{
	static void removeAdjacent(String p)
	{
		String s="";
		char ar[]=p.toCharArray();
		int n=ar.length;
			for(int i=0;i<n-1;i++)
			{
				if(ar[i]!=ar[i+1])
				{
					s=s+ar[i];
				}
				else
				{
				i++;
				}
			}
			System.out.print(s);
			if(ar[n-1]!=ar[n-2])
			{
				System.out.println(ar[n-1]);
			}
	}
	public static void main(String args[])
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		String a=new String();
		for(int i=0;i<t;i++)
		{
			a=sc.next();
			removeAdjacent(a);
		}
	}
}
			
					
	
		
		
			