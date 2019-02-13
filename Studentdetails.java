
import java.util.Scanner;
class Student
{
//by default access specifier is defaault
//private means info hidding called data hidding

String name;
String branch;
int roll_no;
int marks[]=new int[10];
int sum=0;
float per;


Scanner sc=new Scanner(System.in);
public void input()
{
	
	System.out.println("enter student name : ");
	name=sc.next();
	
	System.out.println("enter student branch : ");
	branch=sc.next();
	
	System.out.println("enter student roll_no : ");
	roll_no=sc.nextInt();
	
	System.out.println("enter student marks : ");
	for(int i=1;i<=5;i++)
	{
		marks[i]=sc.nextInt();
	}


}

public void marksCalculate()
{
	for(int i=1;i<=5;i++)
	{
		sum=sum+marks[i];
	}
	System.out.println(sum);
	per=(float)(100*sum)/500;
		System.out.println("percentage is :" +per);
}

public void print()
{
	System.out.println("name is :" +name);
	System.out.println("branch is :" +branch);
	System.out.println("roll_no is :" +roll_no);
	System.out.println("percentage is :" +per);


	if(per>=50 && per<=75)
		System.out.println("Distinction");

	else if(per>=75)
		System.out.println("Distinction I");

	else
		System.out.println("Fail");
}
}

class Studentdetails
{
public static void main(String[] arg)
	{

		Student objStudent=new Student();
		objStudent.input();
		objStudent.marksCalculate();
		objStudent.print();
	}
}



