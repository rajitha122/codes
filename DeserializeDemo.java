import java.io.*;
public class DeserializeDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		Employee e=null;
		try
		{
			FileInputStream fileIn=new FileInputStream("D:\\\\rajitha niit bootcamp\\\\corejava\\\\employee.txt");
			ObjectInputStream in=new ObjectInputStream(fileIn);
			e=(Employee) in.readObject();
			in.close();
			fileIn.close();
			
		}
		catch(IOException i)
		{
			i.printStackTrace();
			return;
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("employee class not found");
			c.printStackTrace();
			return;
			
		}
		
		System.out.println("deserilizartio demo");
		System.out.println("name :" +e.name);
		System.out.println("address: " +e.address);
		System.out.println("SSN :" +e.SSN);
		System.out.println("number :" + e.number);
	}

}
