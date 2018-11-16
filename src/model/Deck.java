package model;

import java.util.ArrayList;

public class Deck {
	public ArrayList <Card > deck;
	
	public Deck() {
		deck = new ArrayList<Card>();
		Card c = new Card(Card.Color.Clubs, Card.CardValue.ACE);
		for (int i = 0; i < 52; i++) {
			deck.add(c);
		}
	}
}