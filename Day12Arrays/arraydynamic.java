import java.util.*;
class dynamic
  {
    public static void main(String[] a)
    {
      int size;
      System.out.println("enter array size:");
      Scanner p=new Scanner(System.in);
      size=p.nextInt();
      String Statenames[]=new String[size];
      System.out.println("enter your array elements:");
      for(int s=0;s<=size-1;s++)
        Statenames[s]=p.next();
      displaystatenames(Statenames,size);
    }
    static void displaystatenames(String ps[],int n)
    {
    for(String h:ps)
      System.out.println(h);
    }
    }
  