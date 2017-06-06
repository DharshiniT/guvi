import java.util.*;
public class alphabet
{
	public static void main(String args[])
	{
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character:");
		ch=scan.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println(ch+"is an alphabet");
		}
		else
		{
			System.out.println(ch+" is an alphabet");
 
		}
	}
}
