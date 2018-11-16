package JUnitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import model.Card;
import model.Deck;
import model.Card.CardValue;
import model.Card.Color;

class DeckTests {

	@Test
	public void Size_CheckDeckSize_Return52() {
		Deck sut = new Deck();
		
		int expected = 52;
		int actual = sut.deck.size();
		assertEquals(expected, actual);
	}
	@Test
	public void Deck_CheckDifferentCards_Return52() {
		Deck sut = new Deck();
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
	
}
