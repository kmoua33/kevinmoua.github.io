/**
 * Name: Kevin Moua
 * Date: 04/10/2022
 * Assignment: Week 12 Lab 2
 * 
 * Purpose (Class Description): NegativePriceException is the child class of Exception to catch negative values
 */
public class NegativePriceException extends Exception{
    public NegativePriceException()
    {
        super("Price cannot be negative.");
    }
}
