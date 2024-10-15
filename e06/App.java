
import java.util.Random;

/*
    Exercise 6 
    Directory: w41/e06
    Objective:
        - Write a program that will display a random integer between 0 and 2. 
        - Expand the program to randomly display rock, paper or scissors. 
    Expected Output:
*/

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE  
        Random random = new Random();
        int randomInt = random.nextInt(3);
        String choice = "";
        switch (randomInt) {
            case 0:
            choice = "rock";
            break;
            case 1:
            choice = "paper";
            break;
            case 2:
            choice = "scissors";
            break;

        }
        System.out.println("Random choice: " +choice);
    }
}