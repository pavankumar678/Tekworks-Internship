import java.util.*;
class insert
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
       insert_element(array,size);
    }
    public static void insert_element(int arr[],int n)
    {
      Scanner p=new Scanner(System.in);
       Sytem.out.println("at what position u wanna insert");
      position=p.nextInt();
       Sytem.out.println("enter element u want to insert");
      arr[position]=p.nextInt();
      
    }
  }