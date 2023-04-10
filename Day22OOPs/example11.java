class example
  {
    private int var1=10;
    static int var2=30;
   
    void display()
    {
      int var3=20;
      System.out.println(var1+" "+var2+" "+var3);
    }
    void inc()
    {
      var1=var1+1;
      var2=var2+1;
    }
  }
class mainclass
  {
    public static void main(String[] a)
    {
      example se=new example();
      example s=new example();
     //System.out.println(se.var1+" "+example.var2);
      se.inc();
      se.display();
      s.inc();
      s.display();
    }
  }