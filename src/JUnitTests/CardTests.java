package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import model.Card;

class CardTests {

	@Test
	public void ColorEnum_CreateEnum_ReturnFourItems() {
		int actual = Card.Color.values().length;
		int expected = 4;

		assertEquals(expected, actual);
	}

}