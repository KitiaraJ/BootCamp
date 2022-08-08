package war;

public class App {

	public static void main(String[] args) {
		
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");		
		Deck deck = new Deck();
		
		gameSetup(player1, player2, deck);
		playTheGame(player1, player2);
		declareWinner(player1, player2);		
		
	}
	
	/**
	 * gameSetup(Player, Player, Deck)
	 * This uses a traditional for loop to deal the cards to the players and splits the deck in half.
	 * It uses a modulo operator to switch which player it's dealing to so the deck is randomized as well as a traditional deal.
	 * @param player1
	 * @param player2
	 * @param deck
	 */
	public static void gameSetup(Player player1, Player player2, Deck deck) {
		deck.shuffle();
		for (int deal = 0; deal < 52; deal++) {
			if (deal % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
	}
	
	/**
	 * playTheGame(Player, Player)
	 * Takes the two players and runs the game calling flip and describe to print out what each player got.
	 * Then 
	 * @param player1
	 * @param player2
	 */
	public static void playTheGame(Player player1, Player player2) {
		for (int play = 0; play < 26; play++) {
			
			Card card1 = player1.flip(player1.getHand());
			String flippedCard1 = card1.describe(card1);
			System.out.println(player1.getName() + " plays: " + flippedCard1);
			
			Card card2 = player2.flip(player2.getHand());
			String flippedCard2 = card2.describe(card2);
			System.out.println(player2.getName() + " plays: " + flippedCard2);
			
			if (card1.getValue() > card2.getValue()) {
				System.out.println("Point to " + player1.getName() + "! End of Round! \n");
				player1.incrementScore();
			} else if (card1.getValue() < card2.getValue()) {
				System.out.println("Point to " + player2.getName() + "! End of Round! \n");
				player2.incrementScore();
			} else {
				System.out.println("Draw! No points awarded! End of Round! \n");
			}
		}
	}

	/**
	 * declareWinner(Player, Player)
	 * Compares and prints the scores of each player, then prints out the reponse based on score.
	 * @param player1
	 * @param player2
	 */
	private static void declareWinner(Player player1, Player player2) {
		System.out.println(player1.getName() + "'s Score: " + player1.getScore());
		System.out.println(player2.getName() + "'s Score: " + player2.getScore());
		
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " WINS!!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " WINS!!");
		} else {
			System.out.println("Draw");
		}
	}		
}