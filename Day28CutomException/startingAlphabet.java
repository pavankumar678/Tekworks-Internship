import java.util.*;
class InvalidWordException extends Exception
  {
    public InvalidWordException(String message)
    {
      super(message);
    }
  }
 class word
   {
     String word;
     Personname(String word)
     {
       this.word=word;
     }
          void wordcheck() throws InvalidWordException
     {
       word=word.toUpperCase();
      if(word.charAt(0)>='A'&& word.charAt(0)<='Z')
         System.out.println(word+" is  valid ");
       else
          throw new InvalidWordException("Error:Invalid word:"+word);
           }
     
   }
class Main
  {
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any word");
      String word=sc.nextLine();
      Personname p=new Personname(word);
      try
        {
          p.wordcheck();
        }
      catch(InvalidWordException e)
        {
          System.out.println("Error: " + e.getMessage());
        }
    }
  }