/*
    Exercise 3
    Directory: w41/e03
    Objective:
        - Write a program that uses a String array to store 5 names. 
        - Use the names Julianne, Brandon, Cesar, Johnathan, Carmen and Ariel. 
        - Use a for loop to display only every second name.
    Expected Output:
                Brandon 
                Johnathan
                Ariel
*/

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE  
       String [] names = {"Julianne", "Brandon", "Cesar", "Johnathan", "Carmen", "Ariel"};
       for (int i=1; i < names.length; i +=2) {
        System.out.println(names[i]);
       }

    }
}