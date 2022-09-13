import java.util.ArrayList;

/**
 * Name: Kevin Moua
 * Date: 04/03/2022
 * Assignment: Unit 11 Case Problem 2
 * 
 * Purpose (Class Description): Department will set an employee to a department
 */
public class Department {
    private String name;
    private ArrayList<Employee> employees;

    /**
     * Constructor for Department with parameters being passed listed below
     * 
     * @param name
     * @param employees
     */
    public Department(String name, ArrayList<Employee> employees) {
        setName(name);
        setEmployees(employees);
    }

    /**
     * Returns the name of Department
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the newName as name for a Department
     * 
     * @param newName is passed as a String
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Returns the empoloyees of a department
     * @return
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * Sets the employees of a department
     * 
     * @param newEmployees is passed as an ArrayList<Employee>
     */
    public void setEmployees(ArrayList<Employee> newEmployees) {
        this.employees = newEmployees;
    }
}
