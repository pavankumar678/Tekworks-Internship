import java.util.*;
class leapyear
  {
    public static void main(String arg[])
    {
      int year;
      System.out.println("Enter any year");
      Scanner s=new Scanner(System.in);
      year=s.nextInt();
      if(year%100==0 && year%400==0)
      {
        System.out.println(year+ "is a leap year");
      }
      else
      {
        System.out.println(year+" isn't a leap year");
      }
    }
  }