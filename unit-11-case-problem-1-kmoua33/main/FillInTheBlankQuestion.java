/**
 * Name: Kevin Moua
 * Date: 04/02/2022
 * Assignment: Unit 11 Case Problem 2
 * 
 * Purpose (Class Description): FillInTheBlackQuestion is the child class of
 * Question and uses a String to get correct answer and boolean for a case
 * sensitive answer
 */
public class FillInTheBlankQuestion extends Question {
    private String correctAnswer;
    private boolean isAnswerCaseSensitive;

    /***
     * Constructor for FillInTheBlankQuestion with parameters passed listed below
     * 
     * @param prompt
     * @param numOfPoints
     * @param answerChoices
     * @param isAnswerCaseSensitive
     */
    public FillInTheBlankQuestion(String prompt, int numOfPoints, String correctAnswer, boolean isAnswerCaseSensitive) {
        super(prompt, numOfPoints);
        setCorrectAnswer(correctAnswer);
        setIsAnswerCaseSensitive(isAnswerCaseSensitive);
    }

    /**
     * Returns a string of correct answer
     */
    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * Sets newCorrectAnswer as correct answer
     * 
     * @param newCorrectAnswer
     */
    public void setCorrectAnswer(String newCorrectAnswer) {
        this.correctAnswer = newCorrectAnswer;
    }

    /**
     * Returns true/false if case answer is senstivie
     * 
     * @return isAnswerCaseSensitive
     */
    public boolean getIsAnswerCaseSensitive() {
        return isAnswerCaseSensitive;
    }

    /**
     * Sets newIsAnswerCaseSenitive as true or false
     * 
     * @param newIsAnswerCaseSensitive
     */
    public void setIsAnswerCaseSensitive(boolean newIsAnswerCaseSensitive) {
        this.isAnswerCaseSensitive = newIsAnswerCaseSensitive;
    }

    /**
     * Uses abstract method from parent class to return String representing the
     * question as it would be displayed in a quiz
     */
    @Override
    public String getQuestionDisplay() {
        return getPrompt();
    }

    /**
     * Uses abstract method from parent class with a condition statement to check
     * for case sensitivity and returns
     * whether or not the value of the parameter is equal to the correct answer
     * exactly. If it is not case sensitive,
     * return whether or not the value of the parameter is equal to the correct
     * answer when ignoring case
     */
    @Override
    public boolean isCorrectAnswer(String answerChoice) {
        if (getIsAnswerCaseSensitive() == true) {
            if (answerChoice.toLowerCase().equals(getCorrectAnswer().toLowerCase())) {
                return true;
            } else {
                return false;
            }
        } else {
            if (answerChoice.equals(getCorrectAnswer())) {
                return true;
            } else {
                return false;
            }
        }

    }

}
