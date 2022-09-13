
/**
 * Name: Kevin Moua
 * Date: 04/16/2022
 * Assignment: Week 13 Lab 2
 * 
 * Purpose (class description): Creates an ArrayList of Population that will be held as an object
 */
import java.util.ArrayList;

public class PopulationByCountry {

    private ArrayList<Population> population;

    /**
     * Constructor class for ArrayList<Population> that will set its values
     * @param population
     */
    public PopulationByCountry(ArrayList<Population> population) {
        setPopulation(population);

    }

    /**
     * Gets the population object within an ArrayList
     * @return population
     */
    public ArrayList<Population> getPopulation() {
        return population;
    }

    /**
     * Sets the population object of an ArrayList
     * @param population is passed as an ArrayList object
     */
    public void setPopulation(ArrayList<Population> population) {
        this.population = population;
    }

    /**
     * toString method to display information with an override for the class
     */
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < population.size(); i++) {
            result += "Country: " + population.get(i).getCountry();
            result += "\n\t(" + (i + 1) + ") " + population.get(i);
        }
        return result;
    }
}
