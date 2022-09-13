/**
 * Name: Kevin Moua
 * Date: 04/01/2022
 * Assignment: Unit 11 Case Problem 1
 * 
 * Purpose (Class Description): Question will be an abstract class with a prompt and number of points.  
 * It will hold 3 abstract classes that will be implemented in the child classes that use them.
 */
public abstract class Question {
    private String prompt;
    private int numOfPoints;

    /**
     * Constructor class for Question to set question and number of points
     * 
     * @param prompt is passed as a string 
     * @param numOfPoints is passed as an integer
     */
    public Question(String prompt, int numOfPoints) {
        setPrompt(prompt);
        setNumOfPoints(numOfPoints);
    }

    /**
     * Returns a string prompt for Question 
     * 
     * @return String prompt
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Sets the prompt for Question
     * 
     * @param newPrompt is passed into parameter as a String
     */
    public void setPrompt(String newPrompt) {
        this.prompt = newPrompt;
    }

    /**
     * Returns a number of points for Question
     * 
     * @return int numOfPoints
     */
    public int getNumOfPoints() {
        return numOfPoints;
    }

    /**
     * Sets the number of points for a Question.  Condition statement to ensure that numOfPoints isnt negative
     * 
     * @param newNumOfPoints is passed as an int
     */
    public void setNumOfPoints(int newNumOfPoints) {
        if (numOfPoints < 0) // Ensure the numOfPoints is not negative.
        {
            this.numOfPoints = 0;
        } else {
            this.numOfPoints = newNumOfPoints;
        }
    }

    public abstract String getCorrectAnswer(); // returns the correct answer as a String

    public abstract String getQuestionDisplay(); // returns a String representing the question as it would be displayed in a quiz

    public abstract boolean isCorrectAnswer(String answerChoice); // takes in a String answer choice and returns true if it is the correct answer (false otherwise).


}
