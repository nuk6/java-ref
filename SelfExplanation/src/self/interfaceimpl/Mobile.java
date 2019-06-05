package self.interfaceimpl;

public abstract class Mobile implements MustHave {

	@Override
	public void call() {
		System.out.println("Calling");
	}

	@Override
	public void message() {
		System.out.println("Messaging");
	}

	@Override
	public String getMessage() {
		return "Generic message";
	}
	public String getMessage2() {
		return "Custom message" ;
	}

}
