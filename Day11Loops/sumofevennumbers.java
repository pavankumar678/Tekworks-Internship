import java.util.*:
class sumofeven
  {
    public static void main(String[] arg)
    {
      int i=2,sum=0,num;
      System.out.println("Enter max number upto u want to add");
      Scanner p=new Scanner(System.in);
      num=p.nextInt();
      while(i<=num)
        {
          sum=i+sum;
          i=i+2
        }
      System.out.println("Your sum is:"+sum);
    }
  }