/**
 * Name: Kevin Moua
 * Date: 04/03/2022
 * Assignment: Unit 11 Case Problem 2
 * 
 * Purpose (Class Description): SalaryEmployee is the child class of Employee and holds information necessary for a salaried employee
 */
public class SalaryEmployee extends Employee {
    private static final double MINIMUM_SALARY = 40000.00; // Class constant of minimum salary
    private double salary;

    /**
     * Constructor for SalaryEmployee with parameters to pass listed below
     * 
     * @param id
     * @param firstName
     * @param lastName
     * @param salary
     */
    public SalaryEmployee(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        setSalary(salary);
    }

    /**
     * Retuns the salary of salaried employee
     * 
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the newSalary to salary for a salaried employee
     * Condition statement checks to see if newSalary is less than class constant
     * If it is less then it will be set = to the class constant
     * 
     * @param newSalary is passed as a double
     */
    public void setSalary(double newSalary) {
        if (newSalary < MINIMUM_SALARY) {
            this.salary = MINIMUM_SALARY;
        } else {
            this.salary = newSalary;
        }
    }

    /**
     * Returns a String of salary pay per year
     */
    @Override
    public String getPayInfo() {
        return ("$" + getSalary() + " per year.");
    }

}
