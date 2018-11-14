package model;

public class Card {

	public enum Color {
		Spades, Clubs, Hearts, Diamonds
	}

	public enum CardValue {
		A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8), I(9), J(0), K(10), L(11), M(12);

		private int numVal;

		CardValue(int numVal) {
			this.numVal = numVal;
		}

		public int getNumVal() {
			return numVal;
		}
	}
}
