/*
    Exercise 6 
    Directory: w41/e06
    Objective:
        - Write a program that generates 10 random integers between 1 and 100 and store it to an array (use `Math.random()` for generating the integers). 
        - The user enter their guess as a command line argument. The application tells the user if the guessed number is in the array.
    Expected Output:
                java App 50
                Found!

                java App 42
                Not found!
*/

import java.util.Arrays;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numbers = new int[10];
        for (int i = 0; i<10;i++) {
        numbers [i] = random.nextInt(100) +1;
    }
    int guess = Integer.parseInt(args[0]);
    boolean found = Arrays.stream(numbers).anyMatch(n -> n == guess);
    if (found) {
        System.out.println("Found");
    } else {
        System.out.println("Not found");
    }

}
}