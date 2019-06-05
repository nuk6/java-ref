package iostreams.textfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
	public static void main(String[] args) {
		try {
			FileReader r = new FileReader("C:/Users/nk25/Documents/workspace-sts-3.9.8.RELEASE/IOStreams/src/iostreams/basics/MyFilee.txt");
			FileWriter w = new FileWriter("C:/Users/nk25/Documents/workspace-sts-3.9.8.RELEASE/IOStreams/src/iostreams/basics/MyFile2.txt");
			int bc;
			//bc means can read byte and char
			while((bc = r.read()) != -1) {
				w.write(bc);
			}
			r.close();
			w.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Done !");
		}
		
	}
}
