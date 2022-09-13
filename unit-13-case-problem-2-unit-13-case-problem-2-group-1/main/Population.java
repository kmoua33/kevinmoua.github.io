/**
 * Name: Kevin Moua
 * Date: 04/16/2022
 * Assignment: Week 13 Lab 2
 * 
 * Purpose (class description): This class will hold the data values for a population that will be read from a file
 */
public class Population {

    private String country;
    private int population;
    private String yearlyChange;
    private String netChange;
    private String fertility;
    private String medianAge;
    private String urbanPop;

    /**
     * The constructor class will be used to pass in the variables within the parameter and set to the corresponding variable
     * 
     * @param country
     * @param population
     * @param yearlyChange
     * @param netChange
     * @param fertility
     * @param medianAge
     * @param urbanPop
     */
    public Population(String country, int population, String yearlyChange, String netChange, String fertility, String medianAge, String urbanPop)
    {
        setCountry(country);
        setPopulation(population);
        setYearlyChange(yearlyChange);
        setNetChange(netChange);
        setFertility(fertility);
        setMedianAge(medianAge);
        setUrbanPop(urbanPop);
    }
    
    /**
     * Gets the country for population
     * @return country
     */
    public String getCountry() {
        return country;
    }
    
    /**
     * Sets the country for population
     * @param country passed as a String value
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the population of Population class
     * @return population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Sets the population of the Population class
     * @param population passed as an int value
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * Gets the yearly change of population
     * @return yearlyChange
     */
    public String getYearlyChange() {
        return yearlyChange;
    }

    /**
     * Sets the yearly change of population
     * @param yearlyChange passed as a String value
     */
    public void setYearlyChange(String yearlyChange) {
        this.yearlyChange = yearlyChange;
    }

    /**
     * gets the net change of population
     * @return netChange
     */
    public String getNetChange() {
        return netChange;
    }

    /**
     * Sets the net change of population
     * @param netChange passed as a String value
     */
    public void setNetChange(String netChange) {
        this.netChange = netChange;
    }

    /**
     * Gets the fertility of population
     * @return fertility
     */
    public String getFertility() {
        return fertility;
    }

    /**
     * Sets the fertiility of population
     * @param fertility passed as a String value
     */
    public void setFertility(String fertility) {
        this.fertility = fertility;
    }

    /**
     * Gets the median age of population
     * @return medianAge
     */
    public String getMedianAge() {
        return medianAge;
    }
    
    /**
     * Sets the median age of population
     * @param medianAge passed as a String value
     */
    public void setMedianAge(String medianAge) {
        this.medianAge = medianAge;
    }

    /**
     * Gets the urban population of Population class
     * @return urbanPop
     */
    public String getUrbanPop() {
        return urbanPop;
    }

    /**
     * Sets the urban population of Population class
     * @param urbanPop is passed as a String value
     */
    public void setUrbanPop(String urbanPop) {
        this.urbanPop = urbanPop;
    }
   
    /**
     * toString method to display Population info with override method for the class
     */
    @Override
    public String toString() {
        return "Country: " + country + "\tPopulation: " + population + "\tYearly Change: " + yearlyChange + 
        "\tNet Change: " + netChange + "Fertility: " + fertility + "\tMedian Age: " + medianAge 
        + "\tUrban Population: " + urbanPop;
    }

}