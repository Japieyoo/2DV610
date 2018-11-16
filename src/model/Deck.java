package model;

import java.util.ArrayList;

public class Deck {
	public ArrayList <Card> deck;

	public Deck() {
	    deck = new ArrayList<Card>();

	    for (int i = 0; i < Card.Color.values().length; i++) {

	      for (int j = 0; j < Card.CardValue.values().length; j++) {
	        Card c = new Card(Card.Color.values()[i], Card.CardValue.values()[j]);
	       	      
	        deck.add(c);

	      }
	    }
}
}