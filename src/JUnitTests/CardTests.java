package JUnitTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Card;

class CardTests {

    @Test
    public void ColorEnum_CreateEnum_ReturnFourItems() {
        int actual = Card.Color.values().length;
        int expected = 4;

        assertEquals(expected, actual);
    }

}