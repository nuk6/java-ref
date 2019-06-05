package self.interfaceimpl;

public class Test {
	public static void main(String[] args) {
		Mobile mustHave = new Nokia();
		Nokia nokia = new Nokia();
		System.out.println(mustHave.getMessage2());
		System.out.println(nokia.getMessage2());
		System.out.println(mustHave);
		System.out.println(nokia);
	}
}
