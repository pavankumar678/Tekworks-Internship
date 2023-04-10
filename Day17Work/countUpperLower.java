//Find number of Upper case and lower case letters are there in given string
import java.util.*;
class upperlower
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string data");
      String str=new String(sc.nextLine());
      int upper_count=0;
      int lower_count=0;
      for(int i=0;i<str.length;i++)
        {
          ch=str.charAt(i);
          if((ch>='a'&&ch<='z'))
          {
            lower_count=lower_count+1;
          }
          else if((ch>='A'&&ch<='Z'))
            {
            upper_count=upper_count+1;
            }
          else{
            System.out.println("invalid letter");
          }
        }
      System.out.println("Total upppercase letters:"+upper_coun);
      System.out.println("Total lowercase letters:"+lower_coun);
      
    }
  }