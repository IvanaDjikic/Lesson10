package exercises;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.Test;

class ValidationTest {
       Validation testValidation = new Validation("ivana29","0038160458");
       Validation testValidation1 = new Validation("marina36","0038160698");
	@Test
	void testValidation() {
		assertTrue(testValidation.isValid("ivana29","0038160458"));
		assertFalse(testValidation.isValid("ivana29","0038161458"));
		assertFalse(testValidation1.isValid("marina2628","0038160458"));	
		assertTrue(testValidation1.isValid("marina36","0038160698"));
	}
	

	

}
