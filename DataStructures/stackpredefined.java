import java.util.*;
class Main
  {
    public static void main(String[] arg)
    {
      Stack<String> animals=new Stack<>();
      animals.push("Dog");
      animals.push("Cat");
      animals.push("Horse");
      System.out.println("Stack"+animals);
      String element=animals.pop();
      System.out.println("Removed element"+element);
      String element1=animals.peek();
      System.out.println("Element at top:"+element1);
      int position=animals.search("Horse");
      System.out.println("Position of Horse:"+position);
      boolean result=animals.empty();
      System.out.println(result);//check stack empty or not.
    }
  }