import java.util.*;
class weekday
  {
    public static void main(String arg[])
    {
      int week_no;
      System.out.println("enter weekno from 1-7:");
      Scanner p=new Scanner(System.in);
      week_no=p.nextInt();
      switch(week_no)
        {
          case 1:
            System.out.println("sunday");
            break;
          case 2:
            System.out.println("Monday");
            break;
          case 3:
            System.out.println("Tuesday");
            break;
          case 4:
            System.out.println("Wednesday");
            break;
          case 5:
            System.out.println("Thursday");
            break;
          case 6:
            System.out.println("friday");
            break;
          case 7:
            System.out.println("saturday");
            break;
          default:
            System.out.println("Enter valid weekno");
            break;
        }
    }
  }