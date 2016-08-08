import java.util.Scanner;


public class rotate {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the length of the array : ");
	int l=in.nextInt();
	System.out.println("Enter a number : ");
	int d=in.nextInt();
	int[]a=new int[l];
	System.out.println("Enter the elements : ");
	for(int i=l-d;i<=l-1;i++)
	{
		a[i]=in.nextInt();
	}
	for(int j=0;j<l-d;j++)
	{
		a[j]=in.nextInt();
	}
	for(int m : a)
	{
		System.out.println(m);
	}
}
}
