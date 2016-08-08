import java.util.Scanner;
	public class Palindrome{
	public static void main(String[] args){
	 Scanner in=new Scanner(System .in);
	 System.out.println("enter ");
	 int n=in.nextInt();
	 int r=0;
	 int s=0,x=0;
	 while(n!=0)
	 {
	  r=n%10;
	  s=s+r;
	  n=n/10;
	  }
	 System.out.println(s);
	 int tmp=s;
	 while(s!=0)
	 {
		 r=s%10;
		 x=x*10+r;
		 s/=10;
	 }
	 System.out.println(x);
	 if(x==tmp)
		 System.out.println("Sum of the digits is a palindrome");
	 else
		 System.out.println("Sum of the digits is not a palindrome");
	}
	}
