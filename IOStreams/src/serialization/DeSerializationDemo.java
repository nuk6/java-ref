package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/Users/nk25/Documents/workspace-sts-3.9.8.RELEASE/IOStreams/src/serialization/Employee2Obj.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
