import java.util.ArrayList;

/**
 * Name: Kevin Moua
 * Date: 03/16/2022
 * Assignment: ProductList will be used to add/delete product objects.  It will also be able 
 *  to sort an ArrayList based on id, name, cost, and price.
 * 
 * Purpose (Class Description):
 */
public class ProductList {
    private ArrayList<Product> products;

    /**
     *  Constructer method that will call the setInitialInventory
     *  class to create an inventory of products.
     */
    public ProductList() {
        setInitialInventory(); // Call setInitialInventory method
    }

    /**
     *  SetInitialInventory method will create a new Arraylist of Product objects
     *  and add them into the list according to id, name, cost, and price.
     */
    public void setInitialInventory() {
        products = new ArrayList<Product>();

        products.add(new Product("0332", "Chicken", 4.33, 5.94));
        products.add(new Product("0954", "Hamburger", 10.92, 12.78));
        products.add(new Product("0726", "Steak", 16.29, 18.88));
        products.add(new Product("0982", "Banana", 5.59, 6.94));
        products.add(new Product("0163", "Hot Dogs", 4.45, 5.77));

        // Another method to add in products but will not be using.

        // addProduct(new Product("0588", "Bologna", 4.88, 6.20));
        // addProduct(new Product("0965", "Cheese", 3.15, 4.56));
        // addProduct(new Product("0458", "Milk", 5.65, 6.80));
        // addProduct(new Product("0877", "Yogurt", 5.96, 6.85));
        // addProduct(new Product("0623", "Apples", 3.15, 4.56));
    }

    /**
     * This method can be used to create product objects.
     * 
     * @param prod Product object will be passed into addProduct method
     *  
     */
    public void addProduct(Product prod) {
        products.add(prod);
    }

    /**
     * This method will be used to remove product objects.
     * 
     * @param prod Product object will be passed into removeProduct method
     */
    public void removeProduct(Product prod) {
        products.remove(prod);
    }

    /**
     *  The method will sorty products by ID using the bubble sort method.
     *  It will compare products by their ID name and sort them by ascending order.
     *  Variables being used will be the same for this bubble sort method.
     */
    public void sortProductsById() {
        Product temp;  // temp variable to store temporary value
        int highestIndex = products.size() - 1; // highestIndex is set to arraylist size - 1.
        int comparisonsToMake = highestIndex; // comparisonsTomake is set to highestIndex

        for (int a = 0; a < highestIndex; a++) {
            for (int b = 0; b < comparisonsToMake; b++) {
                if (products.get(b).getId().compareTo(products.get(b + 1).getId()) > 0) {
                    temp = products.get(b);
                    products.set(b, products.get(b + 1));
                    products.set(b + 1, temp);
                }
            }
            comparisonsToMake--;

        }
    }

    /**
     *  The method will sorty products by Name using the bubble sort method.
     *  It will compare products by their Name and sort them by ascending order.
     *  Variables being used will be the same for this bubble sort method.
     */
    public void sortProductsByName() {
        Product temp;  // temp variable to store temporary value
        int highestIndex = products.size() - 1; // highestIndex is set to arraylist size - 1.
        int comparisonsToMake = highestIndex; // comparisonsTomake is set to highestIndex

        for (int a = 0; a < highestIndex; a++) {
            for (int b = 0; b < comparisonsToMake; b++) {
                if (products.get(b).getName().compareTo(products.get(b + 1).getName()) > 0) {
                    temp = products.get(b);
                    products.set(b, products.get(b + 1));
                    products.set(b + 1,temp);
                }
            }
            comparisonsToMake--;
        }
    }

    /**
     *  The method will sort products based on the Cost of each product using 
     *  the bubble sort method.  Primitive data types such as double don't have
     *  any methods that can be used to compare.  Instead a wrapper class Double
     *  will be used to compare a double.
     */
    public void sortProductsByCost() {
        Product temp;  // temp variable to store temporary value
        int highestIndex = products.size() - 1; // highestIndex is set to arraylist size - 1.
        int comparisonsToMake = highestIndex; // comparisonsTomake is set to highestIndex

        for (int a = 0; a < highestIndex; a++) {
            for (int b = 0; b < comparisonsToMake; b++) {
                if(Double.compare(products.get(b).getCost(), products.get(b+1).getCost()) > 0) {
                    temp = products.get(b);
                    products.set(b, products.get(b + 1));
                    products.set(b + 1,temp);
                }
            }
            comparisonsToMake--;
        }
    }

        /**
     *  The method will sort products based on the Price of each product using 
     *  the bubble sort method.  Primitive data types such as double don't have
     *  any methods that can be used to compare.  Instead a wrapper class Double
     *  will be used to compare a double.
     */
    public void sortProductsByPrice() {
        Product temp;  // temp variable to store temporary value
        int highestIndex = products.size() - 1; // highestIndex is set to arraylist size - 1.
        int comparisonsToMake = highestIndex; // comparisonsTomake is set to highestIndex

        for (int a = 0; a < highestIndex; a++) {
            for (int b = 0; b < comparisonsToMake; b++) {
                if(Double.compare(products.get(b).getPrice(), products.get(b+1).getPrice()) > 0) {
                    temp = products.get(b);
                    products.set(b, products.get(b + 1));
                    products.set(b + 1,temp);
                }
            }
            comparisonsToMake--;
        }
    }

    /**
     *  The String method will create string representation of products.
     *  For loop will gather information such as id, name, cost, and price.
     * 
     * @return String of product information will be returned when the method is used.
     */
    public String getProductsDisplay() {
        String str = ""; // String variable used to store a string representation of products

        for (int x = 0; x < products.size(); ++x) {
            String ID = products.get(x).getId();
            String Name = products.get(x).getName();
            double Cost = products.get(x).getCost();
            double Price = products.get(x).getPrice();
            str += "Product ID: " + ID + "\tProduct Name: " + Name + "        \tCost: $" + Cost + "\tPrice: $" + Price + "\n";
        }
        return str;
    }
}
