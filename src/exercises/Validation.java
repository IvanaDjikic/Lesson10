package exercises;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	String email;
	String phoneNumber;
	
	
	public Validation(String email, String phoneNumber) {
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	


	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public boolean isValid(String email1,String phoneNumber1) {
		  
			Pattern pattern = Pattern.compile(this.email);
			Matcher matcher = pattern.matcher(email1);
			boolean found = matcher.matches(); 
			if (found) { 
			Pattern pattern1 = Pattern.compile(this.phoneNumber);
			Matcher matcher1 = pattern1.matcher(phoneNumber1);
			boolean found1 = matcher1.matches(); 
			if (found1) { 
			
			    	return true;
		    }
			
			else  { 
				return false;
			}
														
	}
			else  { 
				return false;
			}
	
}
}
