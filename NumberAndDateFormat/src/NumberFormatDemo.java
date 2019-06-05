import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		NumberFormat nf_us = NumberFormat.getInstance(Locale.US);
		NumberFormat nf_uk = NumberFormat.getInstance(Locale.UK);
		Double d = 123456789999.10;
		System.out.println(nf_us.format(d));
		System.out.println(nf_uk.format(d));
	}

}
