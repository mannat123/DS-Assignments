import java.util.*;
class StringReverse
{
public static void main(String st[])
{
Scanner sc=new Scanner(System.in);
int tr=sc.nextInt();
for(int i=0;i<tr;i++)
{
	String p=sc.next();
	String a[]=p.split("\\.");
	String n="";
	for(int j=a.length-1;j>0;j--)
	{
		n=n+a[j]+".";
	}
	n=n+a[0];
	System.out.println(n);
}
}
}
