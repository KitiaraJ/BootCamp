package war;

public class Card {
	private int value;
	private String name;
	
	public Card( String name, int value) {
		this.name = name;
		this.value = value;
	}

	protected void setValue(int value) {
		this.value = value;
	}

	protected int getValue() {
		return value;
	}

	protected void setName(String name) {
			this.name = name;
	}
	
	protected String getName() {
		return name;
	}
	
	/**
	 * describe(Card)
	 * Takes information from a card and returns a String the name and value
	 * @param card
	 * @return
	 */
	public String describe(Card card) {
		return card.getName() + " has a rank of " + card.getValue();
	}

}