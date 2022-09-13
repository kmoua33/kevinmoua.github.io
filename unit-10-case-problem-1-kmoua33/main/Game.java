/**
 * Name: Kevin Moua
 * Date: 03/24/2022
 * Assignment: Unit 10 Case Problem 1
 * 
 * Purpose (Class Description): The Game class will hold a String name, int of min/max players, and enumerated value objects
 */
public class Game {
    public enum Games {
        CARD, BOARD, VIDEO
    }

    private String name; // String variable for name of game
    private int minNumOfPlayers; // int variable to hold min players
    private int maxNumOfPlayers; // int variable to hold max players
    private Games type; // enum object for type of game

    /**
     * Constructor class that will hold the name of a game, number of min/max players, and Game type
     * 
     * @param name passed into parameter as an String
     * @param minNumOfPlayers passed into parameter as an int
     * @param maxNumOfPlayers passed into parameter as in int
     * @param type passed into paraameter as a Game type
     */
    public Game(String name, int minNumOfPlayers, int maxNumOfPlayers, Games type)
    {
        setName(name);
        setMinNumOfPlayers(minNumOfPlayers);
        setMaxNumOfPlayers(maxNumOfPlayers);
        setGames(type);
    }

    /**
     * Returns name of a game
     * 
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name of a game
     * 
     * @param name passed as a String
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Returns the mininum value of players
     * 
     * @return minNumPlayers
     */
    public int getMinNumOfPlayers()
    {
        return minNumOfPlayers;
    }

    /**
     * Sets the minimum amount of players with a condition statement to check
     * if value is less than 1, set value to = 1
     * 
     * @param minNumOfPlayers is passed as an integer
     */
    public void setMinNumOfPlayers(int minNumOfPlayers)
    {
        if(minNumOfPlayers < 1)
        {
            this.minNumOfPlayers = 1;
        }
        else
        {
            this.minNumOfPlayers = minNumOfPlayers;
        }
    }

    /**
     * Returns maximum number of players
     * 
     * @return maxNumOfPlayers
     */
    public int getMaxNumOfPlayers()
    {
        return maxNumOfPlayers;
    }

    /**
     * Sets the maximum number of players and uses conditional 
     * statement to compare maxNumofPlayers to minNumOfPlayers
     * If maxNumOfPlayers is less than minNumOfPlayers then set 
     * it = to minNumOfPlayers
     * 
     * @param maxNumOfPlayers passed into parameter as an int
     */
    public void setMaxNumOfPlayers(int maxNumOfPlayers)
    {
        if(maxNumOfPlayers < minNumOfPlayers)
        {
            this.maxNumOfPlayers = minNumOfPlayers;
        }
        else
        {
            this.maxNumOfPlayers = maxNumOfPlayers;
        }
    }

    /**
     * Returns the type of Games
     * 
     * @return Games type
     */
    public Games getGames()
    {
        return type;
    }

    /**
     * Sets the type of Game
     * 
     * @param type passed into parameter of enum object Games
     */
    public void setGames(Games type)
    {
        this.type = type;
    }

    /**
     * Overrides if this parent class is called and is executed instead
     */
    @Override
    public String toString()
    {
        return this.name + "is a " + this.type + " game that is playable with " + this.minNumOfPlayers + " to " + this.maxNumOfPlayers;
    }

}
