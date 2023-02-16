import java.util.Scanner;
class bitwise
  {
    public static void main(String arg[])
    {
      int x,y;
      int a,b,c;
      System.out.println("enter x and y values");
      Scanner d=new Scanner(System.in);
      x=d.nextInt();
      y=d.nextInt();
      a=(x&y);
      b=(x|y);
      c=(x^y);
      System.out.println("a is"+a);
      System.out.println("b is"+b);
      System.out.println("c is"+c);
      System.out.println(x<<2);
    }
  }