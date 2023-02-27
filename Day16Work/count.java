import java.util.*;
class count
  {
    public static void main(String[] a)
    {
      int size;
       System.out.println("enter array size:");
      Scanner p=new Scanner(System.in);
      size=p.nextInt();
      int arr[]=new int[size];
      System.out.println("enter your array elements:");
      for(int s=0;s<=size-1;s++)
        arr[s]=p.nextInt();
       displaycountofevenandodd(arr,size);
       countofpositivenegativezeros(arr,size);
       primecount(arr,size);
    }
    static void displaycountofevenandodd(int a[],int n)
    {
      int even_count=0;
      int odd_count=0;
       for(int i:a)
        {
          if(i%2==0)
          {
            even_count=even_count+1;
          }
          else{
            odd_count=odd_count+1;
          }
        }
      System.out.println("Total even elements:"+even_count);
      System.out.println("Total odd elements:"+odd_count);
    }
    static void countofpositivenegativezeros(int b[],int n1)
    {
       int zero_count=0;
      int positive_count=0;
      int negative_count=0;
      for(int j:b)
        {
          if(j==0)
          {
            zero_count=zero_count+1;
          }
          else if(j>0)
          {
            positive_count=positive_count+1;
          }
          else if(j<0)
          {
            negative_count=negative_count+1;
          }
          else{
            System.out.println("invalid number");
          }
        }
      System.out.println("Total zero elements:"+zero_count);
      System.out.println("Total positive elements:"+positive_count);
      System.out.println("Total negative elements:"+negative_count);
    }
    static void primecount(int c[],int n2)
    {
      int prime_count=0;
      for(int i=0;i<n2-1;i++)
        {
          if()
        }
    }
  }