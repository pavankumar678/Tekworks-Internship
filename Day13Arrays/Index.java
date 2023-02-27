import java.util.*;
class index
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
       findindex(array,size);
    }
     public static int  findIndex (int[] my_array, int t)
    {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
  }