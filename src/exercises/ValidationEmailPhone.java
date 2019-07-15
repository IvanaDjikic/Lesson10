package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//
public class ValidationEmailPhone {

	public boolean validatePhoneNumber(String phoneNumber) {
		String phonePattern = "^(?:00|\\+)[0-9\\s.\\/-]{6,20}$";

		return (validate(phoneNumber, phonePattern));
	}

	public boolean validateEmail(String eMail) {
		String emailPattern = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		return (validate(eMail, emailPattern));

	}

	private boolean validate(String string1, String string2) {
		Pattern pattern = Pattern.compile(string2);
		Matcher matcher = pattern.matcher(string1);
		boolean itIsMatch = matcher.matches();
		if (itIsMatch) {
			return true;
		} else {
			return false;
		}
	}

}
