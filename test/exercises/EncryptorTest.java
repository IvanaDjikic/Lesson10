package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncryptorTest {

	@Test
	void testEncryptOneCharacter() {
		assertEquals("c", Encryptor.encrypt("a"));
	}

	@Test
	void testEncryptWord() throws Exception {
		assertEquals("ccc", Encryptor.encrypt("aaa"));
		assertEquals("Lcxc", Encryptor.encrypt("Java"));
	}

	// Exercise: decrypt this sentence: Nkxg"nqpi"cpf"rtqurgt#

	@Test
	void testDecryptWord() throws Exception {
		assertEquals("Nkxg\"nqpi\"cpf\"rtqurgt#", Encryptor.encrypt("Live long and prosper!"));

	}

}
