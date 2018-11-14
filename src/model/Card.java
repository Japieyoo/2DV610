package model;

public class Card {

	public enum Color {
		Spades, Clubs, Hearts, Diamonds
	}

	public enum CardValue {
		ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(0), ELEVEN(10), TWELVE(11), THIRTEEN(12);

		private int numVal;

		CardValue(int numVal) {
			this.numVal = numVal;
		}

		public int getNumVal() {
			return numVal;
		}
	}
}
