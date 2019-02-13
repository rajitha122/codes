//switch example
import java.util.Scanner;
class Switch
{

public static void main(String[] args)
{
 int a,b,sum,sub,mul,div;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the first number");
	  a=sc.nextInt();
	  System.out.println("enter the secong number");
	  b=sc.nextInt();
	  System.out.println("enter the operator");
	  char op=sc.next().charAt(0);
	  switch(op)
	  {
	  
	  case'+' :
	   sum=a+b;
	   System.out.println("sum of two no : " +sum);
	   //break;
	   
	   case'-' :
	   sub=a-b;
	   System.out.println("sub of two no : " +sub);
	   break;
	   
	   
	   case'*' :
	   mul=a*b;
	   System.out.println("mul of two no : " +mul);
	   //break;
	   
	   case'/' :
	   div=a/b;
	   System.out.println("div of two no : " +div);
	   //break;
	   
	   default:
	   
	   System.out.println("default statements");
	   }
	   }
	   }
	   
	   