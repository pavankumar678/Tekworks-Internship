import java.util.*;
class squareroot
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int n=sc.nextInt();
      try
        {
          System.out.println(Math.sqrt(n));
        }
      catch(Exception e)
        {
          System.out.println("Your code has some exception");
          System.out.println(e);
        }
    }
  }