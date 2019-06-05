package treeset;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
	public static void main(String[] args) {
		Set<String> tSet = new TreeSet<String>();
		tSet.add("abc");
		tSet.add("aaa");
		tSet.add("ab");
		tSet.add("abcd");
		tSet.add("abcc");
		for (String string : tSet) {
			System.out.println(string);
		}
	}
}
