import java.io.*;
import java.util.Scanner;


public class NumOfChars {

  public static void main (String[] args) {

    // Create new Scanner to get user input.
    Scanner reader = new Scanner(System.in);
    String input = "";

    // Ask user for input until they enter a valid string.
    while(input.equals("")){
      System.out.println("What is the input String?");
      input = reader.nextLine();
      if(input.equals("")){
        System.out.println("Please enter a valid string.");
      };
    };

    // Print the string and its length.
    System.out.printf("%s has %s characters.", input, input.length());
    //System.out.println("%s has", input);
  };

};
