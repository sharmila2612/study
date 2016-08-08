# study
import java.util.Scanner;
	public class PowerOf{
	public static void main(String[] args){
	 Scanner in=new Scanner(System .in);
	 int n=in.nextInt();
	 int r=0;
	 int s=0,x=0;
	 while(n!=0)
	 {
	  r=n%10;
	  s=s+(int)Math.pow(r,x);
	  n=n/10;
	  x=r;
	 }
	 System.out.print(s);
	}
	}
