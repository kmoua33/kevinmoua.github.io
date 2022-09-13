import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;


/**
 * Name: Kevin Moua
 * Date: 04/16/2022
 * Assignment: Week 13 Lab 2
 * 
 * Purpose (class description): This class will be the main method that will open and read a file.  
 * The file will then print out all the necessary information.  If not then an exception or null will be
 * thrown.
 */
public class PopulationByCountryDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = askForFilePath(input);
        System.out.print("Attempting to open file.");
        ArrayList<Population> pop = openDataFile(path);
        displayData(pop);
    }

    /**
     * askForFilePath will ask for user input that will be used to create 
     * a fileName and made into a csv fileName that will be returned.
     * @param input will get user input to use as a fileName
     * @return fileName 
     */
    public static String askForFilePath(Scanner input) {
        String fileName = "";
        System.out.println("Enter file name: ");
        fileName = input.nextLine() + ".csv";

        return fileName;
    }

    /**
     * openDataFile will attempt to open the fileName that is passed in as a String value.
     * The method will set the variables accordingly and use a try_catch to read the information
     * from the csv file.  This method will return a list of objects if successfuly created.
     * @param path
     * @return
     */
    public static ArrayList<Population> openDataFile(String path) {
        String[] info;
        ArrayList<Population> populations = new ArrayList<Population>();
        String fileName = path;
        Path file = Paths.get(fileName);
        String delimiter = ",";
        String s = "";

        String country;
        int population;
        String yearlyChange;
        String netChange;
        String fertility;
        String medianAge;
        String urbanPop;

        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            System.out.println();
            int k = 0;
            while ((s = reader.readLine()) != null) {
                if (k == 0) {
                    k++;
                    continue;
                }
                info = s.split(delimiter);
                country = info[0];
                population = Integer.parseInt(info[1]);
                yearlyChange = info[2];
                netChange = info[3];
                fertility = info[7];
                medianAge = info[8];
                urbanPop = info[9];
                Population pop = new Population(country, population, yearlyChange, netChange, fertility, medianAge, urbanPop);
                populations.add(pop);
            }
            System.out.println("Data file successfully opened.");
            reader.close();
        } catch (Exception e) {
            System.out.println("Error message: " + e);
        }
        return populations;
    }

    /**
     * displayData method will print out the list of objects created
     * @param population is passed in as an ArrayList of population objects
     */
    public static void displayData(ArrayList<Population> population) {
        for (int i = 0; i < population.size(); i++) {
            System.out.println(population.get(i).toString());
        }
    }

}
