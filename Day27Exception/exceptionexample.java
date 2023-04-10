import java.util.*;
class example
  {
    public static void main(String[] a)
    {
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int y=s.nextInt();
      char c[]={'p','a','v','a','n'};
      try{
        System.out.println(x/y);
        System.out.println(c[6]);
      }
      catch(Exception e)
        {
System.out.println(e);
        }
      System.out.println("Program executed successfully");
    }
  }