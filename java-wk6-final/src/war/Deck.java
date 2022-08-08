package war;

import java.util.*;

public class Deck extends LinkedList<Card>{
	
	private List<Card> cards;	
	
	public Deck() {
		List<Card> cards = new LinkedList<Card>();
		List<String> suits = List.of("Spades", "Clubs", "Diamonds", "Hearts");
	    List<String> value = List.of("Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace");
	    
	    for (int pos = 0; pos < value.size(); pos++) {
	    	int rank = pos + 2;	    		    	
	    	for(String suit : suits) {	    		
	    		String name = value.get(pos) + " of " + suit;	    	
	    		Card card = new Card(name, rank);
	    		cards.add(card);
	    	}
	    }
		this.cards = cards;
	}

	/**
	 * shuffle()
	 * Uses the Collections class to shuffle and randomize the deck
	 */
	public void shuffle() {
		Collections.shuffle(cards, new Random());		
	}
	
	/**
	 * draw()
	 * Pulls a card from the deck and returns it to add to the hand of a player.
	 * @return Card
	 */
	public Card draw() {
		Card playedCard = cards.get(0);
		cards.remove(0);
		return playedCard;
	}

}