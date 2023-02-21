import java.util.*;
class numberguessgame
  {
    public static void main(String[] arg)
    {
      int number = 1 + (int)(100* Math.random());
      Scanner p=new Scanner(System.in);
      System.out.println("A number is choosen between 1-100 by computer");
      System.out.println("Guess that number in 5 trails");
      int k=5;
      for ( int i = 0; i < k; i++)
        {
          int guess;
      System.out.println("Guess the number:");
      guess=p.nextInt();
           if (number == guess) 
           {
                System.out.println("Congratulations!"
                    + " You guessed the number.");
                break;
            }
            else if (number > guess && i != k - 1)
            {
                System.out.println(
                    "The number is "
                    + "greater than " + guess);
            }
            else if (number < guess && i != k - 1)
            {
              System.out.println(
                    "The number is"
                    + " less than " + guess);
            }
        
        }
        if (i == k) 
        {
            System.out.println(
                "You have exhausted"
                + " K trials.");
 
            System.out.println(
                "The number was " + number);
        }
        
              
    }
  }