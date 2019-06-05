package runTimePoly;

public class MAin {

	public static void main(String[] args) {
		try {
			//throw new InterruptedException();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
			e.printStackTrace();
		}
	}

}
