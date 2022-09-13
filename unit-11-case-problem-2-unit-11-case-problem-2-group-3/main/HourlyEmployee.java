/**
 * Name: Kevin Moua
 * Date: 04/03/2022
 * Assignment: Unit 11 Case Problem 2
 * 
 * Purpose (Class Description): HourlyEmployee is the child class of Employee and holds information necessary for a hourly employee
 */
public class HourlyEmployee extends Employee {
    private static final double MINIMUM_HOURLY_PAY = 10.00; // Class constant for min pay of hourly employee
    private double hourlyPay;

    /**
     * Constructor for HourlyEmployee with parameters being passed listed below
     * 
     * @param id
     * @param firstName
     * @param lastName
     * @param hourlyPay
     */
    public HourlyEmployee(String id, String firstName, String lastName, double hourlyPay) {
        super(id, firstName, lastName);
        setHourlyPay(hourlyPay);
    }

    /**
     * Returns the hourly pay of an hourly employee
     * 
     * @return hourlyPay
     */
    public double getHourlyPay() {
        return hourlyPay;
    }

    /**
     * Sets newHourlyPay as hourlyPay of an hourly employee
     * Condition statement to set hourlyPay to class constant if it is less
     * than the class constant
     * 
     * @param newHourlyPay is passed as a double
     */
    public void setHourlyPay(double newHourlyPay) {

        if (newHourlyPay < MINIMUM_HOURLY_PAY) {
            this.hourlyPay = MINIMUM_HOURLY_PAY;
        } else {
            this.hourlyPay = newHourlyPay;
        }
    }

    /**
     * Returns a String with hourly pay per hour
     */
    @Override
    public String getPayInfo() {
        return ("$" + getHourlyPay() + " per hour.");
    }

}
