class Threadclass implements Runnable
  {
   public  void run()
    {
      System.out.println("i am running thred");
    }
  }
public class ThreadExample{
  public static void main(String h[])
  {
    try{
    Threadclass tc=new Threadclass();
   // tc.run();
    Thread t1=new Thread(tc);
    t1.start();
      t1.sleep(10000);
    Thread t2=new Thread(tc);
    t2.start();
      t2.sleep(10000);
    Thread t3=new Thread(tc);
    t3.start();
      t3.sleep(10000);
    
    // start()---> run
    }
  catch(Exception e)
      {
        System.out.println(e);
      }
  }
}