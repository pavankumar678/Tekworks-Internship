import java.util.*;
class alphabet
  {
    public static void main(String arg[])
    {
      char a;
      System.out.println("enter character");
      Scanner k=new Scanner(System.in);
      a=k.nextchar(0);
      if((c>='a'&&c<='z') && (c>='A'&&c<='Z'));
      {
        System.out.println("a is an alphabet"+a);
      }
      else
      {
        System.out.println("a isn't an alphabet"+a);
      }
    }
  }