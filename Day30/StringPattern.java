/*Create a class StringPattern having methods add() and pattern() to take input and verify whether each word starts and ends with the same alphabet or not, if not generate a custom exception. Test your code for any 4 different test cases. Use an array of objects for the test cases.*/
import java.util.*;
class InvalidPatternException extends Exception
  {
    public InvalidPatternException(String message)
    {
      super(message);
    }
  }
class StringPattern
  {
    String text;
    void add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter text");
      text=sc.nextLine();
    }
    void pattern() throws InvalidPatternException
    {
      String arr[]=text.split(" ");
      for(int i=0;i<arr.length;i++)
        {
          String r=arr[i];
          int n=r.length();
          if(r.charAt(0)!=r.charAt(n-1))
            throw new InvalidPatternException("invalid pattern");
          else
            System.out.println("valid word Pattern");
        }
    }
  }
class Main
  {
    public static void main(String[] arg)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter no of test cases");
      int m=s.nextInt();
      StringPattern l[]=new StringPattern[m];
      for(int i=0;i<m;i++)
        {
          l[i]=new StringPattern();
          l[i].add();
          l[i].pattern();
        }
    }
  }