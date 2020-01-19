import java.util.*;
public class Pythagoras
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int t,size,flag=0;
System.out.println("Enter the number of testcases");
t=sc.nextInt();
System.out.println("Enter the size of the array");
size=sc.nextInt();
int ar[]=new int[size];
System.out.println("Enter elements in array");
for(int i=0;i<size;i++)
{
	ar[i]=sc.nextInt();
}
for(int i=0;i<size;i++)
{
	for(int j=0;j<size;j++)
	{
		for(int k=0;k<size;k++)
		{
			if(ar[i]*ar[i]+ar[j]*ar[j]==ar[k]*ar[k])
			{
				flag=1;
}}}}
if(flag==1)
{
	System.out.println("YES");
}
else
	System.out.println("NO");
}
}
