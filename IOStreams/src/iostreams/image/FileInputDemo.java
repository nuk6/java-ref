package iostreams.image;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;

public class FileInputDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileImageInputStream inputStream = null;
		FileImageOutputStream outputStream = null;
		inputStream = new FileImageInputStream(new File("C:/Users/nk25/Documents/workspace-sts-3.9.8.RELEASE/IOStreams/src/iostreams/basics/MyPic1.jpg"));
		outputStream = new FileImageOutputStream(new File("C:/Users/nk25/Documents/workspace-sts-3.9.8.RELEASE/IOStreams/src/iostreams/basics/MyPic2.jpg"));
		System.out.println("File Opened !!");
		int i;
		int mx = -999999999;
		int mn = 999999999;
		while((i = inputStream.read()) != -1) {
			outputStream.write(i);
		}
		inputStream.close();
		outputStream.close();
		System.out.println("Max : "+mx+" Min : "+mn);
	}
}
