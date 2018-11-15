package model;

public class Card {

	public enum Color {
		Spades, Clubs, Hearts, Diamonds
	}

	public enum CardValue {
		ACE(1), TWO(1), THREE(1), FOUR(1), FIVE(1), SIX(1), SEVEN(1), EIGHT(1), NINE(1), TEN(1), ELEVEN(1), TWELVE(1), THIRTEEN(1);

		private int numVal;

		CardValue(int numVal) {
			this.numVal = numVal;
		}

		public int getNumVal() {
			return this.numVal;
		}
	}
}
