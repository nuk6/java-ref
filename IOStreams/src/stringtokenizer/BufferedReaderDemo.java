package stringtokenizer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:/Users/nk25/Documents/workspace-sts-3.9.8.RELEASE/IOStreams/src/stringtokenizer/MyFilee.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
