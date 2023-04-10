//Write a Java program to get the character at the given index within the String
import java.util.*;
class index
  {
    public static void main(String[] a)
    {
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("enter string data");
      string=s.nextLine();
      System.out.println("enter index number");
      int i=s.nextInt();
      System.out.println("character at"+i+"is"+string.charAt(i));
    }
  }