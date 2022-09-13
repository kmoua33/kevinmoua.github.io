import java.util.ArrayList;
import java.util.Scanner;

/**
 * Name: Kevin Moua
 * Date: 04/03/2022
 * Assignment: Unit 11 Case Problem 2
 * 
 * Purpose (Class Description): Asks user for department name and employee information and will display all the information.
 */
public class DepartmentDemo {
  public static void main(String[] args) {
    ArrayList<Employee> emps = new ArrayList<Employee>();

    Scanner input = new Scanner(System.in);
    
    // Ask for department name
    System.out.println("Name for Department");
    String deptName = input.nextLine();

    // String and Double variables
    String empID, firstName, lastName, typeOfEmp;
    Double pay;

    // Ask for total employees
    System.out.println("How many employees");
    int empNum = input.nextInt();
    input.nextLine();

    // For loop based on total employees that will ask for employee information
    for(int i = 0; i < empNum; i++)
    {
      System.out.println("What is Employee ID?");
      empID = input.nextLine();
      System.out.println("What is First Name?");
      firstName = input.nextLine();
      System.out.println("What is Last Name?");
      lastName = input.nextLine();
      System.out.println("Is Employee Salary or Hourly?");
      typeOfEmp = input.nextLine();
      
      // Condition to check for salary or hourly employee
      if (typeOfEmp.toLowerCase().equals("salary"))
      {
        System.out.println("What is a Relevant Pay?");
        pay = input.nextDouble();
        input.nextLine();
        SalaryEmployee salEmp = new SalaryEmployee(empID, firstName, lastName, pay);
        emps.add(salEmp);
      }
      else if (typeOfEmp.toLowerCase().equals("hourly"))
      {
        System.out.println("What is a Relevant Pay?");
        pay = input.nextDouble();
        input.nextLine();
        HourlyEmployee hourEmp = new HourlyEmployee(empID, firstName, lastName, pay);
        emps.add(hourEmp);
      }   
    }

    // Create employee department with the department name and employees
    Department empDepartment = new Department(deptName,emps);

    // Print out Department and employee information
    System.out.println(empDepartment.getName());
    for (int i = 0; i < emps.size(); i++)
    {
      System.out.println("Department Name: " + deptName);
      System.out.println("Emp ID: " + emps.get(i).getId());
      System.out.println("First Name: " + emps.get(i).getFirstName());
      System.out.println("Last Name: " + emps.get(i).getLastName());
      System.out.println("Pay Info: " + emps.get(i).getPayInfo());
      System.out.println();
    }
    
    input.close();
  }
}
