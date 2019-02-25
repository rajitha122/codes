import java.io.FileOutputStream;
import java.io.*;
public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		e.name="rajitha";
		e.address="brij vihar";
		e.SSN=1234;
		e.number=101;
		try
		{
			FileOutputStream fileout=new FileOutputStream("D:\\rajitha niit bootcamp\\corejava\\employee.txt");
			ObjectOutputStream out=new ObjectOutputStream(fileout);
			out.writeObject(e);
			out.close();
			fileout.close();
			System.out.printf("serilizable data is saved in D:\\rajitha niit bootcamp\\corejava");
			
			
			
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
	}

}
