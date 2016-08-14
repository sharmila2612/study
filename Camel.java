package guvi2;

import java.util.Scanner;

public class Camel {
public static void main(String[] args) {

	Scanner in=new Scanner(System.in);
	System.out.println("enter the string :");
	String s=in.nextLine();
	String[] s1=s.split(" ");
    String v="";
	for(int i=0;i<s1.length;i++)
	{
		  char[] ch=s1[i].toCharArray();
	      ch[0]=Character.toUpperCase(ch[0]);
	      String g=new String(ch);
	      v=v+" "+g;
	 }
	System.out.println(v);
}
}
