package model;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> deck;

	public Deck() {
		deck = new ArrayList<Card>();

		for (int i = 0; i < Card.Color.values().length; i++) {

			for (int j = 0; j < Card.CardValue.values().length; j++) {
				Card c = new Card(Card.Color.values()[i], Card.CardValue.values()[j]);

				deck.add(c);

			}
		}

	}

	public int getSize() {
		return deck.size();
	}


	public Iterable<Card> getDeck() {
		return deck;
	}

	  
	public Card drawCard(){
		if (deck.size() <= 0) {
			throw new NullPointerException();
		}
		return deck.remove(0);

	}

}