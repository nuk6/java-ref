package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("xyz");
		list.add("abc");
		list.add("uiorew");
		list.add("xycdmkf");
		ListIterator<String> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}
