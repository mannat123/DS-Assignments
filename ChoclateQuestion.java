import java.util.*;

public class ChoclateQuestion {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int arr[] = { 1, 2, 4, 8, 3 };

int n = sc.nextInt();
int a = sc.nextInt();
int sum=0,f=0;

for (int i = 0; i < arr.length-(n-1); i++) {

for(int j=i;j<n+i;j++) {
sum=arr[j]+sum;
}
if(sum==a)
f=1;
else	
sum=0;
}
if(f==1)
System.out.println("Yes");
else
System.out.println("Sorry :(");
sc.close();
}
}