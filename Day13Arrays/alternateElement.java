import java.util.*;
class alternate
  {
    public static void main(String[] a)
    {
     int size;
      System.out.println("enter array size:");
      Scanner p=new Scanner(System.in);
      size=p.nextInt();
      int array[]=new int[size];
      System.out.println("enter your array elements:");
      for(int s=0;s<=size-1;s++)
        array[s]=p.nextInt();
       alternate_elements(array,size);
    }
    static void alternate_elements(int a[],int n)
    {
      int p=a.length;
      for(i=0;i<p;i=i+2)
        {
          system.out.println(a[i]+"");
        }
    }
  }