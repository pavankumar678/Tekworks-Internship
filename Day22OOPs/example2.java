class mainclass
  {
    public static void main(String[] a)
    {
      incrementanddecrement se=new incrementanddecrement();
      incrementanddecrement.increment();
      se.decrement();
      System.out.println(incrementanddecrement.x+" "+se.y);
      
    }
   static class incrementanddecrement
      {
        static int x=5;
        int y=4;
        static void increment()
        {
          x=x+1;
        }
        void decrement()
        {
          x=x-1;
          y=y-1;
        }
      }
  }