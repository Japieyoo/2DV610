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
		Card.Color[] colors = {Card.Color.Spades, Card.Color.Clubs, Card.Color.Hearts, Card.Color.Diamonds};
		Card.CardValue[] values = {Card.CardValue.ACE, Card.CardValue.TWO, Card.CardValue.THREE, Card.CardValue.FOUR,
		Card.CardValue.FIVE, Card.CardValue.SIX, Card.CardValue.SEVEN, Card.CardValue.EIGHT,
		Card.CardValue.NINE, Card.CardValue.TEN, Card.CardValue.ELEVEN, Card.CardValue.TWELVE,
		Card.CardValue.THIRTEEN};
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
	public void DrawCard_CheckDeckSizeDecrease_Return51() {
		sut.deck.drawCard();
		int expected = 51;
		int actual = sut.deck.size();
		assertEquals(expected, actual);
	}
	
}
