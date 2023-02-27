import java.util.*;
class copy
  {
    public static void main(String[] arg)
    {
      int size;
      System.out.println("enter array size:");
      Scanner p=new Scanner(System.in);
      size=p.nextInt();
      int copyarray[]=new int[size];
      System.out.println("enter your array elements:");
      for(int s=0;s<=size-1;s++)
        copyarray[s]=p.nextInt();
       displaycopyarrayelements(copyarray,size);
        
    }
    static void displaycopyarrayelements(int a[],int n)
    {
      int a[]=new int[copyarray.length];
      a=copyarray;
      a[0]++;
      for(int j:a[])
      System.out.println(j);
    }
  }