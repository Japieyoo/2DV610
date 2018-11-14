package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
		Color[] colorArray = Card.Color.values();
		boolean spadesExists = false;
		boolean clubsExists = false;
		boolean heartsExists = false;
		boolean diamondsExists = false;
		boolean actual = false;

		for (int i = 0; i < colorArray.length; i++) {
			if (colorArray[i] == Color.Spades) {
				spadesExists = true;
			} else if (colorArray[i] == Color.Clubs) {
				clubsExists = true;
			} else if (colorArray[i] == Color.Hearts) {
				heartsExists = true;
			} else if (colorArray[i] == Color.Diamonds) {
				diamondsExists = true;
			}
		}

		if (spadesExists == true && clubsExists == true && heartsExists == true && diamondsExists == true) {
			actual = true;
		}

		assertTrue(actual);
	}

	@Test
	public void CardValueEnum_CheckThatItContainsThirteenValues_ReturnThirteen() {
		int actual = Card.CardValue.values().length;
		int expected = 13;

		assertEquals(expected, actual);
	}

	@Test
	public void CardValueEnum_CheckThatItContainsThirteenCardValues_ReturnTrue() {
		CardValue[] cardValueArray = Card.CardValue.values();
		boolean aceExists = false;
		boolean twoExists = false;
		boolean threeExists = false;
		boolean fourExists = false;
		boolean fiveExists = false;
		boolean sixExists = false;
		boolean sevenExists = false;
		boolean eightExists = false;
		boolean nineExists = false;
		boolean tenExists = false;
		boolean elevenExists = false;
		boolean twelveExists = false;
		boolean thirteenExists = false;

		boolean actual = false;

		for (int i = 0; i < cardValueArray.length; i++) {
			if (cardValueArray[i] == Card.CardValue.ACE) {
				aceExists = true;
			} else if (cardValueArray[i] == Card.CardValue.TWO) {
				twoExists = true;
			} else if (cardValueArray[i] == Card.CardValue.THREE) {
				threeExists = true;
			} else if (cardValueArray[i] == Card.CardValue.FOUR) {
				fourExists = true;
			} else if (cardValueArray[i] == Card.CardValue.FIVE) {
				fiveExists = true;
			} else if (cardValueArray[i] == Card.CardValue.SIX) {
				sixExists = true;
			} else if (cardValueArray[i] == Card.CardValue.SEVEN) {
				sevenExists = true;
			} else if (cardValueArray[i] == Card.CardValue.EIGHT) {
				eightExists = true;
			} else if (cardValueArray[i] == Card.CardValue.NINE) {
				nineExists = true;
			} else if (cardValueArray[i] == Card.CardValue.TEN) {
				tenExists = true;
			} else if (cardValueArray[i] == Card.CardValue.ELEVEN) {
				elevenExists = true;
			} else if (cardValueArray[i] == Card.CardValue.TWELVE) {
				twelveExists = true;
			} else if (cardValueArray[i] == Card.CardValue.THIRTEEN) {
				thirteenExists = true;
			}
		}

		if (aceExists == true && twoExists == true && threeExists == true && fourExists == true && fiveExists == true
				&& sixExists == true && sevenExists == true && eightExists == true && nineExists == true && tenExists == true
				&& elevenExists == true && twelveExists == true && thirteenExists == true) {
			actual = true;
		}

		assertTrue(actual);

	}
}