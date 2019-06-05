import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
//		NumberFormat nf_us = NumberFormat.getInstance(Locale.US);
//		NumberFormat nf_uk = NumberFormat.getInstance(Locale.UK);
//		Double d = 123456789999.10;
//		System.out.println(nf_us.format(d));
//		System.out.println(nf_uk.format(d));
		DateFormat df_us = DateFormat.getDateInstance(0,Locale.US);
		DateFormat df_uk = DateFormat.getDateInstance(0, Locale.UK);
		Date d = new  Date();
		System.out.println(df_us.format(d));
		System.out.println(df_uk.format(d));
		
		DateFormat timeIns = DateFormat.getTimeInstance();
		System.out.println(timeIns.format(d));
		
	}

}

