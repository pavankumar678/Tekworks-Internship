import java.util.*;
class concate
  {
    public static void main(String[] a)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter first string data");
      String p=new String(s.nextLine());
       System.out.println("enter second string data");
      String q=new String(s.nextLine());
      String u=p.concate(q);
      System.out.println(u);
    }
  }