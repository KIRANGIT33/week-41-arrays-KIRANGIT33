/*
    Exercise 2
    Directory: w41/e02
    Objective: 
        - Write a program that will create an array with the values 12, 99, 32. 
        - Change the program to display the values(12, 99, 32) of the array in reversed order using a for loop.
    Expected Output:
                32
                99
                19
*/

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE  
        int[] myArray = {12, 99, 32};
        for (int i = myArray.length -1; i>=0;i--) {
            System.out.println(myArray[i]);
        }
    }
}