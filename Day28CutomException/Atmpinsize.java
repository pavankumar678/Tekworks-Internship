import java.util.*;
class Atmpinwrong extends Exception
{
    Atmpinwrong(String message)
    {
    super(message);
    }
}
 
class ATMPin
{
    String pin;
    ATMPin(String pin)
    {
        this.pin=pin;
    }
    void verify() throws Atmpinwrong
    {
        try
        {
            if(pin.length()!=4)
                throw new Atmpinwrong("invalid number of charcaters");
        }
        
              
       catch(Atmpinwrong a)
        {
            System.out.println(a.getMessage());
        }
         }
    }  
  class Main
    {
    public static void main(String a[])
    {
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter Your atm pin");
    String pin=Sc.next();
        ATMPin p=new ATMPin(pin);
    try{
        p.verify();
        }
    catch(Atmpinwrong n)
      {
            System.out.println(n.getMessage());
        }
  }
  
    }