import java.util.Scanner;
class Ma
{

public static void main(String[] args)
{
 int a,b,c,sum;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the first number");
	  a=sc.nextInt();
	  System.out.println("enter the secong number");
	  b=sc.nextInt();
	  System.out.println("enter the third number");
	  c=sc.nextInt();
	  sum=a+b+c;
	    //type casting from into to float
		
	   float average= (float)sum/3;

 System.out.println("the sum is = " +sum);
  System.out.println("the average is = " +average);
 
 }
 }
