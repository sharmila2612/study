import java.util.Scanner;

public class square{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int[] i=new int[8];
	int l=0,n=0;
	System.out.println("Enter the points in the order (ll)(lr)(ul)(ur): ");
	for(int j=0;j<8;j++)
	{
		i[j]=in.nextInt();
	}
	l=i[0]-i[1];
	n=Math.abs(i[2]-i[3]);
	if((i[4]-i[5]==l) && (Math.abs(i[6]-i[7])==n))
	{
		System.out.println("The points forms a square");
	}
	else
	{
		System.out.println("The points does not forms a square");
	}
}

	
}
