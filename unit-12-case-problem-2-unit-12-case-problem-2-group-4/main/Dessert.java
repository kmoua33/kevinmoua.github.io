/**
 * Name: Kevin Moua
 * Date: 03/24/2022
 * Assignment: Unit 10 Case Problem 2
 * 
 * Purpose (Class Description): Dessert is the child class of MenuItem
 */
public class Dessert extends MenuItem{
  
    /**
     *  Constructor class that uses super to refer to its parent class 
     * 
     * @param name will be passed as a String
     * @param price will be passed as a double
     * @throws NegativePriceException
     */
    public Dessert(String name, double price) throws NegativePriceException
    {
        super(name, price, Items.DESSERT);
    }
}
