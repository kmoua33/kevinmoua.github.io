/**
 * Name: Kevin Moua
 * Date: 03/18/2022
 * Assignment:
 * 
 * Purpose (Class Description): Card class that will hold enumerated values and get/set a card
 */
public class Card {
	public enum Values {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
	};

	private Values value; // Object value variable of enum Values
	private boolean isShown; // Boolean variable for card

    /**
     * Constructor method will be used to set the value of a card and the card will be set as 
     * to false.
     * 
     * @param val Values val class is passed into constructor method
     */
	public Card(Values val) {
		setValue(val);
		hide();
	}

    /**
     *  Returns value of the Card
     * 
     * @return value of card
     */
	public Values getValue() {
		return value;
	}

    /**
     *  Sets the value of a card
     * 
     * @param value Object is passed as parameter
     */
	public void setValue(Values value) {
		this.value = value;
	}
	
    /**
     * Returns boolean value of card
     * 
     * @return a boolean value of Card
     */
	public boolean getIsShown()
	{
		return isShown;
	}

    /**
     * Returns card as true
     */
	public void show() {
		this.isShown = true;
	}

    /**
     * Returns card as false
     */
	public void hide() {
		this.isShown = false;
	}
}