package war;

import java.util.*;

public class Player {
	
	private List<Card> hand;
	private String name;
	private int score;
	
	public Player(String name) {
		this.name = name;
		this.setScore(0);
		this.hand = new LinkedList<Card>();
	}

	protected String getName() {
		return name;
	}

	protected void setScore(int score) {
		this.score = score;
	}

	protected int getScore() {
		return score;
	}
		
	protected List<Card> getHand() {
		return hand;
	}

	/**
	 * describe()
	 * Prints out a player and says what cards are in their hands (half the deck) 
	 */
	public void describe() {
		System.out.println(name);
		for (Card card : hand) {
			System.out.println(card.getName());
		}
	}
	
	/**
	 * draw(Deck)
	 * Draws a card from the deck and adds it to the hand
	 * @param deck
	 */
	public void draw(Deck deck) {
		Card card = deck.draw();
		deck.remove(card);
		hand.add(card);
	}
	
	/**
	 * flip(List<Card>)
	 * Removes a card from the players hand and returns it
	 * @param hand
	 * @return Card
	 */
	public Card flip(List<Card> hand) {
		Card playedCard = hand.get(0);
		hand.remove(0);
		return playedCard;
	}
	
	/**
	 * incrementScore()
	 * Add one to the score of a particular player
	 */
	public void incrementScore() {
		score = this.getScore() + 1;
		this.setScore(score);
	}

	
}