/*create class WordTest having add()& testWord() to take input and verify whether every word has at least 3 vowels if the word is not having at least 3 vowels then generate a custom exception. Test your code for any 6 different scenarios. Use an array of objects for the test cases. */
import java.util.*;
class InvalidWordException extends Exception
  {
    public InvalidWordException(String message)
    {
      super(message);
    }
  }
class WordTest
  {
    String text;
    void add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter data");
      text=sc.nextLine();
    }
    void testword() throws InvalidWordException
    {
      String arr[]=text.split(" ");
      int count=0;
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=arr[i].toUpperCase();
          char ch[]=arr[i].toCharArray();
          for(int j=0;j<ch.length;j++)
            {
              if(ch[j]=='A'||ch[j]=='E'||ch[j]=='I'||ch[j]=='O'||ch[j]=='U')
                count=count+1;
              else
                count=count+0;
            }
          if(count<3)
            throw new InvalidWordException("invalid word");
          else
            System.out.println("valid word");
        }
      
      
    }
  }
class Main
  {
    public static void main(String[] arg)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter no of test cases");
      int f=s.nextInt();
       WordTest w[]=new  WordTest[f];
      for(int k=0;k<f:k++)
        {
          w[k]=new  WordTest();
          w[k].add();
          w[k].testword();
        }
    }
  }