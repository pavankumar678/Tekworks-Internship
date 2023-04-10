import java.util.*;
class InvalidNameException extends Exception
  {
    public InvalidNameException(String message)
    {
      super(message);
    }
  }
 class Personname
   {
     String name;
     Personname(String name)
     {
       this.name=name;
     }
          void namecheck() throws InvalidNameException
     {
        name=name.toLowerCase();
       if(name.charAt(0)=='a'||name.charAt(0)=='e'||name.charAt(0)=='i'||name.charAt(0)=='o'||name.charAt(0)=='u')
         System.out.println(name+" is  valid ");
       else
          throw new InvalidNameException("Error:Invalid name:"+name);
           }
     
   }
class Main
  {
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter name");
      String name=sc.nextLine();
      Personname p=new Personname(name);
      try
        {
          p.namecheck();
        }
      catch(InvalidNameException e)
        {
          System.out.println("Error: " + e.getMessage());
        }
    }
  }