package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidatorUtils {

	private ValidatorUtils() {
	}
	
	public static boolean validate(Date value) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String dateToValidate = formatter.format(value);
		formatter.setLenient(false);

		try {
			formatter.parse(dateToValidate);
			return true;
		} catch (IllegalArgumentException | ParseException e) {
			return false;
		}
	}

}
