/**
 * Name: Kevin Moua
 * Date: 03/24/2022
 * Assignment: Unit 10 Case Problem 2
 * 
 * Purpose (Class Description): This will hold the class constructor of a menu items name, price and type 
 * which is based on the enumerated values: APPETIZER, ENTREE, SIDE, DESSERT.
 */
public class MenuItem {
  public enum Items{
      APPETIZER, ENTREE, SIDE, DESSERT;
  }
  
  private String name; // String variable for menu item name
  private double price; // double variable for menu price
  private Items type; // enum object type

  /**
   *  Constructor method to set the name, price, and type of a menu item
   * 
   * @param name String item will be passed into constructor method
   * @param price double will be passed into constructor method
   * @param type enum object item will be passed into constructor method
   */
  public MenuItem(String name, double price, Items type)
  {
    setName(name);
    setPrice(price);
    setType(type);
  }

  /**
   *  Returns name of menu item
   * 
   * @return String name
   */
  public String getName()
  {
      return name;
  }

  /**
   *  Sets the name for menu item
   * 
   * @param name passed into parameter
   */
  public void setName(String name)
  {
      this.name = name;
  }

  /**
   *  Returns price of a menu item
   * 
   * @return double price
   */
  public double getPrice()
  {
      return price;
  }
  
  /**
   *  Sets the price of a menu item
   *  If price is less than 0, set price to 0
   * 
   * @param price passed as a double into parameter
   */
  public void setPrice(double price)
  {
      if(price < 0)
      {
          this.price = 0;
      }
      else
      {
          this.price = price;
      }
  }

  /**
   *  Returns the enumerated type
   * 
   * @return enum object type
   */
  public Items getType()
  {
      return type;
  }

  /**
   *  Sets the object type
   * 
   * @param type passed as an enum object
   */
  public void setType(Items type)
  {
      this.type = type;
  }

  /**
   *  Override, so that this method is called to execute and return a toString 
   */
  @Override
  public String toString()
  {
      return this.name + " (" + this.type + ")" + " sells for $" + this.price;
  }
}
