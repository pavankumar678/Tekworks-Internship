// Create an application that takes a string as input and encrypts it using a simple encryption algorithm like Caesar Cipher or Vigenere Cipher.
import java.util.*;
class encryption
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      String str=new String();
      System.out.println("Enter string data");
      str=sc.nextLine();
      System.out.println("enter position number to encript data");
      int position=sc.nextInt();
      String r=encryptdata(str,position);
      System.out.println("Data after encryption"+r);
      String t=decryptdata(r,position);
      System.out.println("Data after decryption"+t);
    }
    static String encryptdata(String str1,int n)
    {
      String result="";
      for(int i=0;i<str1.length();i++)
        {
          result=result+ (char) (str1.charAt(i)+n%26);
        }
      return result;
    }
    static String decryptdata(String str2,int m)
    {
      String res="";
      for(int j=0;j<str2.length();j++)
        {
          res=res+(char)(str2.charAt(j)-m%26);
        }
      return res;
    }
  }