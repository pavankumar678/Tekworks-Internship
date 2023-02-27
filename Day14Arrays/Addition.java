import java.util.*;
class addition
  {
    public static void main(String[] a)
    {
      int row1,col1,rwo2,col2;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter row1 size");
      row1=s.nextInt();
      System.out.println("Enter column1 size");
      col1=s.nextInt();
      System.out.println("enter array1 elements");
      for(int i=0;i<row1;i++)
        for(int j=0;j<col1;j++)
      arr1[row1][col1]=s.nextInt();
       System.out.println("Enter row2 size");
      row2=s.nextInt();
      System.out.println("Enter column2 size");
      col2=s.nextInt();
      System.out.println("enter array1 elements");
      for(int i=0;i<row2;i++)
        for(int j=0;j<col2;j++)
      arr2[row2][col2]=s.nextInt();
      displaysum(arr1,arr2,row1,col1,row2,col2);
    }
    static void displaysum(int a[],int m,int n,int b[],int p,int q)
    {
      int[][] result=new result[i][j];
      if(a[m]==b[p] && a[n]==b[q])
      {
        for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
              {
                 result[i][j]=arr1[i][j]+arr2[i][j];
              }
          }
      }
      
        System.out.println(result[i][j]);
      
    }
  }