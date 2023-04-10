import java.util.*;
class constructor
  {
    int num1;
    int num2;
    constructor(static int n1,int n2)
    {
      num1=n1;
      num2=n2;
    }
    void getnumdetails()
    {
      System.out.println(num1);
      System.out.println(num2);
    }
  }
class mainconstructor
  {
    public static void main(String[] a)
    {
      constructor s=new constructor(9,5);
      s.getnumdetails();
      
    }
  }