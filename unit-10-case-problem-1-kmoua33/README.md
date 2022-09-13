[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=7406418&assignment_repo_type=AssignmentRepo)
# WilmU-2022-Unit-10-Case-Problem-1

In this case problem, you will be creating a Game class to represent details about a game

## Files for this case problem:
- Game.java
- CardGame.java
- CardDemo.java

## Game.java Requirements
Create a class called Game that has the following:
- enum
  - Create an enum for the different types of games.  
  - At a minimum it should have the values CARD, BOARD, and VIDEO
- Instance variables
  - name
  - minNumOfPlayers
  - maxNumOfPlayers
  - type (Uses the enum)
- Methods
  - Constructor method
    - Include parameters for each of the instance variables
    - Set each of the values using the appropriate setter method
  - Getter/setter methods for the name
  - Getter/setter methods for the minNumOfPlayers
    - If the given value is less than 1, set it to 1.
  - Getter/setter methods for the maxNumOfPlayers
    - If the given value is less than minNumOfPlayers, set it to minNumOfPlayers
  - Getter/setter methods for the type
  - toString method (Override)
    - Returns a String representation of the Game
    - It will return a String matching the following format:
      - _name_ is a _type_ game playable with _minNumOfPlayers_ to _maxNumOfPlayers_ players.
      - Example: Uno is a card game playable with 2 to 10 players.

## CardGame.java Requirements
Create a class CardGame that does the following:
- It is a child class of the Game class (modify the class header to implement this requirement)
- Instance variable
  - isStandardCardDeck (boolean)
- Methods
  - Constructor method
    - Parameters for the name, minNumOfPlayers, maxNumOfPlayers, and usesStandardCardDeck
    - Call the super constructor with the given name, minNumOfPlayers, maxNumOfPlayers, and relevant enum value for the type
    - Call the setter method to set the usesStandardCardDeck instance variable
  - Getter/setter method for isStandardCardDeck
  - toString method (Override)
    - Returns a String representation of the CardGame
    - It will get the String representation of the superclass and add on a message for whether or not it uses a standard deck of cards.
      - Example: Uno is a card game playable with 2 to 10 players. You will need to purchase the cards for this game.
      - Example: Blackjack is a card game playable with 2 to 7 players. This game is playable with a standard deck of cards.

## CardGameDemo.java Requirements
This class has been provided for you and assumes you have defined all the appropriate methods within the other classes. You may temporarily comment out code while testing, but do NOT remove or change code within this class. If there is an error with the code for this class, it is something you need to fix in the implementation of your other classes rather than this one.

I made this demo use an ArrayList so you can create as many or as few CardGames as you like while testing.
