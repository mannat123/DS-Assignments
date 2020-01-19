import java.util.*;
public class Anagrams
{
	static int checkAnagram(char ar[],char br[])
	{
		int flag=0;
		if(ar.length==br.length)
		{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==br[i])
			{
flag=1;
			}
			else {
				flag=0;
			break;
			}
		}
		}
		return flag;
	}
		
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String p=new String();
		String q=new String();
		p=sc.next();
		q=sc.next();
		char a[]=p.toCharArray();
		char b[]=q.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		int ans;
		ans=checkAnagram(a,b);
		if(ans==1)
		{
			System.out.println("Anagrams");
		}
		else
			System.out.println("Not Anagrams");
	}
}