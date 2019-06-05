package comparable;

public class Employee implements Comparable<Employee> {
		int id;
		String name;
		public Employee(int id, String name) {
			this.id = id;
			this.name = name;
		}
		@Override
		public int compareTo(Employee o) {
			if(this.name.length() > o.name.length()) {
				return 1;
			} else if(this.name.length() != o.name.length()) {
				return -1;
			} else {
				return 0;
			}
		}
		
}
