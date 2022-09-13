/**
 * Name: Kevin Moua
 * Date: 04/10/2022
 * Assignment: Week 12 Lab 1
 * 
 * Purpose (class description): NegativeMovieRuntimeException is the child class of Exception 
 */
public class NegativeMovieRuntimeException extends Exception{
  public NegativeMovieRuntimeException()
  {
      super("Movie runtime cannot be negative.");
  }
}
