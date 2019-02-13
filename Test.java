class Employee
{
protected String name;
protected int id;
protected String address;

  Employee()
    {
     }
	Employee(final String n,final int e_id,final String e_addr)
	{
	
	name=n;
	id=e_id;
	address=e_addr;
	
	}
	
	void display()
	{
	System.out.println(" the name of employee is : " +name
	
						+"\n"
						+"the emp_id is : " +id
						+"\n"
						+"the emp_addre is : " +address);
	}
	
	}
	
	class Manager extends Employee
	{
	
	protected String designation;
	
	Manager()
	{
	
	}
	Manager(final String n,final int e_id,final String e_addr, final String desig)
	{
	
	super(n,e_id,e_addr);
	designation=desig;
	}
	void display()
	{
	 super.display();
	System.out.println(" the designation of manager is : " +designation);
	}
	}
	
	
	
	class developer extends Employee
	{
	
	protected String platform;
	
	developer()
	{
	
	}
	developer (final String n,final int e_id,final String e_addr, final String plat)
	{
	
	super(n,e_id,e_addr);
	platform =plat;
	}
	void display()
	{
	 super.display();
	System.out.println(" the developer platform  is : " +platform);
	}
	}
	
	class Test
	{
	public static void main(String[] args)
	{
	developer d1=new developer("rajitha",12,"delhi","java");
	d1.display();
	Manager m1=new Manager("arm",22,"mumbai","trg");
	m1.display();
	}
	}
	
	