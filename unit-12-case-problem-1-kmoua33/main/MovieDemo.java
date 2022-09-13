import java.io.ObjectInputStream.GetField;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Name: Kevin Moua
 * Date: 3/10/2022
 * Assignment: Unit 8 Case Problem 1
 * 
 * Purpose (Class Description): Used to create Movie objects based on user input
 * and display
 * the details of the created Movie objects
 */
public class MovieDemo {

  public static void main(String[] args) throws NegativeMovieRuntimeException {
    Scanner input = new Scanner(System.in);

    // Create variable for max movie objects
    final int NUM_MOVIES = 3;
    // Create an array with 3 movie objects
    Movie[] movies = new Movie[NUM_MOVIES];

    for (int x = 0; x < NUM_MOVIES; ++x) {
      System.out.println("Movie #" + (x + 1));
      movies[x] = askForMovie(input);
      System.out.println();
    }

    input.close(); // No longer getting user input, so it can be closed

    // Displays movies
    displayMovies(movies);

  }

  public static Movie askForMovie(Scanner input) throws NegativeMovieRuntimeException {
    String title = askForTitle(input);
    String director = askForDirector(input);
    int ratingIndex = askForRatingIndex(input);
    int releaseYear = askForReleaseYear(input);
    int runtimeInMinutes = askForRuntimeInMinutes(input);

    return new Movie(title, director, ratingIndex, releaseYear, runtimeInMinutes);
  }

  /**
   * Returns the title for a movie that is read from the
   * input
   * 
   * @param input Scanner that is reading console input
   * @return title that is read from the next line of the
   *         input
   */
  public static String askForTitle(Scanner input) {
    System.out.println("Enter the title of the movie: ");
    return input.nextLine();
  }

  /**
   * Returns the director for a movie that is read from the
   * input
   * 
   * @param input Scanner that is reading console input
   * @return name of director that is read from the next line
   *         of the input
   */
  public static String askForDirector(Scanner input) {
    System.out.println("Enter the name of the director of the movie: ");
    return input.nextLine();
  }

  /**
   * Returns the ratingIndex for a movie that is read from the
   * input
   * 
   * @param input Scanner that is reading console input
   * @return ratingIndex that is read from the next line
   *         of the input
   */
  public static int askForRatingIndex(Scanner input) {
    int ratingIndex = 0;
    System.out.println("Please choose from this selection of movie ratings: ");
    for (int x = 0; x < Movie.MOVIE_RATINGS.length; ++x) {
      System.out.println(x + 1 + ". " + Movie.MOVIE_RATINGS[x]);
    }

    while (true) {
      try {
        System.out.print("Selection: ");
        ratingIndex = input.nextInt();
        if (ratingIndex <= 5 && ratingIndex > 0) {
          break;
        } else if (ratingIndex < 0 || ratingIndex > 5) {
          throw (new ArrayIndexOutOfBoundsException());
        } else {
          throw (new InputMismatchException());
        }

      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("You entered " + ratingIndex + ", which is an invalid input try again.");
        input.nextLine(); // Clear the keyboard

      } catch (InputMismatchException e) {
        System.out.println("Please enter a valid number rating.");
        input.nextLine(); // Clear the keyboard

      }
    }
    return ratingIndex;
  }

  /**
   * Returns the release year for a movie that is read from the
   * input. It will continue to repeat until a valid
   * release year is read from the input
   * 
   * @param input Scanner that is reading console input
   * @return release year that is valid from the input
   */
  public static int askForReleaseYear(Scanner input) {
    int releaseYear = Movie.EARLIEST_RELEASE_YEAR - 1;
    while (true) {
      try {
        System.out.println("Enter the release year of the movie: ");
        releaseYear = input.nextInt();
        if (releaseYear >= Movie.EARLIEST_RELEASE_YEAR) {
          break;
        } else {
          throw(new Exception());
        }

      } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Invalid input, please enter a release year between " + Movie.EARLIEST_RELEASE_YEAR + " and above.");
        input.nextLine(); // Clear the keyboard buffer

      }

    }

    return releaseYear;
  }

  /**
   * Returns the runtime in minutes for a movie that is read
   * from the input. It will continue to repeat until a valid
   * runtime in minutes is read from the input
   * 
   * @param input Scanner that is reading console input
   * @return runtime in minutes that is valid from the input
   * @throws NegativeMovieRuntimeException
   */
  public static int askForRuntimeInMinutes(Scanner input) throws NegativeMovieRuntimeException {
    int runtimeInMinutes = Movie.MINIMUM_RUNTIME_IN_MINUTES - 1;

    while (true) {
      try {
        System.out.println("Enter the runtime in minutes of the movie: ");
        runtimeInMinutes = input.nextInt();
        if (runtimeInMinutes >= Movie.MINIMUM_RUNTIME_IN_MINUTES) {
          break;
        } else if (runtimeInMinutes < 0) {
          throw (new NegativeMovieRuntimeException());
        } else {
          throw (new InputMismatchException());
        }
      } catch (NegativeMovieRuntimeException e) {
        System.out.println(e.getMessage());
        input.nextLine(); // Clear the keyboard buffer
      } catch (InputMismatchException e) {
        System.out.println("Please enter a valid movie runtime.");
        input.nextLine();
      }
    }
    return runtimeInMinutes;
  }

  /**
   * Prints the details of the given movie and a blank
   * line after it.
   * 
   * @param aMovie the movie to display the details of
   */
  public static void displayMovie(Movie aMovie) {
    System.out.println(aMovie);
    System.out.println();
  }

  /**
   * Prints the details of each movie in a loop with movie number.
   * 
   * @param movies
   */
  public static void displayMovies(Movie[] movies) {
    for (int x = 0; x < 3; ++x) {
      System.out.println("Movie #" + (x + 1));
      displayMovie(movies[x]);
    }
  }
}
