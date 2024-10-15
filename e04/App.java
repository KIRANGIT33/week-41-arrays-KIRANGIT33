/*
    Exercise 4
    Directory: w41/e04
    Objective:
        - Write a program that asks the user to enter 10 integers and store it in an array. 
        - Calculate the sum of the values entered in a separate loop and finally display the sum and average of the values.
    Expected Output:
                Enter a number: 5
                Enter a number: 7
                Sum: 12
                Average: 6 
*/
import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE 
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i =0; i<10; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int number : numbers) {
            sum +=number;
        }
        double average = (double) sum/numbers.length;
        System.out.println("Sum: "+sum);
        System.out.println("Average: " + average);

    }
}