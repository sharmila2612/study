import java.util.Scanner;
public class seed {
public static void main(String[] args) {
	Scanner in=new Scanner(System .in);
	int n=in.nextInt();
	int r=0,s=1;
	int tmp=n;
	while(n!=0)
	{
		r=n%10;
		s=s*tmp*r;
		n/=10;
		tmp=1;
	}
	System.out.println(s);
}
}
