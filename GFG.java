import java.lang.Math;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		int T,sum,l;
		Scanner s=new Scanner(System.in);
		T=s.nextInt();
		sum=s.nextInt();
		l=s.nextInt();
		int p;
		p=9*l;
		int u=(int)Math.pow(10,l-1);
		int y=(int)Math.pow(10,l);
		int count=0,digit=0;
		int h=0;
		if(sum>=1&&sum<=p)
		{
		    for(int i=u;i<y-1;i++)
			{
				int f=i;
				while(f>0)
				{
				digit=f%10;
				count=count+digit;
				f=f/10;
				}
				if(count==sum)
				{
					h=i;
					break;
				}
				digit=0;
				count=0;
			}
System.out.println(h); 
		}
		else if(sum==0&&l==1)
		{
		    System.out.println("0");
		}
		else
		{
		    System.out.println("-1");
		}
		
	}
}