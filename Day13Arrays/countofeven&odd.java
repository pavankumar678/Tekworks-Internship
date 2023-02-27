import java.util.*;
class countofevenodd
  {
    public static void main(String[] a)
    {
      int size;
      System.out.println("enter array size:");
      Scanner p=new Scanner(System.in);
      size=p.nextInt();
      int count_of_even_odd[]=new int[size];
      System.out.println("enter your array elements:");
      for(int s=0;s<=size-1;s++)
        count_of_even_odd[s]=p.nextInt();
       countoftotalevenodd(count_of_even_odd,size);
    }
    static void countoftotalevenodd(int ps[],int n)
    {
      int even_count=0;
      int odd_count=0;
      for(int i:ps)
        {
          if(i%2==0)
          {
           even_count=even_count+1;
          }
          else
          {
            odd_count=odd_count+1;
          }
        }
      System.out.println("total even elements are:"+even_count);
      System.out.println("total odd elements are:"+odd_count);
    }