import java.util.*;
class specifiedposition
  {
    public static void main(String a[])
    {
       int size;
      System.out.println("enter array size:");
      Scanner p=new Scanner(System.in);
      size=p.nextInt();
      int array[]=new int[size];
      System.out.println("enter your array elements:");
      for(int s=0;s<=size-1;s++)
        array[s]=p.nextInt();
       delete_element(array,size);
    }
    static void delete_element(int ps[],int n)
    {
       Scanner p=new Scanner(System.in);
       Sytem.out.println("at what position u wanna insert");
      position=p.nextInt();
      arr[position]=0;
    }
  }