class conversiondiversion
  {
    public static void main(String[] a)
    {
      int i=39;
      String str1=String.valueOf(i);
      int num=Integer.parseInt(str1);
      System.out.println(str1);
       System.out.println(num);
      double d=24.223;
      String str2=Double.toString(d);
      Double dou=Double.parseDouble(str2);
      System.out.println(str2);
       System.out.println(dou);
      Long l=984975;
      String str3=String.valueOf(l);
      Long L=Long.parseLong(str3);
       System.out.println(str3);
       System.out.println(L);
      Boolean b=True;
      String str4=Boolean.toString(b);
      boolean B=Boolean.parseBoolean(str4);
      System.out.println(str4);
      System.out.println(B);
    }
  }