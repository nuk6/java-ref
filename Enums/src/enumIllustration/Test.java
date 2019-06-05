package enumIllustration;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int m,p,c;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		p = sc.nextInt();
		c = sc.nextInt();
		if(m < 35 || p < 35 || c < 35) System.out.println("Failed");
		else {
			int avg = (m+p+c)/3;
			if(avg <= 59) System.out.println("C");			
			else if(avg <= 69) System.out.println("B");
			else System.out.println("A");

		}
	}
}