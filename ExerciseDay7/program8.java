import java.util.Scanner;
class leap
  {
    public static void main(String arg[[]])
    {
      int y;
      Scanner l=new Scanner(System.in);
      System.out.println("Enter year");
      y=l.nextInt();
      if(y%100==0 && y%400==0)
      {
        System.out.println("y is a leap year"+y);
      }
      else
      {
        System.out.println("y isn't a leap year"+y);
      }
    }
  }