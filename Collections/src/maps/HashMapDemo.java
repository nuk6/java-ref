package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(9,"helo");
        map.put(1,"euiwor");
        map.put(3,"ioewr");
        map.put(4,"ierwop");
        map.put(5,"ieoprw");
        Set<Integer> kSet = map.keySet();
        for (Integer integer : kSet) {
			System.out.println("Keys are  "+integer);
			System.out.println("Values sre "+ map.get(integer));
		}
	}
}
