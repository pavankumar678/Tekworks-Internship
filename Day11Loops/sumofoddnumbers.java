import java.util.*:
class sumofodd
  {
    public static void main(String[] arg)
    {
      int i=1,number,sum=0;
      System.out.println("Enter max number upto u want to add");
      Scanner p=new Scanner(System.in);
      number=p.nextInt();
      while(i<=number)
        {
          sum=sum+i;
          i=i+2;
        }
       System.out.println("your sum is:"+sum);
    }
  }