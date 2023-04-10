//Write a Java program to compare two strings lexicographically
import java.util.*;
class lexicograph
  {
    public static void main(String[] a)
    {
      Scanner s=new Scanner(System.in);
      String p=new String();
      System.out.println("Enter first string data");
      p=s.nextLine();
      System.out.println("Enter second string data");
      String q=new String(s.nextLine());
      System.out.println(p.compareTo(q));
    }
  }