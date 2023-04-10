//Find number of vowels, consonants, spaces, digits and special symbols in given input string
import java.util.*;
class vowel
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string data");
      String str=new String(sc.nextLine());
      str=str.toLowercase();
      int vowel_count=0;
      int cons_count=0;
      int space_count=0;
      int digit_count=0;
      int special_count=0;
      for(int i=0;i<str.length;i++)
        {
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
       {
        vowel_count=vowel_count+1;
      }

      
      else if ((ch >= 'a' && ch <= 'z')) {
        cons_count=cons_count+1;
      }
      
      
      else if (ch >= '0' && ch <= '9') {
        digit_count=digit_count+1;
      }
      
      
      else if (ch == ' ') {
        space_count=space_count+1;
      }
          else{
            special_count=special_count+1;
          }
        }
      System.out.println("Total vowels:"+vowel_count);
       System.out.println("Total consonants:"+cons_count);
       System.out.println("Total digits:"+digit_count);
       System.out.println("Total whiteSpaces:"+space_count);
       System.out.println("Total specialcharacters:"+special_count);
    }
  }