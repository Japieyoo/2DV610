package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import model.Card;
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

}