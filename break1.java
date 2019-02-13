import java.util.Scanner;
class break1
{

public static void main(String[] args)
{
 int a,b,sum=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the first number");
	
	  //System.out.println("enter the secong number");
	  //b=sc.nextInt();
	  
	 for(int i=1;i<=5;i++)
	 {
		 
		   a=sc.nextInt();
		 
		 if(a<=0)
			 continue;
		 
		
	  
	  sum=a+sum;
	 }
	  
	  System.out.println(sum);
	  
}
}
	  