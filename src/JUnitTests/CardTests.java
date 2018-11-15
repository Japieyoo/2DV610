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
		Color[] colorArray = Card.Color.values();
		Color[] correctArray = { Card.Color.Spades, Card.Color.Clubs, Card.Color.Hearts, Card.Color.Diamonds };
		for (int i = 0; i < colorArray.length; i++) {
			if (Arrays.stream(correctArray).anyMatch(colorArray[i]::equals)) {
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
		int actual = 0;
		int expected = 13;
		CardValue[] cardValueArray = Card.CardValue.values();
		CardValue[] correctArray = { Card.CardValue.ACE, Card.CardValue.TWO, Card.CardValue.THREE, Card.CardValue.FOUR,
				Card.CardValue.FIVE, Card.CardValue.SIX, Card.CardValue.SEVEN, Card.CardValue.EIGHT,
				Card.CardValue.NINE, Card.CardValue.TEN, Card.CardValue.ELEVEN, Card.CardValue.TWELVE,
				Card.CardValue.THIRTEEN };
		for (int i = 0; i < cardValueArray.length; i++) {
			if (Arrays.stream(correctArray).anyMatch(cardValueArray[i]::equals)) {
				actual++;
			}
		}

		assertEquals(expected, actual);
	}

	@Test
	public void CardValuegetNumVal_CheckAllCardValuesAreCorrect_ReturnTrue() {
		boolean actual = false;
		int valueCheck = 1;
		CardValue[] cardValueArray = Card.CardValue.values();
		for (int i = 0; i < cardValueArray.length; i++) {
			if (cardValueArray[i].getNumVal() == valueCheck++) {
				actual = true;
			} else {
				actual = false;
				break;
			}
		}

		assertTrue(actual);
	}

}