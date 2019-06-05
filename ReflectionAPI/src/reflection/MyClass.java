package reflection;

@MyAnnotation(value1 = "xyz", value2 = 123)
public class MyClass {
	private int id;
	private String dummy;
	private static int  version = 19;
	
	public MyClass() {
		System.out.println("Default constructor invoked");
	}
	
	public MyClass(int id) {
		System.out.println("Parametrized constructor [int]");
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MyClass(int id, String dummy) {
		System.out.println("Parametrized constructor [int , String]");
		this.id = id;
		this.dummy = dummy;
	}

	public MyClass(String dummy) {
		System.out.println("Parametrized constructor [String]");
		this.dummy = dummy;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + ", dummy=" + dummy + ", version="+ version + "]";
	}

}
