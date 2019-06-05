package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(9,"helo");
        map.put(1,"euiwor");
        map.put(5,"ioewr");
        map.put(5,"ierwop");
        //map.put(5,"uuuuu");
        Set<Integer> kSet = map.keySet();
        System.out.println("Keys are "+ kSet);
        System.out.println("Values are "+ map.values());
	}
}
