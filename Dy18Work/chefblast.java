import java.util.*;
class chefblast
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      String word=new String();
      System.out.println("enter word");
      word=sc.nextLine();
      System.out.println("enter blast value");
      int value=sc.nextInt();
      String U=subsetblast(word,value);
      System.out.println(U);
    }
    static String subsetblast(String w,int r)
    {
         int n=0;
      while(n==0){
        n=1;
      String str1=" ";
      int count=1;
            for (int i = 0; i <w.length(); i++) {
              for (int j = i+1; j <w.length(); j++){
                if( str.charAt(j) == str.charAt(i)) {
                   count++; 
                }
                if (count >= len) {
                  String str2=" ";
                  for(int k=0;k<len;k++)
                    str2=str2+str.charAt(i);
                    str1=w.replace(str2," "); 
                  str=str1;
                  n=0;
                }       
        }}}
        return str;
                
              }
                            
            
      return str;
        }
    }
  