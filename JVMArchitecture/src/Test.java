import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
					try {
						Class c = Class.forName("User");
						Method[] methods = c.getDeclaredMethods();
						for (int i = 0; i < methods.length; i++) {
							System.out.println(methods[i].getName());
						}
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
	}

}
