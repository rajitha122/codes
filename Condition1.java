//program to check greatest of three no.


import java.util.Scanner;
class Condition1
{

public static void main(String[] args)
{
 int a,b,c;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the first number");
	  a=sc.nextInt();
	  System.out.println("enter the secong number");
	  b=sc.nextInt();
	  System.out.println("enter the third number");
	  c=sc.nextInt();
	  
	  if(a>b && a>c)
	  
	  {
	  System.out.println("a is greater"); 
	  
	  }
	  else if(b>a && b>c)
	  {
	  
	   System.out.println("b is greater"); 
	  }
	  else{
	  
	  System.out.println("c is greater"); 
	  }
	  
	  }
}

