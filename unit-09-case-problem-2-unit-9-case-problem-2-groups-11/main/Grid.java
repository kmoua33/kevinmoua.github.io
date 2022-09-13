
/**
 * Name: Kevin Moua
 * Date: 03/18/2022
 * Assignment: These methods will generate cards based on enumerated values. It
 * will shuffle an amount of cards and set them to a grid
 * that will be displayed for the user to guess.
 * 
 * Purpose (Class Description): A grid will be used to display a two dimensional
 * array of enumerated card values
 */
import java.util.Random;

public class Grid {
    private final int NUM_OF_PAIRS = 5; 
    private Card[][] cards;

    Random random = new Random(); // Import Random and initialze as random

    /**
     * Grid constructor used to generate and shuffle cards
     */
    public Grid() {
        generateCards();
        shuffle(5);
    }

    /**
     * generateCards method will create a two-dimensional array and add the Card values 
     */
    public void generateCards() {
        // Setting values for 2D array
        cards = new Card[NUM_OF_PAIRS][NUM_OF_PAIRS];

        // Counter to make sure we only make NUM_OF_PAIRS only
        int counter = 0;

        for (int row = 0; row < cards.length; row++) {
            for (int col = 0; col < cards[row].length; col++) {
                if (counter != (NUM_OF_PAIRS * 2)) {
                    cards[row][col] = new Card(Card.Values.values()[row]);
                    counter++;
                }
            }
        }
    }

    /**
     * This method will shuffle the cards in a random order
     * 
     * @param num used to set how many times a shuffle is performed
     */
    public void shuffle(int num) {
        Card temp;

        int counter = 0;
        while (counter != num) {
            System.out.println("Shuffling: " + ++counter + " times..");
            for (int i = cards.length - 1; i > 0; i--) {
                for (int j = cards[i].length - 1; j > 0; j--) {
                    int m = random.nextInt(i + 1);
                    int n = random.nextInt(j + 1);

                    temp = cards[i][j];
                    cards[i][j] = cards[m][n];
                    cards[m][n] = temp;
                }
            }
        }
    }

    /**
     * getCard method will take in int pos as the position of a Card
     * 
     * @param pos represents the position of a Card
     * @return null if a position is invalid
     */
    public Card getCard(int pos) {
        int row = (pos) / NUM_OF_PAIRS;
        int col = (pos) - (NUM_OF_PAIRS * row);

        if (cards[row][col] != null) {
            return cards[row][col];
        }
        return null;
    }

    /**
     *  getCardValue will be used to determine if a Card position is valid
     * 
     * @param pos represents the position of a Card
     * @return null if a position is invalid
     */
    public Card.Values getCardValue(int pos) {
        if (getCard(pos) != null) {
            return getCard(pos).getValue();
        }
        return null;
    }

    /**
     *  showCard will set Card to be shown
     * 
     * @param pos represents the position of a Card
     */
    public void showCard(int pos) {
        if (getCard(pos) != null) {
            getCard(pos).show();
        }
    }

    /**
     *  hideCard will set Card to be hidden
     * 
     * @param pos represents the position of a Card
     */
    public void hideCard(int pos) {
        if (getCard(pos) != null) {
            getCard(pos).hide();
        }
    }

    /**
     *  isCardShown method will use card position and return a boolean value
     * 
     * @param pos represents the position of a Card
     * @return a boolean value of card
     */
    public boolean isCardShown(int pos) {
        if (getCard(pos) != null) {
            return getCard(pos).getIsShown();
        }
        return false;
    }

    /**
     * removeCard will remove a card and set it as null
     * 
     * @param pos represents the position of a Card
     */
    public void removeCard(int pos) {
        int row = (pos) / NUM_OF_PAIRS;
        int col = (pos) - (NUM_OF_PAIRS * row);

        if (cards[row][col] != null) {
            cards[row][col] = null;
        }
    }

    /**
     *  hasCards will have a for loop that will check elements and return null if false
     * 
     * @return true/false if an element is/isn't null
     */
    public boolean hasCards() {
        int counter = cards.length * cards[0].length;

        for (int row = 0; row < cards.length; row++) {
            for (int col = 0; col < cards[row].length; col++) {
                if (cards[row][col] == null) {
                    counter--;
                }
            }
        }

        if (counter == 0) {
            return false;
        }

        return true;
    }

    /**
     * Display grid for user to select a card value
     * 
     * @return string representation of Cards in grid
     */
    public String getGridDisplay() {
        int gridNum = 1;
        String str = "";

        System.out.println("Grid Positions:\n");

        System.out.println("-------------------------------------------------------------------------");

        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                if (cards[i][j] != null) {
                    // If Card is selected, then Show the Card value
                    if (cards[i][j].getIsShown() == true) {
                        str += (cards[i][j].getValue() + "\t|\t");
                        gridNum++;
                    }
                    // Else, the Card is not selected, show the Grid position value instead
                    else {
                        str += (gridNum++ + "\t|\t");
                    }

                } else {
                    // If not a Card, show X
                    str += ("X\t|\t");
                    gridNum++;
                }
            }
            str += "\n-------------------------------------------------------------------------\n";
        }
        return str;
    }
}