/*Create class Palindrome having methods add() and palindrome() to take data and verify whether the given number is palindrome or not. If the number is not palindrome generate a custom exception. Test your code for any 5 different numbers.*/
import java.util.*;
class InvalidPalindromeException extends Exception
  {
    public InvalidPalindromeException(String message)
    {
      super(message);
    }
  }
class Palindrome
  {
    int number;
    void add()
    {
      Scanner sc=new Scanner(System.in);
      number=sc.nextInt();
    }
    void checkpalindrome() throws InvalidPalindromeException
    {
      int reversenum=0;
      while(number!=0)
        {
          int r=number%10;
          reversenum=reversenum*10+r;
          number=number/10;
        }
      if(number!=reversenum)
        throw new InvalidPalindromeException("Invalid Palindrome");
      else
        System.out.println("Valid Palindrome");
    }
  }
class Main
  { 
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no of test cases");
      int i=sc.nextInt();
      Palindrome p[]=new Palindrome[i];
      for(int j=0;j<i;j++)
        {
          p[j]=new Palindrome();
          p[j].add();
          p[j].checkpalindrome();
        }
    }
  }