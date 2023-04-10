//Write a java program to replace every palindrome with “palindrome” in the given text
import java.util.*;
class replacePalindrome
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      String s=new String();
      System.out.println("enter string data");
      s=sc.nextLine();
      String Replacedstring=replacepalindrome(s);
      System.out.println(Replacedstring);
    }
    public static String replacepalindrome(String str)
    {
      String wordarr[]=str.split(" ");
      for(int i=0;i<=wordarr.length-1;i++)
        {
         Boolean s= palindrome(wordarr[i]);
          if(s=true)
          {
            wordarr[i]="palindrome";
          }
        }
     String result=" ";
      for(int k=0;k<wordarr.length-1;k++)
        {
          result=result+""+wordarr[i]+"";
        }
      return result;
         
  }
    static Boolean palindrome(String s1)
    {
      for(int j=s1.length()-1;j>=0;j--)
        {
          String s2=" ";
          s2=s2+s.charAt(j);
        }
      if(s2==s)
      {
        return true;
      }
      else{
        return false;
      }
    }