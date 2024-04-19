package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@Test
	void testSomme() {
		assertEquals(Calculatrice.somme(5, 5), 10);
	}
	
	@Test
	void testProduit() {
		assertEquals(Calculatrice.produit(5, 5), 25);
	}

}
