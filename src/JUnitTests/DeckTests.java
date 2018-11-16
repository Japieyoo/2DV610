package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Deck;

class DeckTests {

	@Test
	public void Size_CheckDeckSize_Return52() {
		Deck d = new Deck();
		
		int expected = 52;
		int actual = d.deck.size();
		assertEquals(expected, actual);
	}
}
