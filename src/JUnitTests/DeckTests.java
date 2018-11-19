package JUnitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Card;
import model.Deck;

class DeckTests {

	Deck sut;
	ArrayList<Card> iteratedList;

	@BeforeEach
	public void setup() {

		sut = new Deck();

		iteratedList = new ArrayList<Card>();
		for (Card c : sut.getHand()) {
			iteratedList.add(c);
		}
	}

	@Test
	public void Deck_CheckThatAllDifferentCardsExist_Return52() {

		int actual = 0;
		int expected = 52;
		int cardIndex = 0;

		Card.Color[] colors = Card.Color.values();
		Card.CardValue[] values = Card.CardValue.values();
		for (int i = 0; i < colors.length; i++) {
			for (int j = 0; j < values.length; j++) {
				if (iteratedList.get(cardIndex).getCardValue() == values[j]
						&& iteratedList.get(cardIndex).getColor() == colors[i]) {
					actual++;
					cardIndex++;
				}
			}
		}
		assertEquals(expected, actual);

	}

	@Test
	public void DrawCard_CheckDeckSizeDecrease_Return51() {
		sut.drawCard();
		int expected = 51;
		int actual = sut.getSize();
		assertEquals(expected, actual);
	}

	@Test
	public void DrawCard_OnEmptyDeck_ReturnException() {
		boolean thrown = false;
		try {
			int size = iteratedList.size();
			for (int i = 0; i < size + 1; i++) {
				sut.drawCard();
			}
		} catch (Exception e) {
			thrown = true;
		}
		assertTrue(thrown);
	}

}

