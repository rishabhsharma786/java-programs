import java.lang.Math;
class A
{
 long p,r,t;
 double ci;
 void input() 
 {
  System.out.println("enter p,r,t=/n");
  p=10;
  System.out.println(p);
  r=100;
  System.out.println(r);
  t=6;
  System.out.println(t);
 }
 void cal()
 {
  int i;
  double a,b,c;
  a=1+r/100.0;
  b=Math.pow(a,t);
  c=b*p;
  ci=c-p;
  System.out.println("compound interest="+ci);
  }
}
class B extends A
{
 void updateB()
 {
  r=r/2;
  t=t*2;
  System.out.println("\nhalf yearly ");
  cal();
  }
}
class C extends B
{ 
 void updateC() 
 {
  r=r/4;
  t=t*4;
  System.out.println("\nquarterly ");
  cal();
  }
}
class D 
{
 public static void main(String args[])
 {
  C obj=new C();
  obj.input();
  //obj.cal();
  //obj.updateB();
  obj.updateC();
  }
}
