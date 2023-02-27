import java.util.*;
class max_min
  {
    public static void main(String[] a)
    {
      int size;
      System.out.println("enter array size:");
      Scanner p=new Scanner(System.in);
      size=p.nextInt();
      int maxandminelements[]=new int[size];
      System.out.println("enter your array elements:");
      for(int s=0;s<=size-1;s++)
        maxandminelements[s]=p.nextInt();
      displaymax_minno(maxandminelements,size);
    }
     static void displaymax_minno(int ps[],int n)
    {
      int max_no=ps[0];
      int min_no=ps[0];
      for(int i=1;i<ps.length;i++)
        {
          if(max_no<ps[i])
          {
            max_no=a[i];
            System.out.println(max_no+"is maximum element");
          }
          
        }
      for(int j=1;j<ps.length;i++)
        {
          if(min_no>ps[i])
          {
            min_no=ps[i];
            System.out.println(min_no+"is minimum element");
          }
        }
    }