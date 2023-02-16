import java.util.*;
class age
  {
    public static void main(String arg[])
    {
      int Byear;
      int present_age;
      System.out.println("enter your birthyear");
      Scanner s=new Scanner(System.in);
      Byear=s.nextInt();
      while(Byear>0)
        {
          present_age=(2023-Byear);
          System.out.println("Ur age is"+present_age);
          if(present_age<=18)
          {
            System.out.println("you are MINOR");
          }
          else if(present_age>18)
          {
            System.out.println("you are an adult");
          }
          else if(present_age>60)
          {
            System.out.println("you are seniorcitizen");
            }
          else
          {
            System.out.println("plz enter valid year");
          }
          
        }
      
    }
  }