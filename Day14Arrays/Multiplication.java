import java.util.*;
class multiplicationofmatrices
  {
    public static void main(String[] a)
    {
      int row1,col1,rwo2,col2;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter row1 size");
      row1=s.nextInt();
      System.out.println("Enter column1 size");
      col1=s.nextInt();
      int arr1[][]=new int[row1][col1];
      System.out.println("enter array1 elements");
      for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++)
      arr1[row1][col1]=s.nextInt();
      }
       System.out.println("Enter row2 size");
      row2=s.nextInt();
      System.out.println("Enter column2 size");
      col2=s.nextInt();
      int arr2[][]=new int[row2][col2];
       System.out.println("enter array2 elements");
      for(int i=0;i<row2;i++){
        for(int j=0;j<col2;j++)
      arr2[row2][col2]=s.nextInt();}
      multplication(arr1,row1,col1,arr2,row2,col2);
    }
    static void multiplication(int a[][],int r1,int c1,int b[][],int r2,int c2)
    {
      int result[][]=new int[r1][c2];
      if(c1==r2)
      {
        for(int i=0;i<r1;i++)
          {
            for(int j=0;j<c2;j++)
              {
                result[i][j]=0;
                for(int k=0;k<c1;k++)
                  result[i][j]=result[i][j]+a[i][k]*b[k][j];
              }
          }
         for(int i=0;i<r1;i++)
          
            for(int j=0;j<c2;j++)
              System.out.println(result[i][j]+"\t");
              System.out.println("\n");
                    }
      else
      {
        System.out.println("Invalid matrix dimensions");
      }
    }
  }