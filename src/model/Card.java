package model;

public class Card {

	private Color color;
	private CardValue cardValue;

	public Card(Color color, CardValue cardValue) {
		if (color == null || cardValue == null) {
			throw new IllegalArgumentException();
		}
		this.color = color;
		this.cardValue = cardValue;

	}

	public enum Color {
		Spades, Clubs, Hearts, Diamonds
	}

	public enum CardValue {
		ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), ELEVEN(11),
		TWELVE(12), THIRTEEN(13);

		private int numVal;

		CardValue(int numVal) {
			this.numVal = numVal;
		}

		public int getNumVal() {
			return this.numVal;
		}
	}

	public Color getColor() {
		return color;
	}

	public CardValue getCardValue() {
		return cardValue;
	}

}
