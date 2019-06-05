package comparable;

import java.util.Set;
import java.util.TreeSet;

public class ComparableTest {
	public static void main(String[] args) {
		Set<Employee> set  = new TreeSet<Employee>();
		set.add(new Employee(0, "Nidhi"));
		set.add(new Employee(1, "VinayIIIIIIIIIIIII"));
		set.add(new Employee(4, "CHooooooooooooooooooooooo"));
		for (Employee employee : set) {
			System.out.println(employee.id);
			System.out.println(employee.name);
		}
	}
}
