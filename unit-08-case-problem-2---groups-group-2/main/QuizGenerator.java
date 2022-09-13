/**
 * Name: Kevin Moua
 * Date: 03/14/2022
 * Assignment: Unit 8 Case Problem 2 Group 2
 * 
 * Purpose (Class Description): Represents the main class that will create the contents of a quiz
 */
import java.util.Scanner;
public class QuizGenerator {
  
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Multiple objects created from MultipleChoiceQuestions
        MultipleChoiceQuestion[] quiz = new MultipleChoiceQuestion[5];

        // Loop that prompts for user input for each question
        for(int i = 0; i < quiz.length; ++i)
        {
            System.out.println();
            System.out.println("Submit a question entry for mutliple choice quiz.");
            System.out.print("Question " + (i +1) + ". ");
            quiz[i] = createQuestions(input);
        }

        displayQuiz(quiz); // Displays elements within quiz.
        input.close();  // No longer getting user input, closing scanner.

    }

    /**
     *  Holds the main methods used to create multiple choice questions.
     * 
     * @param input is passed as parameter into MultipleChoiceQuestion method.
     * @return  the new MultipleChoiceQuestions and paramaters listed.
     */
    public static MultipleChoiceQuestion createQuestions(Scanner input)
    {
        String questionText = askQuestion(input);
        String[] answerChoices = askAnswers(input);
        int correctAnswerIndex = askCorrectAnswerIndex(input, answerChoices, questionText);
        boolean showAnswers = askToShowAnswers(input);

        return new MultipleChoiceQuestion(questionText, answerChoices, correctAnswerIndex, showAnswers);
    }

    /**
     *  Prompts user to input a question and sets it to correct instance.
     * 
     * @param input Gathers user input for a question.
     * @return input and stores it into questionText.
     */
    public static String askQuestion(Scanner input)
    {
        return input.nextLine();
    }

    /**
     *  Size of the array is determined based on user input and will be populated
     *  depending on the size of the array.  Method will prompt user until correct
     *  input is entered.
     * 
     * @param input size of answer array is made here.
     * @return the size and initialize it to how large/small answers.
     */
    public static int askForTotalAnswers(Scanner input)
    {
        int totalNumAnswers; // Variable that will be used to get size of array.
        System.out.println();
        System.out.print("How many answers will there be on the question? ");

        while(true)
        {
            totalNumAnswers = input.nextInt();
            input.nextLine();  // Clear keyboard

            if(totalNumAnswers >= 2 && totalNumAnswers <= 4)
            {
                break;
            }
            else
            {
                System.out.println(totalNumAnswers + " is invalid selection.  Please choose from 2-4 answers total.");
            }
        }
        return totalNumAnswers;
        
    }

    /**
     *  Returns an answer based on the size of array and is stored in a 
     *  temporary array.  All the contents within the temp array will be 
     *  passed to the corresponding question.
     * 
     * @param input gathers each answer
     * @return  answers and stores them into answerChoices array
     */
    public static String[] askAnswers(Scanner input)
    {
        int totalAnswer = askForTotalAnswers(input);
        String[] answerChoices = new String[totalAnswer];

        System.out.println("Submit answers below.");
        for(int i = 0; i < answerChoices.length; ++i)
        {
            System.out.print("Answer " + (i + 1) + ". ");
            answerChoices[i] = input.nextLine();
        }
        return answerChoices;
    }

    /**
     *  This method is going to display answers within the array
     * 
     * @param answers are based on answers
     */
    public static void displayAnswerArray(String[] answers)
    {
        for(int i = 0; i < answers.length; ++i)
        {
            System.out.print((i + 1) + ". " + answers[i]);
            System.out.print("  \t  ");

        }
    }

    /**
     *  The contents of the multiple choice questions will be displayed, along
     *  with prompting user to submit an entry that corresponds with the correct
     *  answer.  The user must enter a valid entry for the program to continue.
     * 
     * @param input will take in user input 
     * @param answerChoices used to display each answer
     * @param questionText used to display question
     * @return corresponding index user inputs
     */
    public static int askCorrectAnswerIndex(Scanner input, String[] answerChoices, String questionText)
    {
        int correctAnswerIndex;
        System.out.println();
        System.out.println("********************************");
        System.out.println("*Multiple Choice Quiz Questions*");
        System.out.println("********************************");
        System.out.println();
        System.out.println("Question: " + questionText);
        System.out.print("Answers: ");

        while(true){
            displayAnswerArray(answerChoices);
            System.out.println();
            System.out.println();
            System.out.println("Choose the correct answer corresponding to the question.");
            System.out.print("Correct answer: ");
            correctAnswerIndex = input.nextInt();
            input.nextLine();
            if(correctAnswerIndex > 0 && correctAnswerIndex <= answerChoices.length)
            {
                break;
            }
            else
            {
                System.out.println("Your input of " + correctAnswerIndex + " isn't valid.");
                System.out.print("Select from: ");   
            }

        }
        System.out.println();
        return --correctAnswerIndex;
    }

    /**
     *  A boolean method that will ask user for a valid entry and returns 
     *  true or false.
     * 
     * @param input a string word that corresponds to correct input
     * @return a boolean value
     */
    public static boolean askToShowAnswers(Scanner input)
    {
        String userInput = "";
        System.out.println("Enter yes or no, to see the correct answers to the quiz.");
        System.out.print("What is your choice? ");
        while(true)
        {
            userInput = input.nextLine();
            if(userInput.equals("yes") || userInput.equals("no"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid entry.  Please type yes or no, if you'd like to see the correct answers.");
                System.out.print("What is your choice? ");
            }
        }

        if(userInput.equals("yes"))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    /**
     *  The function will display the contents of each multiple choice questions element
     *  along with the answers and correct answer based on a boolean value.
     * 
     * @param quiz object array for multiplechoice quiz is used as a parameter.
     */
    public static void displayQuiz(MultipleChoiceQuestion[] quiz)
    {
        System.out.println();
        System.out.println("******************************");
        System.out.println("*Multiple Choice Quiz Summary*");
        System.out.println("******************************");

        for(int i = 0; i < quiz.length; ++i)
        {
            int correctIndex = quiz[i].getCorrectAnswerIndex();
            String correctAnswerString = quiz[i].getCorrectAnswerIndexString();
            Boolean showAnswer = quiz[i].getShowAnswer();

            System.out.println("Question # -  " + (i + 1) + ". " + quiz[i].getQuestiontext());
            String[] answers = quiz[i].getAnswerChoices();
            System.out.print("Answers # - ");
            displayAnswerArray(answers);
            System.out.println();

            if(showAnswer == true)
            {   
                System.out.print("Correct answer:  " + (correctIndex + 1) + ": " + correctAnswerString + "\n");
                System.out.println();
            }
        }
        
    }

}

