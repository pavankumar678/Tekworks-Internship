//Write a program to capitalize every word of given string
import java.util.*;
class capitalize
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string data");
      String str=new String(sc.nextLine());
      String s1=str.toUpperCase();
      System.out.println(s1);
    }
  }