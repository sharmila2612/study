package guvi2;

import java.util.Scanner;

public class Countprime {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the limit : ");
	int n=in.nextInt();
	int count=0;
	for(int i=3;i<n;i++)
	{
		int m=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				m=1;
				break;
			}
		}
		if(m==0)
		{
			//System.out.println(i);
			count++;
		}
	}
	System.out.println(count);
}
}
