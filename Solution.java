package practice_program;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read an integer
        int i = scan.nextInt();

        // Read a double
        double d = scan.nextDouble();

        // Consume the leftover newline character
        scan.nextLine();

        // Read the rest of the line as a string
        String s = scan.nextLine();

        // Print the output
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        // Close the scanner
        scan.close();
    }
}
