import java.util.*;
class stringexample
  {
    public static void main(String[] a)
    {
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("enter data");
      string=s.nextLine();
      System.out.println(string);
      System.out.println(string.charAt(6));
      String arr[]=string.split(" ");
      for(int i=0;i<arr.length;i++)
        {
      System.out.println(arr[i]);
        }
      //length method
      int r=string.length(); 
      System.out.println(r);
      // concatination method
      String s2="hello";
      System.out.println(string.concat(s2));
      // using + operator
       System.out.println(string+"Hi");
      // toString method
      Stringpavan p=new Stringpavan();
      System.out.println(p.toString());
      //Character Extraction methods
      //1.charAt method
      char ch=string.charAt(9);
      System.ouy.println(ch);
      //2.getchars()
      char p[]=new char[8];
    string.getChars(3,7,p,1);
      for(int i=0;i<p.lenth;i++)
      System.out.println(p[i]);
      //3.getBytes()
      byte b[]=string.getBytes();
      for(int i=0;i<b.length;i++)
        System.out.println(b[i]);
      //4.toCharArray() //converting string into array
      char sc[]=string.toCharArray();
      for(int j=0;j<sc.length;j++)
        System.out.println(sc[j]);
      //String Comprison method
      //1.compareTo()
      System.out.println("enter second string data");
      String s1=new String(s.nextLine());
      int q=string.compareTo(s1);
      System.out.println(q);
      //2.equals()
      boolean e=string.equals(s1);
      System.out.println(e);
      //3.== method
      System.out.println(string==s1);
      //4.startsWith()
      System.out.println(string.startsWith("z"));
      System.out.println(s1.startsWith("q"));
      //5.endsWith()
      System.out.println(string.endsWith("&"));
      //6.equalsIgnoreCase()
      System.out.println(string.equalsIgnoreCase(s1));


      //SEARCHING FOR SOME PATTERN
      //1.indexOf()
      System.out.println(string.indexOf("of"));
       System.out.println(s1.indexOf("st",2)); //checking from startingindex2
      //2.lastIndex()
       System.out.println(string.lastIndex("q"));
      System.out.println(s1.lastIndex("l",3));//retrieving last 3chatacters

      //case Conversions
       System.out.println(string.toLowerCase());
        System.out.println(s1.toUpperCase());
      //substring()
      System.out.println(string.substring(0));//starting from index0 to end
      System.out.println(string.substring(2,3));//start from index2  to 3-1 index

      //replace()
      System.out.println(s1.replace("z","op"));//replacing z pattern with op in entire string s1.
    }
  }