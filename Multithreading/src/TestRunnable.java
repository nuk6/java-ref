
class Hi implements Runnable{

	@Override
	public void run() {
		System.out.println("Hiii");
	}
	
}

class Hello implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello");
	}
	
}

public class TestRunnable {
	public static void main(String[] args) {
		Hi hi = new Hi();
		Hello hello = new Hello();
		Thread t1 = new Thread(hi);
		Runnable t2 = new Hello();
		t1.start();
		t2.start();
	}
}
