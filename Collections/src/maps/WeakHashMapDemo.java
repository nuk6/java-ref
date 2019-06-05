package maps;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		Map<User, String> map = new WeakHashMap<>();
		//Map<User, String> map = new HashMap<>();
		User u = new User();
		User u2 = new User();
		map.put(u, "HAHA");
		map.put(u2, "HAHA");
		System.out.println(map);
		u2 = null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(map);
	}
}
