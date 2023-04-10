import java.util.*;
class employee
  {
    String name;
    String emp_id;
    double salary;
    employee(String name,String emp_id,double salary)
    {
      this.name=name;
      this.emp_id=emp_id;
      this.salary=salary;
    }
    public String toString()
    {
      System.out.println(name+" "+emp_id+" "+salary);
      return s;
    }
  }
class ArrayList
  {
    public static void main(String[] arg)
    {
      ArrayList<employee> a=new ArrayList<employee>();
      a.add(new employee("pavan","1009",9999.9));
      a.add(new employee("mahesh","1008",9876.0));
      ArrayList<employee> b=new ArrayList<employee>();
      b.add(new employee("rahul","1010",9899.9));
      b.add(new employee("santosh","1011",7890.0));
      System.out.println(a.toString());
      System.out.println(b.toString());
      
      
    }
  }
