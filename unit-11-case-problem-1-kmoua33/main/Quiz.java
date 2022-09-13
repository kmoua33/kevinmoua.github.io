import java.util.ArrayList;

/**
 * Name: Kevin Moua
 * Date: 04/02/2022
 * Assignment: Unit 11 Case Problem 1
 * 
 * Purpose (Class Description): Quiz will be used to create a quiz within an ArrayList
 */

public class Quiz {
  private ArrayList<Question> questions;

  /**
   * Constructor for Quiz that will call the createSampleQuiz();
   */
  public Quiz() {
    createSampleQuiz();
  }

  /**
   * Returns the questions for an ArrayList<Question>
   * 
   * @return questions
   */
  public ArrayList<Question> getQuestions() {
    return questions;
  }

  /**
   * Sets the newQuestions as questions for an ArrayList<Questions>
   * 
   * @param newQuestions
   */
  public void setQuestion(ArrayList<Question> newQuestions) {
    this.questions = newQuestions;
  }

  /**
   * Initialize questions to new ArrayList and create 2 MultipleChoiceQuestion and 2 FillInTheBlankQuestion
   * Answers are added into array as well.
   */
  public void createSampleQuiz()
  {
    questions = new ArrayList<Question>();


    String[] choices = {"true", "false"};

    MultipleChoiceQuestion q1 = new MultipleChoiceQuestion("Is the sky blue? ", 2, choices, 0);
    MultipleChoiceQuestion q2 = new MultipleChoiceQuestion("Does 1 + 1 = 2? ", 2, choices, 0);
    
    String q3Answer = "1";
    FillInTheBlankQuestion q3 = new FillInTheBlankQuestion("What is 1 + _ = 2", 2, q3Answer, false);

    String q4Answer = "NIGHT";
    FillInTheBlankQuestion q4 = new FillInTheBlankQuestion("The opposite of Day is _____", 2, q4Answer, true);

    questions.add(q1);
    questions.add(q2);
    questions.add(q3);
    questions.add(q4);
  }
}
