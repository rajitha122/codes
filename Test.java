import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fout=new FileOutputStream("f1.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="mai apni favourite hu";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("sucess");
	}

}
