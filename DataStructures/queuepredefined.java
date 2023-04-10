import java.util.*;
class Main
  {
    public static void main(String[] arg)
    {
      Queue<Integer> num=new LinkedList<>();
     // Queue<String> animals=new PriorQueue<>();
      num.offer(1);
      num.offer(2);
      num.offer(3);
      System.out.println("elements in queue:"+num);
      int accessedNumber=num.peek();
      System.out.println("Accessed element:"+accessedNumber);
      int removedNumber=num.poll();
      System.out.println("RemovedElement:"+removedNumber);
      System.out.println(num);
}
  }