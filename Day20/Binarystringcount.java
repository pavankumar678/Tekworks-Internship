import java.util.*;
class binarystring
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter test cases u wanna perform");
      int T=sc.nextInt();
      taxcount(T);
    }
    static void taxcount(int t)
    {
      while(t!=0)
        {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter string length");
          int n=sc.nextInt();
          System.out.println("Enter cost for 01 pattern: ");
          int x=sc.nextInt();
          System.out.println("enter cost for 10 pattern:");
          String B=new String();
          System.out.println("Enter String data only combinaion of 0's &1's");
          B=sc.nextLine();
          // convert String into possible 01 patterns if x<y
          // convert String into possible 10 patterns if y<x
          char arr[]=B.toCharArray();
        }   
    }
  }