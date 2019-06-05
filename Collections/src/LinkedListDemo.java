import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			ll.add(i);
		}
		System.out.println("Linked list is  : "+ll);
	}
}
