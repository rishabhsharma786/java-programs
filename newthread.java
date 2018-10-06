class A extends Thread 
{
	int i;
	public void run()
	{
		for(i=1;i<=50;i++)
		{
		
			System.out.println("Exicuting A "+i);
		}
		System.out.println("Exit A");
	}
}
class B extends Thread
{
	int j;
	public void run()
	{
		for(j=1;j<=50;j++)
		{
			System.out.println("Exicuting B "+j);
		}
		System.out.println("Exit B");
	}
}
class C extends Thread
{
	int k;
	public void run()
	{
		for(k=1;k<=50;k++)
		{
			System.out.println("Exicuting C "+k);
		}
		System.out.println("Exit C");
	}
}
class test
{
	public static void main(String [] args)
	{
		A obj1= new A();
	    B obj2= new B();
		C obj3= new C();

		obj1.start();
		obj2.start();
		obj3.start();
        try
         {
        		obj1.suspend();
		        Thread.sleep(5000);
		        obj1.resume();
		}
		catch(Exception e){}
		
			
	}
}