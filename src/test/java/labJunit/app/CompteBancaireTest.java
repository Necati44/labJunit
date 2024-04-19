package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompteBancaireTest {

	public CompteBancaire compte;
	
	@BeforeEach
	public void setUp() {
		compte = new CompteBancaire(10);
	}
	
	@Test
	void testDebiterSolde1() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			compte.debiterSolde(-5);
	    });

	    String expectedMessage = "On ne peut débité le solde par une valeur négative.";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testDebiterSolde2() {
		assertEquals(compte.debiterSolde(5.5), 4.5);
	}

	@Test
	void testCrediterSolde1() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			compte.crediterSolde(-5);
	    });

	    String expectedMessage = "On ne peut crédité le solde par une valeur négative.";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testCrediterSolde2() {
		assertEquals(compte.crediterSolde(5.5), 15.5);
	}

}
