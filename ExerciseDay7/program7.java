import java.util.Scanner;
class even
  {
    public static void main(String arg[])
    {
      Scanner r=new Scanner(System.in);
      int a;
      System.out.println("enter a value");
      a=r.nextInt();
      if(a%2==0)
      {
        System.out.println("a is an even "+a);
      }
      else
      {
        System.out.println("a is odd"+a);
      }
    }
  }
