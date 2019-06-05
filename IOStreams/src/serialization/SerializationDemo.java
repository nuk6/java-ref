package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:/Users/nk25/Documents/workspace-sts-3.9.8.RELEASE/IOStreams/src/serialization/Employee2Obj.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(12, "Nidhi", 440000000, 1234);
			oos.writeObject(emp);
			System.out.println("Serialized!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
