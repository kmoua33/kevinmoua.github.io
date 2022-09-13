/**
 * Name: Kevin Moua
 * Date: 03/14/2022
 * Assignment: Unit 8 Case Problem 2
 * 
 * Purpose (Class Description): Represents the multiple choice questions of a quiz
 */
public class MultipleChoiceQuestion {
  private final int INVALID_ANSWER_INDEX = -1;

  private String questionText = "";
  private String[] answerChoices;
  private int correctAnswerIndex;
  private String CorrectAnswerString = "";
  private boolean showAnswers;

  /**
   *  Class constructor to create new multiple choice questions and answers
   *  based on parameters
   * @param questionText
   * @param answerChoices
   * @param correctAnswerIndex
   * @param showAnswers
   */
  public MultipleChoiceQuestion(String questionText, String[] answerChoices, int correctAnswerIndex, Boolean showAnswers)
  {
      setQuestion(questionText);
      setAnswerChoices(answerChoices);
      setCorrectAnswerIndex(correctAnswerIndex);
      setShowAnswers(showAnswers);
  }

  /**
   *  Returns the question for multiple choice 
   * 
   * @return question for quiz
   */
  public String getQuestiontext()
  {
      return this.questionText;
  }

  /**
   *  Sets the question for the quiz given from newQuestion
   * 
   * @param newQuestion the question for each question 
   * @return
   */
  public void setQuestion(String newQuestion)
  {
      this.questionText = newQuestion;
  }

  /**
   *  Returns answers for each question in the form of an array
   * 
   * @return return answers into an array that will correspond to the question
   */
  public String[] getAnswerChoices()
  {
      return this.answerChoices;
  }

  /**
   *  Sets each answer given into an array 
   * 
   * @param newAnswerChoices set for each new answer given
   * @return answer to question
   */
  public void setAnswerChoices(String[] newAnswerChoices)
  {
      this.answerChoices = newAnswerChoices;
  }

  /**
   *  Returns correct answer from array index.
   * 
   * @return correct answer index from user input
   */
  public int getCorrectAnswerIndex()
  {
      return this.correctAnswerIndex;
  }

  /**
   *  Sets correct answer based on user input, if index = invalid answer then set
   *  index to = -1.
   * 
   * @param newAnswerIndex is set to correctAnswerIndex based on value
   * @return correctAnswerIndex 
   */
  public void setCorrectAnswerIndex(int newAnswerIndex)
  {
    if(newAnswerIndex > INVALID_ANSWER_INDEX || newAnswerIndex < answerChoices.length)
    {
        this.correctAnswerIndex = newAnswerIndex;
    }
    else
    {
        this.correctAnswerIndex = INVALID_ANSWER_INDEX;
    }
  }

  /**
   *  Return index as a string based on the index 
   * 
   * @return String of CorrectAnswerIndex
   */
  public String getCorrectAnswerIndexString()
  {

      if(correctAnswerIndex == INVALID_ANSWER_INDEX)
      {
          CorrectAnswerString = "Incorrect";
          return this.CorrectAnswerString;
      }
      else
      {
          CorrectAnswerString = answerChoices[correctAnswerIndex];
          return this.CorrectAnswerString;
      }
  }

  /**
   *  Returns a boolean based on user input
   * 
   * @return the value of showAnswer as true or false
   */
  public boolean getShowAnswer()
  {
      return this.showAnswers;
  }

  /**
   *  Sets a boolean value as true/false to display correct answers for quiz
   * 
   * @param newShowAnswer is set to showAnswers that = true/false
   */
  public void setShowAnswers(boolean newShowAnswer)
  {
    this.showAnswers = newShowAnswer;
  }

}
