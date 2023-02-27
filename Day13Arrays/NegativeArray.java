import java.util.*;
class negativearray
  {
    public static void main(String[] a)
    {
      int size;
      System.out.println("enter array size:");
      Scanner p=new Scanner(System.in);
      size=p.nextInt();
      int Negativearray[]=new int[size];
      System.out.println("enter your array elements:");
      for(int s=0;s<=size-1;s++)
        Negativearray[s]=p.nextInt();
       negativearrayelement(Negativearray,size);
    }
    static void negativearrayelement(int ks[],int n)
    {
      int count=0;
      for(int i:ks)
        {
          if(i<0)
          {
            count=count+1;
          }
        }
      System.out.println("Count of negative elements in array:"+count);
    }