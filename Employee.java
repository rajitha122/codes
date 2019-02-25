import java.io.*;
public class Employee  implements Serializable{


		public String name;
		public String address;
		public transient int SSN;
		public int number;

		public void mailcheck() {
			System.out.println("mailing a check to  "+name + " " +address);
		}
	}


