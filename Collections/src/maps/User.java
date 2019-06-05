package maps;

public class User {
	@Override
	public String toString() {
		return "Used";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized called");
	}
}
