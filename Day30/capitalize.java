//Create class Capitalize having add(), checkCapital() to read data and to verify whether every word of a given text is starting with an upper case vowel or not if it's not starting with the upper case vowel generate a custom exception.  Test your application for any 5 different inputs. Use an array of objects for the test cases. 
import java.util.*;
class InvalidcapitalException extends Exception
  {
    public InvalidcapitalException(String message)
    {
      super(message);
    }
  }
class capitalize
  {
    String data;
    String arr[];
   void add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter text ");
      data=sc.nextLine();
    }
   void checkCapital() throws InvalidcapitalException
    {
     String arr[]=data.split(" ");
      for(int i=0;i<arr.length;i++)
        {
          String s=arr[i];
          if(s.charAt(0)=='A'||s.charAt(0)=='E'||s.charAt(0)=='I'||s.charAt(0)=='O'||s.charAt(0)=='U')
            System.out.println("valid data");
          else
          throw new InvalidcapitalException("Enter valid data");
        }
    }
  }
class Main
  {
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no of testcases");
      int n=sc.nextInt();
      capitalize f[]=new capitalize[n];
      for(int i=0;i<n;i++)
        {
          f[i]=new capitalize();
          f[i].add();
          f[i].checkCapital();
        }
    }
  }