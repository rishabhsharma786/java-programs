import java.util.*;
class A
{
    public static void main(String [] ar)
    {
        int n , a=0,b=0,c=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        n = sc.nextInt();
        System.out.println("fab series:");
        for(int i=0;i<=n;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.println("  "+a);
        }
    }
}