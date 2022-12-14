
/**
 * Name: James Sekcienski
 * Date: 11/7/21
 * Assignment: Unit 10 Case Problem 1
 * 
 * Purpose (Class Description): Allows the user to create and display CardGame
 */

import java.util.*;

public class CardGameDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<CardGame> cardGames = askForCardGames(input);
    input.close();

    displayCardGames(cardGames);
  }

  /**
   * Asks the user if they would like to add a card game to the list.
   * As long as the user continues to say Y, they will create card games
   * that are added to the list.
   * It returns the list of card games that were created when the user
   * says N.
   * 
   * @param input The Scanner to get console input
   * @return The list of card games created by the user
   */
  public static ArrayList<CardGame> askForCardGames(Scanner input) {
    ArrayList<CardGame> cardGames = new ArrayList<CardGame>();

    String response;
    while (true) {
      System.out.println("Would you like to add a card game to the list? (Y/N)");
      response = input.nextLine();
      if (response.equalsIgnoreCase("Y")) {
        cardGames.add(askForCardGame(input));
      } else if (response.equalsIgnoreCase("N")) {
        break;
      } else {
        System.out.println("Invalid entry.  Type Y for YES or N for NO.");
      }
    }

    return cardGames;
  }

  /**
   * Asks the user for the information to create a card game
   * 
   * @param input The Scanner to get console input
   * @return The card game created based on user input
   */
  public static CardGame askForCardGame(Scanner input) {
    String name = askForGameName(input);
    int minNumOfPlayers = askForMinNumOfPlayers(input);
    int maxNumOfPlayers = askForMaxNumOfPlayers(input, minNumOfPlayers);
    boolean isStandardCardDeckGame = askIfUsesStandardCardDeck(input);
    return new CardGame(name, minNumOfPlayers, maxNumOfPlayers, isStandardCardDeckGame);
  }

  /**
   * Asks the user for the game name
   * 
   * @param input The Scanner to get console input
   * @return The name of the game entered by the user
   */
  public static String askForGameName(Scanner input) {
    System.out.println("Enter game name: ");
    return input.nextLine();
  }

  /**
   * Asks the user for the minimum number of players for the game.
   * It continues to ask until they enter at least 1.
   * 
   * @param input The Scanner to get console input
   * @return The minimum number of players for the game entered by the user
   */
  public static int askForMinNumOfPlayers(Scanner input) {
    System.out.println("Enter the minimum number of players: ");

    int minNumOfPlayers = 0;
    while (minNumOfPlayers < 1) {
      String userResponse = input.nextLine();
      try {
        minNumOfPlayers = Integer.parseInt(userResponse);
        if (minNumOfPlayers < 1) {
          System.out.println("The game must require at least 1 player.");
        }
      } catch (NumberFormatException e) {
        System.out.println("You must enter a number. Try again.");
      }
    }

    return minNumOfPlayers;
  }

  /**
   * Asks the user for the maximum number of players for the game.
   * It continues to ask until they enter at least 1.
   * 
   * @param input           The Scanner to get console input
   * @param minNumOfPlayers The minimum number of players for the game
   * @return The maximum number of players for the game entered by the user
   */
  public static int askForMaxNumOfPlayers(Scanner input, int minNumOfPlayers) {
    System.out.println("Enter the maximum number of players: ");

    int maxNumOfPlayers = 0;
    while (maxNumOfPlayers < minNumOfPlayers) {
      String userResponse = input.nextLine();
      try {
        maxNumOfPlayers = Integer.parseInt(userResponse);
        if (maxNumOfPlayers < minNumOfPlayers) {
          System.out.println("The maximum number of players can't be less than the minimum.");
        }
      } catch (NumberFormatException e) {
        System.out.println("You must enter a number. Try again.");
      }
    }

    return maxNumOfPlayers;
  }

  /**
   * Asks the user if the game can be played with a standard deck of cards
   * 
   * @return true if the user says Y. false if the user says N
   */
  public static boolean askIfUsesStandardCardDeck(Scanner input) {
    String response;
    while (true) {
      System.out.println("Can this game be played with a standard deck of cards? (Y/N)");
      response = input.nextLine();
      if (response.equalsIgnoreCase("Y")) {
        return true;
      } else if (response.equalsIgnoreCase("N")) {
        return false;
      } else {
        System.out.println("Invalid entry.  Type Y for YES or N for NO.");
      }
    }
  }

  /**
   * Prints out the information of each of the card games in the list.
   * 
   * @param cardGames The list of card games
   */
  public static void displayCardGames(ArrayList<CardGame> cardGames) {
    if (cardGames.size() == 0) {
      System.out.println("There are no card games in this list.");
    } else {
      System.out.println("The list of card games includes the following: ");
      for (CardGame cardGame : cardGames) {
        System.out.println(cardGame);
      }
    }
  }
}
