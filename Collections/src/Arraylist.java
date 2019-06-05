import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
	
	public static void main(String[] args) {
			List<Integer> list1 =  new LinkedList<Integer>();
			for (int i = 0; i < list1.size(); i++) {
				System.out.println(list1.get(i));
			}
			System.out.println("Size = "+list1.size());
	}
}
