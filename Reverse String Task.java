/* Main idea:
 * Here, we can just start iterating from the back of the input string and add each character to the output string as we move forward
 * So, we can just start by initializing an empty string (e.g. reversedString = "")
 * Then, traverse the input string from backward (using loop)
 * And as we move towards the beginning of the input string, we can just add each character to the resulting string (reversedString)
 * Finally we have the reversed string as an output
 */ 

import java.util.*; // Importing everything from java.util package

class ReverseString { 
    public static void main(String[] args) { // main method
        Scanner scan = new Scanner(System.in); // Creating an object of Scanner class
        String inputString = scan.nextLine(); // Reading the input string
        int n = inputString.length(); // Determining the length of the input string
        String reversedString = ""; // Initialized an empty string, where the reversed string will be stored
        for (int i = n - 1; i >= 0; i--) { // Started iterating from the back of the input string
           reversedString += inputString.charAt(i); // As I am iterating from the back and moving forward, just taking each character and adding them to the reversed string
        }
        System.out.println(reversedString); // Finally, output the reversed string to the console
    }
}