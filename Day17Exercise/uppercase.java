//Write a Java program to convert all the characters in a string to uppercase
import java.util.*;
class uppecase
  {
    public static void main(String[] a)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter string data");
      String p=new String(s.nextLine());
      String q=p.toUpperCase();
      System.out.println(q);
    }
  }