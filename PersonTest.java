//oops program

import java.util.Scanner;
class Person
{
//by default access specifier is defaault
//private means info hidding called data hidding
private String name;
private int age;
private String consistency;
Scanner sc=new Scanner(System.in);
//constructor
Person()
{
	
	System.out.println("voter eleigiblity");
	age=0;
	name=" " ;
	consistency="noida";
	
	
}
Person(String n,int a)

{
	name=n;
	age=a;
	consistency="noida";
	
}
Person(String n,int a,String c)

{
	name=n;
	age=a;
	consistency=c;
	
}

public void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your name : ");
name=sc.next();
System.out.println("enter your age : ");
age=sc.nextInt();

}

 public void print()
{

System.out.println("name is :" +name);

System.out.println("age is :" +age);
System.out.println("consistency is :" +consistency);


}
public void eligibletovote()
{
	if(age>=18)
	{
		System.out.println("eligible for vote");
	}
	else
	{
		
		System.out.println(" not eligible for vote");
	}
		
	
}

}
class PersonTest
{
public static void main(String[] arg)
{
	 Person objPerson=new Person();
 objPerson.input();
 objPerson.print();
   objPerson.eligibletovote();
	
	Person objPerson1=new Person("RAJ",30);
   objPerson1.print();
   
  objPerson1.eligibletovote();
  
 

 Person objPerson2=new Person("adam",12,"punjab");
objPerson2.input();
objPerson2.print();
objPerson2.eligibletovote();
}
}