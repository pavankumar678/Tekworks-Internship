import java.util.*;
class buffermethods
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      String s=new String();
      System.out.println("enter string data");
      s=sc.nextLine();
      StringBuffer sb1=new StringBuffer(s);
      String s1=sb1.append("Pavan");
      System.out.println(s1);
      String s2=sb1.insert(5,"Pavan");
      System.out.println(s2);
      String s3=sb1.replace(1,3,"pavan");
      System.out.println(s3);
      String s4=sb1.delete(2,4);
      System.out.println(s4);
      String s5=sb1.reverse();
      System.out.println(s5);
             
        
    }
  }