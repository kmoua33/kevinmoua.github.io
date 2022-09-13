/**
 * Name: Kevin Moua
 * Date: 04/03/2022
 * Assignment: Unit 11 Case Problem 2
 * 
 * Purpose (Class Description): Employee is an abstract class that contains a
 * String id, firstName, and lastName
 * It also has one abstract method that will be used for its child classes
 */
public abstract class Employee {
    private String id;
    private String firstName;
    private String lastName;

    /**
     * Constructor for Employee with parameters to pass listed below
     * 
     * @param id
     * @param firstName
     * @param lastName
     */
    public Employee(String id, String firstName, String lastName) {
        setID(id);
        setFirstName(firstName);
        setLastName(lastName);
    }

    /**
     * Returns the id of an Employee
     * 
     * @return String id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of an Employee
     * 
     * @param newID is passed as a String
     */
    public void setID(String newID) {
        this.id = newID;
    }

    /**
     * Returns first name of Employee
     * 
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets newFirstName as firstName of Employee
     * 
     * @param newFirstName is passed as a String
     */
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    /**
     * Returns the lastName of Employee
     * 
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of Employee
     * 
     * @param newLastName is passed as a String
     */
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public abstract String getPayInfo(); // returns a String that provides information about how much the Employee is paid
}
