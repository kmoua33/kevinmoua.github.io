import java.util.*;

/**
 * Name: James Sekcienski
 * Date: 11/7/21
 * Assignment: Unit 10 Case Problem 2
 * 
 * Purpose (Class Description): Allows the user to place an order consisting of
 * an appetizer,
 * entree, two sides, and dessert.
 */
public class MenuDemo {
  public static void main(String[] args) throws NegativePriceException {
    // Creates the available menu items
    Appetizer[] appetizers = createAppetizers();
    Entree[] entrees = createEntrees();
    Side[] sides = createSides();
    Dessert[] desserts = createDesserts();

    System.out.println("Welcome to the Food Lovers Restaurant.");
    System.out.println("Our meals include one appetizer, one entree, two sides, and one dessert.");

    Scanner input = new Scanner(System.in);
    MenuItem[] mealItems = askForMealItems(input, appetizers, entrees, sides, desserts);
    input.close();

    System.out.println("You have ordered the following: ");
    displayMenuItems(mealItems);
  }

  /**
   * Creates array of appetizers and returns them
   * 
   * @return Array of appetizers
   * @throws NegativePriceException catches negative price exception
   */
  public static Appetizer[] createAppetizers() {
    Appetizer[] appetizers = new Appetizer[3];

    Scanner scanner = new Scanner(System.in);
    System.out.println("Update Prices for Appetizers? Yes / No");

    String choice = scanner.nextLine();

    try {
      appetizers[0] = new Appetizer("Orange-Glazed Meatballs", 10.99);
      appetizers[1] = new Appetizer("Chicken Parmesan Slider Bake", 12.97);
      appetizers[2] = new Appetizer("Ham 'n' Cheese Biscuit Stacks", 7.55);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    if (choice.toLowerCase().equals("yes")) {
      Double price = 0.0;
      int i = 0;
      while (i != appetizers.length) {
        Scanner input = new Scanner(System.in);
        try {
          System.out.println("What is the Price of " + appetizers[i].getName());
          price = input.nextDouble();

          if (price < 0) {
            throw (new NegativePriceException());
          } else if (price > 0) {
            appetizers[i].setPrice(price);
            i++;
          } else {
            throw (new InputMismatchException());
          }
        } catch (NegativePriceException e) {
          System.out.println(e.getMessage());
          input.nextLine();
        } catch (InputMismatchException e) {
          System.out.println("Invalid character was detected, try again");
          input.nextLine();
        }
      }
    }

    return appetizers;
  }

  /**
   * Creates array of entrees and returns them
   * 
   * @return Array of entrees
   * @throws NegativePriceException catches negative price exception
   */
  public static Entree[] createEntrees() throws NegativePriceException {
    Entree[] entrees = new Entree[4];

    Scanner scanner = new Scanner(System.in);
    System.out.println("Update Prices for Entrees? Yes / No");

    String choice = scanner.nextLine();

    try {
      entrees[0] = new Entree("Chicken and Spinach Dumplings", 8.56);
      entrees[1] = new Entree("Grilled Seafood Platter", 15.97);
      entrees[2] = new Entree("Heirloom Tomato Tarte Fine", 7.92);
      entrees[3] = new Entree("Spring Rolls", 5.55);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    if (choice.toLowerCase().equals("yes")) {
      Double price = 0.0;
      int i = 0;

      while (i != entrees.length) {
        Scanner input = new Scanner(System.in);
        try {
          System.out.println("What is the Price of " + entrees[i].getName());
          price = input.nextDouble();

          if (price < 0) {
            throw (new NegativePriceException());
          } else if (price > 0) {
            entrees[i].setPrice(price);
            i++;
          } else {
            throw (new InputMismatchException());
          }
        } catch (NegativePriceException e) {
          System.out.println(e.getMessage());
          input.nextLine();
        } catch (InputMismatchException e) {
          System.out.println("Invalid character was detected, try again");
          input.nextLine();
        }
      }
    }

    return entrees;
  }

  /**
   * Creates array of sides and returns them
   * 
   * @return Array of sides
   * @throws NegativePriceException catches negative price exception
   */
  public static Side[] createSides() throws NegativePriceException {
    Side[] sides = new Side[4];

    Scanner scanner = new Scanner(System.in);
    System.out.println("Update Prices for Sides? Yes / No");

    String choice = scanner.nextLine();

    try {
      sides[0] = new Side("Baked Mac and Cheese", 5.77);
      sides[1] = new Side("Fresh Fruit Salad", 6.12);
      sides[2] = new Side("Mixed Green Salad with Berries", 6.39);
      sides[3] = new Side("Cheesey Breadsticks", 4.97);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    if (choice.toLowerCase().equals("yes")) {
      Double price = 0.0;
      int i = 0;

      while (i != sides.length) {
        Scanner input = new Scanner(System.in);
        try {
          System.out.println("What is the Price of " + sides[i].getName());
          price = input.nextDouble();

          if (price < 0) {
            throw (new NegativePriceException());
          } else if (price > 0) {
            sides[i].setPrice(price);
            i++;
          } else {
            throw (new InputMismatchException());
          }
        } catch (NegativePriceException e) {
          System.out.println(e.getMessage());
          input.nextLine();
        } catch (InputMismatchException e) {
          System.out.println("Invalid character was detected, try again");
          input.nextLine();
        }
      }
    }

    return sides;
  }

  /**
   * Creates array of desserts and returns them
   * 
   * @return Array of desserts
   * @throws NegativePriceException catches negative price exception
   */
  public static Dessert[] createDesserts() throws NegativePriceException {
    Dessert[] desserts = new Dessert[3];

    Scanner scanner = new Scanner(System.in);
    System.out.println("Update Prices for Desserts? Yes / No");

    String choice = scanner.nextLine();

    try {
      desserts[0] = new Dessert("Chocolate Ice Cream", 3.77);
      desserts[1] = new Dessert("Strawberry Ice Cream", 3.77);
      desserts[2] = new Dessert("Cake", 5.34);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    if (choice.toLowerCase().equals("yes")) {
      Double price = 0.0;
      int i = 0;

      while (i != desserts.length) {
        Scanner input = new Scanner(System.in);
        try {
          System.out.println("What is the Price of " + desserts[i].getName());
          price = input.nextDouble();

          if (price < 0) {
            throw (new NegativePriceException());
          } else if (price > 0) {
            desserts[i].setPrice(price);
            i++;
          } else {
            throw (new InputMismatchException());
          }
        } catch (NegativePriceException e) {
          System.out.println(e.getMessage());
          input.nextLine();
        } catch (InputMismatchException e) {
          System.out.println("Invalid character was detected, try again");
          input.nextLine();
        }
      }
    }

    return desserts;
  }

  /**
   * Asks user for the menu items they would like to order for their meal
   * 
   * @param input      The Scanner to get console input
   * @param appetizers Array of available appetizers
   * @param entrees    Array of available entrees
   * @param sides      Array of available sides
   * @param desserts   Array of available desserts
   * @return Array of menu items that were selected for the meal
   */
  public static MenuItem[] askForMealItems(Scanner input, Appetizer[] appetizers, Entree[] entrees,
      Side[] sides, Dessert[] desserts) {
    MenuItem[] mealItems = new MenuItem[5];

    System.out.println("Appetizer");
    mealItems[0] = askForMenuItemSelection(input, appetizers);

    System.out.println("Entree");
    mealItems[1] = askForMenuItemSelection(input, entrees);

    System.out.println("Side 1");
    mealItems[2] = askForMenuItemSelection(input, sides);

    System.out.println("Side 2");
    mealItems[3] = askForMenuItemSelection(input, sides);

    System.out.println("Dessert");
    mealItems[4] = askForMenuItemSelection(input, desserts);

    return mealItems;
  }

  /**
   * Displays the menu choices and gets user input to return menu choice
   * 
   * @param input     The Scanner to get console input
   * @param menuItems The Array of MenuItems to select from
   * @return
   */
  public static MenuItem askForMenuItemSelection(Scanner input, MenuItem[] menuItems) {
    int answer;

    while (true) {
      try {
        int counter = 1;
        System.out.println("****************************************************************");
        for (int i = 0; i < menuItems.length; i++) {
          System.out.println(counter++ + ". " + menuItems[i].getName() + " sells for " + String.format("%.2f", menuItems[i].getPrice()));
        }
        System.out.println("****************************************************************");
        System.out.print("Select from choices: ");
        answer = input.nextInt();
        if (answer > 0 && answer <= menuItems.length) {
          break;
        } else if (answer < 0 || answer > menuItems.length) {
          throw (new ArrayIndexOutOfBoundsException());
        } else {
          throw (new InputMismatchException());
        }

      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Incorrect choice. Try again.");
        input.nextLine();
      } catch (InputMismatchException e) {
        System.out.println("Invalid entry. Please try again.");
        input.nextLine();
      }

    }

    return menuItems[answer - 1];
  }

  /**
   * Takes in an array of menu items and prints them out.
   * 
   * @param menuItems The array of menu items to display
   */
  public static void displayMenuItems(MenuItem[] menuItems) {
    for (MenuItem menuItem : menuItems) {
      System.out.println(menuItem);
    }
  }
}
