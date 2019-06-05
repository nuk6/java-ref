package navigable;

import java.util.TreeSet;

public class NavigableTreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(11);
		treeSet.add(22);
		treeSet.add(33);
		treeSet.add(44);
		treeSet.add(55);
		System.out.println(treeSet);
		System.out.println(treeSet.ceiling(10));
		System.out.println(treeSet.higher(10));
		System.out.println(treeSet.floor(30));
		System.out.println(treeSet.lower(30));
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());
		System.out.println(treeSet.descendingSet());
		System.out.println(treeSet);
	}
}
