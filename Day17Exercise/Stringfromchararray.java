import java.util.*;
class string
  {
    public static void main(String a[])
    {
      int size;
      System.out.println("enter array size");
      Scanner s=new Scanner(System.in);
      size=s.nextInt();
      char chararr[]=new Char(size);
      System.out.println("enter array size");
      for(int s=0;s<=size-1;s++)
        chararr[s]=p.next().charAt(0);
        stringfromchar(chararr,size);
      
    }
    static void stringfromchar(char a[],int n)
    {
      for(int i=0;i<n;i++)
        {
      String q = new String(a,0,(n-1));
        }
      System.out.println(q);
    }
  }