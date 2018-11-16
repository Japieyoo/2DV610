package JUnitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Card;
import model.Deck;

class DeckTests {
	
	Deck sut;
	
	@BeforeEach
	public void setup() {
		sut = new Deck();
	}
	
	@Test
	public void Size_CheckDeckSize_Return52() {
		
		int expected = 52;
		int actual = sut.deck.size();
		assertEquals(expected, actual);
	}
	@Test
	public void Deck_CheckThatAllDifferentCardsExist_Return52() {
		
		int actual = 0;
		int expected = 52;
		int cardIndex = 0;
		Card.Color[] colors = Card.Color.values();
		Card.CardValue[] values = Card.CardValue.values();
		for(int i = 0; i < colors.length; i++) {
				for(int j = 0; j < values.length; j++) {
					if (sut.deck.get(cardIndex).getCardValue() == values[j] && sut.deck.get(cardIndex).getColor() == colors[i]) {
						actual++;
						cardIndex++;
					}
				}
		}
		assertEquals(expected, actual);
	
	}
	
	@Test
	public void DeckSize_Return52() {
		int expected = 52;
		int actual = sut.getSize();
		assertEquals(expected, actual);
	}
	
	@Test
	public void DrawCard_CheckDeckSizeDecrease_Return51() {
		sut.drawCard();
		int expected = 51;
		int actual = sut.deck.size();
		assertEquals(expected, actual);
	}
	
	
	
	@Test
	public void DrawCard_OnEmptyDeck_ReturnException() {
		boolean thrown = false;
		try {
			int size = sut.deck.size();
			for (int i = 0; i < size + 1; i++) {
				sut.drawCard();
			}
		} catch (Exception e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
}
