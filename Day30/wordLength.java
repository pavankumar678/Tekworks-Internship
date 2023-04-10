/*Create a class StringValid having methods add() & validate() for reading and validating whether the size of all words in the given text are equal if not generate a custom exception. Test your code for any 4 different input texts. Use an array of objects for the test cases.*/
import java.util.*;
class InvalidsizeException extends Exception
  {
    public InvalidsizeException(String message)
    {
      super(message);
    }
  }
class StringValid
  {
    String text;
    String arr[];
    void add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any data ");
      text=sc.nextLine();
    }
    void validate() throws InvalidsizeException
    {
      String arr[]=text.split(" ");
      int n=arr[0].length();
      for(int i=1;i<arr.length-1;i++)
        {
          if(arr[i].length()!=n)
            throw new InvalidsizeException("enter vlid data");
          else
            ystem.out.println("valid data");
        }
      
    }
  }
class Main
  {
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no of testcases");
      int t=sc.nextLine();
       StringValid g[]=new  StringValid[t];
      for(int j=0;j<t;j++)
        {
          g[j]=new  StringValid();
          g[i].add();
          g[i].validate();
        }
    }
  }