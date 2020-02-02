// print the reverse of an integer(positive and negative both) 
import java.util.*;
import java.lang.Math; 
public class Revnumber
{
	static int reverse(int num)
	{
		int p=0,q=0,c=0;
		int m=0; int l=0;
		boolean isNegative = num < 0 ? true : false;
		if(isNegative)
		{
			num=num*-1;
		}
		l=num;
		while(l>0)
		{
		l=l/10;
		c++;
		}
		c--;
		while(num>0)
		{
		q=num%10;
		m=(int)Math.pow(10,c);
		p=p+q*m;
		num=num/10;
		c--;
		}
		return isNegative == true? p*-1 : p;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int y=reverse(n);
	System.out.println(y);
}
}
