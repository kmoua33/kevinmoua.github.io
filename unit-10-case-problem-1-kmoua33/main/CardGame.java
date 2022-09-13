/**
 * Name: Kevin Moua
 * Date: 03/24/2022
 * Assignment: Unit 10 Case Problem 1
 * 
 * Purpose (Class Description): The Cardgame is the child class of the Game class and will refer to its parent class
 * as well as override the parent class with the toString method.
 */
public class CardGame extends Game{
  private boolean isStandardCardDeck; // boolean value for standard deck

  /**
   * Constructor class that will be used to get the name, min/max, and boolean value of a standard deck or not
   * 
   * @param name passed as an String value
   * @param minNumOfPlayers passed as an int value
   * @param maxNumOfPlayers passed as an int vallue
   * @param usesStandardCardDeck passed as a boolean value
   */
  public CardGame(String name, int minNumOfPlayers, int maxNumOfPlayers, boolean usesStandardCardDeck)
  {
    super(name, minNumOfPlayers, maxNumOfPlayers, Games.CARD); // Refers to parent class
    usesStandardCardDeck(isStandardCardDeck);
  }

  /**
   * Sets the deck to a boolean value to deteremine if it is a standard deck or not
   * 
   * @param isStandardCardDeck is passed into method
   */
  public void usesStandardCardDeck(boolean isStandardCardDeck)
  {
      this.isStandardCardDeck = isStandardCardDeck;
  }

  /**
   * Returns a boolean value 
   * 
   * @return
   */
  public boolean getIsStandardCardDeck()
  {
      return isStandardCardDeck;
  }

  /**
   *  Override, if this child method is called and will execute instead
   */
  @Override
  public String toString()
  {
    return super.getName() + " is a " + super.getGames() + " game that is playable with " + super.getMinNumOfPlayers() + " to " + super.getMaxNumOfPlayers() +
    " players. This game is playable with a standard deck of cards.";
}
}
