//Ashab Naveed
//Computer Science 20
//Henry Wise Wood High School
//2022-2023 Semester 2

import java.util.Scanner;
import java.io.*;

class ComboLockRun {

  public void run (String [] args) {
    //takes in a user input from the next line, giving a prompt
    Scanner input = new Scanner(System.in);
    System.out.println("Choose your password:");
    String passphrase = input.nextLine();
    //initializes the combination lock with the user-inputted password
    ComboLock c = new ComboLock(passphrase);
    c.setPass(passphrase);
    
//sets the lock to closed
    boolean open = false;

    //as the lock is closed, these prompts are shown
    while (open == false) {
    System.out.println("What would you like to do? Please type the number of an option.");
    System.out.println("Option 1: Turn the lock right");
    System.out.println("Option 2: Turn the lock left");
    System.out.println("Option 3: Attempt to open the lock");
    System.out.println("Option 4: Retrieve the combination with the password");

      //parses the user input for the selection the
    int choice = Integer.parseInt(input.nextLine());

      //starts a switch block, which will switch between the user inputted choice of 1-4 (case 1-4)
    switch (choice) {
      case 1:
        //if the user chooses to turn right, runs the number they want to turn right by into the created combolock and runs the turnRight code  
        System.out.println("Choose a number to turn right by: ");
        int right = Integer.parseInt(input.nextLine());
        c.turnRight(right);
        break;
      case 2: 
        //if the user chooses to turn left, runs the number they want to turn left by into the created combolock and runs the turnLeft code  
        System.out.println("Choose a number to turn left by: ");
        int left = Integer.parseInt(input.nextLine());
        c.turnLeft(left);
        break;
      case 3:
        //if the lock is open, prints that the lock is open and closes the while loop.
        if (c.isOpen() == true) {
          System.out.println("The combination lock has been succesfully opened.");
          open = true;
        } else { //if the lock is not opened, prints a message and keeps running
          System.out.println("The lock is not open.");
        }
        break;
      case 4:
        //prompts the user for the password
        System.out.println("Enter the password: ");
        String g = input.nextLine();
        try { //takes the input, and tries to check if the password is correct, then outputs the first, second, and third number of the list and formats
          System.out.println("The first number is: " + c.forgotNumbers(g) [0] + ", the second number is: " + c.forgotNumbers(g) [1] + ", and the third number is: " + c.forgotNumbers(g) [2]);
        } catch (NullPointerException e) { //if the password is wrong, then a message is printed 
          System.out.println("The inputed password was incorrect.");
        }
        break;
        
    }
  







      
    }
    
  }









  
}