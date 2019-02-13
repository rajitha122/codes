class StaticDemo
	{
	 int count;
	StaticDemo()
	{

	count=count+1;

	}
	 void display()
	{

	System.out.println("the number of object created : " +count);
	}
	public static void main(String [] arg)
	{
	StaticDemo s1=new StaticDemo();
	StaticDemo s2=new StaticDemo();
	StaticDemo s3=new StaticDemo();
	s3.display();
	}
	}
