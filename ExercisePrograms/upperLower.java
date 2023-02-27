import java.util.*;
class upperlowercase
  {
    public static void main(String arg[])
    {
      char ch;
      System.out.println("enter any character:");
      Scanner s=new Scanner(System.in);
      ch=s.next().charAt(0);
      if(ch>='a' && ch<='z')
      {
        System.out.println("Your character is lowercaseLetter");
      }
      else if(ch>='A' && ch<='Z')
      {
        System.out.println("Your character is an uppercaseLetter");
      }
       else {
         System.out.println("invalid character");
        
         }
    }
  }