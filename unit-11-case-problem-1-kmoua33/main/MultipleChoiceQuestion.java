/**
 * Name: Kevin Moua
 * Date: 04/01/2022
 * Assignment: Unit 11 Case Problem 1
 * 
 * Purpose (Class Description): MultipleChoiceQuestion is the child class of Question and contains a String array and holds the correct answer index
 */
public class MultipleChoiceQuestion extends Question {
    private String[] answerChoices;
    private int correctAnswerIndex;

    /**
     * Constructor class for MultipleChoiceQuestion 
     * 
     * Listed below are the parameters that will be passed into
     * @param prompt
     * @param numOfPoints
     * @param answerChoices
     * @param correctAnswerIndex
     */
    public MultipleChoiceQuestion(String prompt, int numOfPoints, String[] answerChoices, int correctAnswerIndex) {
        super(prompt, numOfPoints);
        setAnswerChoices(answerChoices);
        setCorrectAnswerIndex(correctAnswerIndex);

    }

    /**
     * Returns the answerChoices for multiple choice
     * 
     * @return answerChoices
     */
    public String[] getAnswerChoices() {
        return answerChoices;
    }

    /**
     * Sets the newAnswerchoice as asnwerChoice
     * 
     * @param newAnswerChoices is passed as a String array
     */
    public void setAnswerChoices(String[] newAnswerChoices) {
        this.answerChoices = newAnswerChoices;
    }

    /**
     * Returns the correct answer index of multiple choice question
     * 
     * @return correctAnswerIndex
     */
    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    /**
     * Sets the correct answer index with a condition statement to send an error message if index is -1 (invalid)
     * 
     * @param newCorrectAnswerIndex
     */
    public void setCorrectAnswerIndex(int newCorrectAnswerIndex) {
        if (newCorrectAnswerIndex > -1 || newCorrectAnswerIndex < answerChoices.length) {
            this.correctAnswerIndex = newCorrectAnswerIndex;
        } else {
            this.correctAnswerIndex = -1;
        }
    }

    /**
     * Uses the abstract method from parent class to return correct asnwer as String
     */
    @Override
    public String getCorrectAnswer() {
        if (getCorrectAnswerIndex() == -1) {
            return ("ERROR: Correct answer is unknown.");
        } else {
            return answerChoices[getCorrectAnswerIndex()];
        }
    }

    /**
     * Uses abstract method from parent class to return String representing the question as it would be displayed in a quiz
     */
    @Override
    public String getQuestionDisplay() {
        String question = getPrompt();
        int counter = 1;
        for (int i = 0; i < answerChoices.length; i++) {
            question += "\n\t(" + counter++ + ") " + answerChoices[i];
        }
        return question;

    }

    /**
     * Uses abstract method from parent class that takes in a String answer choice and returns true if it is the correct answer (false otherwise). 
     */
    @Override
    public boolean isCorrectAnswer(String answerChoice) {
        if (answerChoice == getCorrectAnswer()) {
            return true;
        } else {
            return false;
        }
    }

}
