public class Window {

	public static void windowSize(int a[],int n,int k) {
		
		for(int i=0;i<=n-k;i++) {
			
			int max=0;
			
			for(int j=i;j<i+k;j++) {
				
				if(max<a[j])
					max=a[j];
			}
			System.out.print(max+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
			windowSize(arr,n,k);
		
	
	}
}
