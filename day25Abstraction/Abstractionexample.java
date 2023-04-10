import java.util.*;
abstract class bank
  {
    abstract double interestrate();
    abstract void annualprofit();
  }
class SBI extends bank
  {
    double interestrate()
    {
      return 9.74;
    }
    void annualprofit()
    {
      System.out.println("we got 30% annualprofit this year");
    }
  }
class ICICI extends bank
  {
     double interestrate()
    {
      return 9.79;
    }
    void annualprofit()
    {
      System.out.println("we got 50% annualprofit this year");
    }
  }
class AbstractClassExample
  {
    public static void main(STring[] a)
    {
      SBI s=new SBI();
      s.interestrate();
      s.annualprofit();
      ICICI i=new ICICI();
      i.interestrate();
      i.annualprofit();
    }
  }