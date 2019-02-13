class  AddTime
{
	int hours;
	int  minutes;
	int  seconds;
	public AddTime(int h, int m ,int s )
	{
	hours = h;
minutes=m;
seconds=s;
}
void add(AddTime t2)
{

this.hours+=t2.hours ;
this.minutes+=t2.minutes ;
this.seconds+=t2.seconds;


}
void display()
{
	if(this.seconds>=60)
	{
		this.minutes++;
		this.seconds=this.seconds-60;
	}
	if(this.minutes>=60)
	{
		this.hours++;
		this.minutes=this.minutes-60;
	}
	System.out.println(this.hours +"  :" + this.minutes +" : " + this.seconds +":");
}
public static void main(String [] args)
{
AddTime t1=new AddTime(03,45,50);

AddTime t2 =new AddTime(01,20,55);

t1.add(t2);
System.out.println("the addition of time  is :  " );
t1.display();

}
}

