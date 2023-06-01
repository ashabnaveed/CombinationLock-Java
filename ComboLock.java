import java.util.Random;

public class ComboLock {

  //used for the randomizer later on
  Random r = new Random();
  
  //initialize instance variables, all private
  private int secretOne;
  private int secretTwo;
  private int secretThree;
  private String password;

  //upperbound variable for the random, setting the max value for the code to 60.

  int upperbound = 60;

  //sets the secret values

  public ComboLock (String password) {
    int lowerbound = 1;
    secretOne = lowerbound + r.nextInt(upperbound);
    secretTwo = lowerbound + r.nextInt(upperbound);
    secretThree = lowerbound + r.nextInt(upperbound);

    if (secretTwo == secretOne) {
      secretTwo += 1; } 
    if (secretTwo > 60) {
      secretTwo -= 2; }
    if (secretThree == secretTwo) {
      secretThree +=  2;
    } if (secretThree > 60) {
      secretThree -=  3;
    }
    this.password = password;
  }

  
  //sets the password

  public String setPass (String passPhrase) {
    password = passPhrase;
    return password;
  }
  
  //constructors
  public ComboLock (int one, int two, int three) {
    secretOne = one;
    secretTwo = two;
    secretThree = three;
    password = null;
  }

  public ComboLock (int one, int two, int three, String passphrase) {
    secretOne = one;
    secretTwo = two;
    secretThree = three;
    password = passphrase;
  }

  //accessor for the password
  public String getPass () {
    return password;
  }
  
  //initializes variables 
  int orderR = 0;
  int rightNumA;
  int rightNumB;
  int leftNum;
  int order = 0;

  //sets the left turn to the inputted number
  public void turnLeft (int num) {
    leftNum = num;
  }

  //sets the first number to "A", changes the right num 1 to indicate a value has been inputted, and then the second time it turns right the value is assigned to the another right number called "B"
  public void turnRight (int num) {
    if (rightNumA == 0) {
      rightNumA = num;
    }
    else {
      rightNumB = num;
    }
  }

  //checks if the inputted numbers are equal to the secret values, returning true if yes.
  public boolean isOpen () {
    if (rightNumA == secretOne && rightNumB == secretThree && leftNum == secretTwo) {
      return true;
    } else {
      return false;
    }
  }

 public int[] forgotNumbers (String passwordGuess) {
   if (passwordGuess.equals(password)) {
int numbers [] = new int[] {secretOne, secretTwo, secretThree};
     return numbers; } 
   else { return null; }
     }









  
}