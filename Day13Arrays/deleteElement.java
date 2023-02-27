import java.util.*;
class delete
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
       delete_element(array,size);
    }
    static void delete_element(int ds[],int n)
    {
       Scanner p=new Scanner(System.in);
      System.out.println("enter element u wanna remove");
      remove=p.nextInt();
       for(int i=0;i<=size-1;i++)
        {
          if(remove==ds[i])
            ds[i]=0;
          break;
        }
    }
    }
  