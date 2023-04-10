import java.util.*;
class InvalidpasswordException extends Exception
  {
    public InvalidpasswordException(String message)
    {
      super(message);
    }
  }
class Passwrd
  {
    String Password;
    Passwrd(String pswd)
    {
      Password=pswd;
    }
    void checkpassword() throws InvalidpasswordException
    {
      if(Password.equals("abc123"))
        System.out.println("validPassword");
      else
        throw new InvalidpasswordException("InvalidPassword");
    }
  }
class Main
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter password");
      String pswd=sc.next();
      Passwrd d=new Passwrd(pswd);
      try{
        d.checkpassword();
      }
      catch(InvalidpasswordException e)
        {
          System.out.println(e.getmessage());
        }
    }
  }