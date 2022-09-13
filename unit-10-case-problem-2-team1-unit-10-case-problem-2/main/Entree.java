/**
 * Name: Kevin Moua
 * Date: 03/24/2022
 * Assignment: Unit 10 Case Problem 2
 * 
 * Purpose (Class Description): Entree is the child class of MenuItem
 */
public class Entree extends MenuItem{
  
    /**
     *  Constructor class that uses super to refer to its parent class
     * 
     * @param name will be passed as a String
     * @param price will be passed as a double
     */
    public Entree(String name, double price)
    {
        super(name, price, Items.ENTREE);
    }
}
