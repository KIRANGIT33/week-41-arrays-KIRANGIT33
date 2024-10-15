/*
    Exercise 6 
    Directory: w41/e06
    Objective:
        - Write a Java program to read a file (temperatures.txt) containing daily temperature data (in Celsius) into an array.
        - Calculate the average temperature, find the maximum and minimum temperatures-
        - Write the results to an output file (result.txt).
    Expected Output:
                Average Temperature: [average]
                Maximum Temperature: [max]
                Minimum Temperature: [min]
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String inputFileName = "temperatures.txt";
        String outputFileName = "result.txt";

        try {
            // Step 1: Read temperatures from the file
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            String line;
            ArrayList<Double> temperatures = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                try {
                    temperatures.add(Double.parseDouble(line));
                } catch (NumberFormatException e) {
                    System.err.println("Invalid input: " + line);
                }
            }
            reader.close();

            if (temperatures.isEmpty()) {
                System.out.println("No valid temperature data found.");
                return;
            }

            // Step 2: Calculate average, max, and min temperatures
            double sum = 0;
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;

            for (double temp : temperatures) {
                sum += temp;
                if (temp > max) {
                    max = temp;
                }
                if (temp < min) {
                    min = temp;
                }
            }

            double average = sum / temperatures.size();

            // Step 3: Write results to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            writer.write("Average Temperature: " + average + "\n");
            writer.write("Maximum Temperature: " + max + "\n");
            writer.write("Minimum Temperature: " + min + "\n");
            writer.close();

            System.out.println("Results written to " + outputFileName);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

