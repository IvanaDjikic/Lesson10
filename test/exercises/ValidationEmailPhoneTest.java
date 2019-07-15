package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//
class ValidationEmailPhoneTest {
	ValidationEmailPhone validation = new ValidationEmailPhone();

	@Test

	void testValidation() {
		assertTrue(validation.validatePhoneNumber("00381018456-789"));
		assertTrue(validation.validatePhoneNumber("+381018456-789"));
		assertFalse(validation.validatePhoneNumber("381018456-789"));
		assertTrue(validation.validateEmail("iv1djikic@gmail.com"));
		assertFalse(validation.validateEmail("@gmail.com"));
		assertFalse(validation.validateEmail("ivdjikicgmail.com"));
		assertFalse(validation.validateEmail("ivdjikic@gmail"));

	}

}
