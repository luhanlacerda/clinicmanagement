package util;

import java.util.Calendar;

public class ValidatorUtils {

	private ValidatorUtils() {
	}
	
	public static boolean validate(Calendar value) {
		value.setLenient(false); // Not allow invalid dates
		
		try {
			value.getTime(); // If date is invalid will generate an exception
			return true;
		} catch (IllegalArgumentException e) {
			return false;
		}
	}

}
