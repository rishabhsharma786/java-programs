import java.util.*;
class Fact
{
	public static void main(String [] ar)
	{
		int x,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no..");
		x=sc.nextInt();
		for(int a=x;a>=1;a--)
		{
			f=f*x;
			x--;
		}
		System.out.println("my fact is "+f);
	}
}
