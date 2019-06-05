package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		Iterator<Integer> it = list.iterator();
		int j = 0;
		while(it.hasNext()) {
			System.out.println(it.next());
			j++;
		}
		//System.out.println();
	}
}
