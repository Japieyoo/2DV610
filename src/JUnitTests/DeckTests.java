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
	public void Size_CheckDeckSize_Return52() {
		Deck d = new Deck();
		
		int expected = 52;
		int actual = d.getSize();
		assertEquals(expected, actual);
	}
	
	@Test
	public void Deck_CheckThatAllDifferentCardsExist_Return52() {

		int actual = 0;
		int expected = 52;
		int cardIndex = 0;
		ArrayList<CardStub> differentCardsStub = differentCardsStub();
		Card.Color[] colors = Card.Color.values();
		Card.CardValue[] values = Card.CardValue.values();
		for (int i = 0; i < Card.Color.values().length; i++) {
			for (int j = 0; j < Card.CardValue.values().length; j++) {
				if (differentCardsStub.get(cardIndex).getCardValue() == values[j]
						&& differentCardsStub.get(cardIndex).getColor() == colors[i]) {
					actual++;
					cardIndex++;
				}
			}
		}
		assertEquals(expected, actual);

	}
	@Test
	public void Deck_DontCountSameCard_Return1() {

		int actual = 0;
		int expected = 1;
		int cardIndex = 0;
		ArrayList<CardStub> sameCardsStub = sameCardsStub();
		Card.Color[] colors = Card.Color.values();
		Card.CardValue[] values = Card.CardValue.values();
		for (int i = 0; i < Card.Color.values().length; i++) {
			for (int j = 0; j < Card.CardValue.values().length; j++) {
				if (sameCardsStub.get(cardIndex).getCardValue() == values[j]
						&& sameCardsStub.get(cardIndex).getColor() == colors[i]) {
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
			int size = sut.getSize();
			for (int i = 0; i < size + 1; i++) {
				sut.drawCard();
			}
		} catch (Exception e) {
			thrown = true;
		}
		assertTrue(thrown);
	}

	private class CardStub extends Card {

		public CardStub(Color color, CardValue cardValue) {
			super(color, cardValue);
		}

	}

	private ArrayList<CardStub> differentCardsStub() {
		ArrayList<CardStub> differentCardsStub = new ArrayList<CardStub>();


		for (int i = 0; i < Card.Color.values().length; i++) {

			for (int j = 0; j < Card.CardValue.values().length; j++) {
				CardStub c = new CardStub(Card.Color.values()[i], Card.CardValue.values()[j]);

				differentCardsStub.add(c);

			}
		}

		return differentCardsStub;

	}
	private ArrayList<CardStub> sameCardsStub() {
		ArrayList<CardStub> differentCardsStub = new ArrayList<CardStub>();


		for (int i = 0; i < Card.Color.values().length; i++) {

			for (int j = 0; j < Card.CardValue.values().length; j++) {
				CardStub c = new CardStub(Card.Color.values()[0], Card.CardValue.values()[0]);

				differentCardsStub.add(c);

			}
		}

		return differentCardsStub;

	}
	
	

}
