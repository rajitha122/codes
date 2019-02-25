
import java.io.*;
public class DataOutputStreamDemo {
	
	public static void main(String ard[])throws IOException
	{
		try(DataOutputStream dout=new DataOutputStream(new FileOutputStream("file.dat")))
		{
			dout.writeDouble(1.1);
			dout.writeInt(55);
			dout.writeBoolean(true);
			dout.writeChar('4');
		}
		
		catch(FileNotFoundException ex)
		{
			System.out.println("cant open the output file");
			return;
		}
		
		//reading the data back using dataInputStream
		try(DataInputStream din=new DataInputStream(new FileInputStream("file.dat")))
		{
			double a=din.readDouble();
			int b=din.readInt();
			boolean c=din.readBoolean();
			char d=din.readChar();
			System.out.println("values : " +a + " " +b + " " +c +" " +d);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("cant open the input File");
			return;
		}
		
	}

}
