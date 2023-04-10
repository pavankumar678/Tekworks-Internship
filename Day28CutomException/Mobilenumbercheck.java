import java.util.*;
class InvalidMobilenumException extends Exception
  {
    public InvalidMobilenumException(String message)
    {
      super(message);
    }
  }
class mobilenumber
  {
    String mobileno;
    mobilenumber(String mobileno)
    {
      this.mobileno=mobileno;
    }
    void checknum() throws InvalidMobilenumException
    {
      if(mobileno.length()!=10)
        throw new InvalidMobilenumException("Invalid mobilenumber");
      else
        System.out.println("Valid Mobilenumber");
    }
  }
class Main
  {
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter ur mobilenum");
      String num=sc.next();
      mobilenumber m=new mobilenumber(num);
      try{
        m.checknum();
      }
      catch(InvalidMobilenumException e)
        {
          System.out.println(e.getmessage());
        }
    }
  }