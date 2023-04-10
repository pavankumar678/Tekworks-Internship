import java.util.*;
class ArrayListExample
  {
    public static void main(String[] arg)
    {
      ArrayList a=new ArrayList();
      ArrayList b=new ArrayList();
      ArrayList<Integer> a1=new ArrayList<Integer>();//for Homogeneous data only.using WraperClasses
      ArrayList<Object> b1=new ArrayList<Object>();//for heterogeneous data
      a.add(20);
      a.add(40);
      b.add(90);
      b.add(100);
      b.add(0);
      System.out.println(a);
      System.out.println(b);
      System.out.println(b.get(2));
      System.out.println(a.remove(1));
      System.out.println(b.indexOf(100));
      System.out.println(b.set(2,999));
    }
  }