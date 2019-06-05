package string.basics;

public class StringManipulating {
	public static void main(String[] args) {
		String s = "Hello World";
		String[] res = s.split("");
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
