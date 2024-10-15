/*
    Exercise 5
    Directory: w41/e05
    Objective:
        - Write a program that asks the user how many names to enter
        - Next ask the user to enter the names 
        - Store the names in an array
        - Sort through the array and display the longest name entered to the user.
    Expected Output:
                How many names to enter: 3
                Enter name: John
                Enter name: Sam
                Enter name: Elizabeth
                Longest name entered was Elizabeth 
*/

import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("How many names to enter: ");
        int numNames = scanner.nextInt();
        String[] names = new String[numNames];
        for (int i=0; i< numNames; i++) {
            System.out.println("Enter names: ");
            names[i] = scanner.next();
        }
        Arrays.sort(names, (a, b) -> b.length() - a.length());
        System.out.println("Longest name entered was " + names[0]);

        
    }
}