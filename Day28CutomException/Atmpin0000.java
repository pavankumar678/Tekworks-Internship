//Generate Custome exception if the ATM pin number is not equal to 0000
import java.util.*;
class InvalidPinException extends Exception
  {
    public InvalidPinException(String message)
    {
      super(message);
    }
  }
class Atmpin
  {
    String pin;
    Atmpin(String pin)
    {
      this.pin=pin;
    }
    void checkpin() throws InvalidPinException
    {
     // int c=pin.compareTo("0000");
      //if c==0
      if(pin.equals("0000"))
        System.out.println(pin+"is valid AtmPin");
      else
        throw new InvalidPinException("Error:Invalid AtmPin:"+pin);
    }
  }
class Main
  {
    public static void main(String[] a)
    {
      Atmpin k=new Atmpin("3698");
      try{
        k.checkpin();
      }
      catch(InvalidPinException e)
        {
          System.out.println("Error:"+e.getmessage());
        }
      
    }
  }