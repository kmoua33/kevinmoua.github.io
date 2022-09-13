/**
 * Name: Kevin Moua
 * Date: 3/10/2022
 * Assignment: Unit 8 Case Problem 1
 * 
 * Purpose (Class Description): Represent information about a Movie
 */
public class Movie {
  public static final int EARLIEST_RELEASE_YEAR = 1895;
  public static final int MINIMUM_RUNTIME_IN_MINUTES = 1;
  public static final String[] MOVIE_RATINGS = {"G", "PG-13", "R", "NC-13", "Not Rated" };

  private String title;
  private String director;
  private String movieRating;
  private int ratingIndex;
  private int releaseYear;
  private int runtimeInMinutes;
  

  /**
   * Parameterized constructor to create a new Movie based on the following
   * parameters
   * 
   * @param title
   * @param director
   * @param ratingIndex
   * @param mmovieRating
   * @param releaseYear
   * @param runtimeInMinutes
   * @throws NegativeMovieRuntimeException
   */
  public Movie(String title, String director, int ratingIndex, int releaseYear, int runtimeInMinutes) throws NegativeMovieRuntimeException, ArrayIndexOutOfBoundsException {
    setTitle(title);
    setDirector(director);
    setRatingIndex(ratingIndex);
    setReleaseYear(releaseYear);
    setRuntimeInMinutes(runtimeInMinutes);
  }

  /**
   * Returns the title of this movie
   * 
   * @return title of this movie
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Sets the title of this movie to the given
   * newTitle
   * 
   * @param newTitle the title to set for this movie
   */
  public void setTitle(String newTitle) {
    this.title = newTitle;
  }

  /**
   * Returns the director of this movie
   * 
   * @return director of this movie
   */
  public String getDirector() {
    return this.director;
  }

  /**
   * Sets the director of this movie to the given
   * newDirector
   * 
   * @param newDirector the director to set for this movie
   */
  public void setDirector(String newDirector) {
    this.director = newDirector;
  }

  /**
   * Returns the ratingIndex of this movie
   * 
   * @return ratingIndex of this movie
   */
  public int getRatingIndex() {
    return this.ratingIndex;
  }

  /**
   * Sets the ratingIndex of this movie to the given
   * newRatingIndex
   * 
   * @param newRatingIndex the director to set for this movie
   */
  public void setRatingIndex(int newratingIndex) throws ArrayIndexOutOfBoundsException{
    
    if(newratingIndex < 1 || newratingIndex > 5)
    {
      throw(new ArrayIndexOutOfBoundsException());
    }
    else
    {
      this.ratingIndex = newratingIndex;
    }
  }

    /**
   * Returns the movie rating of this movie
   * 
   * @return movie rating of this movie
   */
  public String getRatingAsString()
  {
    // movieRating = MOVIE_RATINGS[--ratingIndex];
    return this.movieRating;
  }

  /**
   * Returns the release year of this movie
   * 
   * @return releaseYear of this movie
   */
  public int getReleaseYear() {
    return this.releaseYear;
  }

  /**
   * Sets the release year of this movie. If the given
   * release year is too early, then it sets it to
   * EARLIEST_RELEASE_YEAR. Otherwise, it sets it to the
   * given release year
   * 
   * @param newReleaseYear the release year to try to set
   *                       for this movie
   */
  public void setReleaseYear(int newReleaseYear) throws NegativeMovieRuntimeException{
    final int EARLIEST_RELEASE_YEAR = 1895;
    if (newReleaseYear < EARLIEST_RELEASE_YEAR) {
      throw(new NegativeMovieRuntimeException());
    } else {
      this.releaseYear = newReleaseYear;
    }
  }

  /**
   * Returns the runtime in minutes of this movie
   * 
   * @return runtimeInMinutes of this movie
   */
  public int getRuntimeInMinutes() {
    return this.runtimeInMinutes;
  }

  /**
   * Sets the runtime in minutes of this movie. If the given
   * runtime is too low, then it sets it to MINIMUM_RUNTIME_IN_MINUTES.
   * Otherwise, it sets it to the given runtime.
   * 
   * @param newRuntimeInMinutes the runtime in minutes to try to
   *                            set for this movie
   */
  public void setRuntimeInMinutes(int newRuntimeInMinutes) throws NegativeMovieRuntimeException{
    if (newRuntimeInMinutes < 0) {
      throw(new NegativeMovieRuntimeException());
    } else {
      this.runtimeInMinutes = newRuntimeInMinutes;
    }
  }

  /**
   * Overrides the toString method to return a string with
   * the details about this movie.
   * 
   * @return string that includes the current values of
   *         key instance variables of this movie.
   */
  @Override
  public String toString() {
    String movieDetails = "Title: " + getTitle() +
        "\nDirector: " + getDirector() +
        "\nRating: " + getRatingAsString() +
        "\nReleased: " + getReleaseYear() +
        "\nRuntime (minutes): " + getRuntimeInMinutes();

    return movieDetails;
  }
}
