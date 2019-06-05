import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh ^^ mm @@ ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		String format = sdf.format(new Date());
		System.out.println(format);
		System.out.println(sdf2.format(new Date()));

	}
}
