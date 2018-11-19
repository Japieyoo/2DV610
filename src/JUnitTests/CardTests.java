package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import model.Card;
import model.Card.CardValue;
import model.Card.Color;

class CardTests {

	@Test
	public void ColorEnum_CheckThatItContainsFourItems_ReturnFour() {
		int actual = Card.Color.values().length;
		int expected = 4;

		assertEquals(expected, actual);
	}

	@Test
	public void ColorEnum_CheckThatItContainsTheCorrectItems_ReturnTrue() {
		int actual = 0;
		int expected = 4;
		Color[] sut = Card.Color.values();
		Color[] correctArray = { Card.Color.Spades, Card.Color.Clubs, Card.Color.Hearts, Card.Color.Diamonds };
		for (int i = 0; i < sut.length; i++) {
			if (Arrays.stream(correctArray).anyMatch(sut[i]::equals)) {
				actual++;
			}
		}

		assertEquals(expected, actual);
	}

	@Test
	public void CardValueEnum_CheckThatItContainsThirteenValues_ReturnThirteen() {
		int actual = Card.CardValue.values().length;
		int expected = 13;

		assertEquals(expected, actual);
	}

	@Test
	public void CardValueEnum_CheckThatItContainsThirteenCardValues_ReturnTrue() {
		CardValue [] sut = Card.CardValue.values();
		int actual = 0;
		int expected = 13;
		CardValue[] correctArray = { Card.CardValue.ACE, Card.CardValue.TWO, Card.CardValue.THREE, Card.CardValue.FOUR,
				Card.CardValue.FIVE, Card.CardValue.SIX, Card.CardValue.SEVEN, Card.CardValue.EIGHT,
				Card.CardValue.NINE, Card.CardValue.TEN, Card.CardValue.ELEVEN, Card.CardValue.TWELVE,
				Card.CardValue.THIRTEEN };
		for (int i = 0; i < sut.length; i++) {
			if (Arrays.stream(correctArray).anyMatch(sut[i]::equals)) {
				actual++;
			}
		}

		assertEquals(expected, actual);
	}

	@Test
	public void CardValueGetNumVal_CheckAllCardValuesAreCorrect_ReturnTrue() {
		boolean actual = false;
		int valueCheck = 1;
		CardValue[] sut = Card.CardValue.values();
		for (int i = 0; i < sut.length; i++) {
			if (sut[i].getNumVal() == valueCheck++) {
				actual = true;
			} else {
				actual = false;
				break;
			}
		}

		assertTrue(actual);
	}

	@Test
	public void Constructor_ShouldThrowWhenNullParameter() {
		boolean thrown = false;
		try {
			new Card(null, null);
		} catch (Exception e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void Constructor2_ShouldThrowWhenNullParameter() {
		boolean thrown = false;
		try {
			new Card(Card.Color.Hearts, null);
		} catch (Exception e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	@Test
	public void Constructor3_ShouldThrowWhenNullParameter() {
		boolean thrown = false;
		try {
			new Card(null, Card.CardValue.EIGHT);
		} catch (Exception e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void Constructor_ShouldNotThrowWithCorrectParameter() {
		boolean thrown = true;
		try {
			new Card(Color.Clubs, CardValue.ACE);
		} catch (Exception e) {
			thrown = false;
		}
		assertTrue(thrown);
	}
	@Test
	public void GetCardColor_ReturnHearts() {
		Card sut = new Card(Card.Color.Hearts, Card.CardValue.ACE);
		Card.Color expected = Card.Color.Hearts;
		Card.Color actual = sut.getColor();
		assertEquals(expected, actual);
		
	}
	@Test
	public void GetCardValue_ReturnACE() {
		Card sut = new Card(Card.Color.Hearts, Card.CardValue.ACE);
		Card.CardValue expected = Card.CardValue.ACE;
		Card.CardValue actual = sut.getCardValue();
		assertEquals(expected, actual);
		
	}
	@Test
	public void GetCardValue_Return1() {
		Card sut = new Card(Card.Color.Hearts, Card.CardValue.ACE);
		int expected = 1;
		int actual = sut.getCardValue().getNumVal();
		assertEquals(expected, actual);
		
	}

}