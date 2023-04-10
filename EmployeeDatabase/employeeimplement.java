import java.util.*;
class employeeimplement implements Employee
  {
    ArrayList<EmployeeData> emp=new ArrayList<>();
   public void insert()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter employee details:");
      String n=sc.next();
      int id=sc.nextInt();
      double sal=sc.nextDouble();
      emp.add(new EmployeeData(n,id,sal));
    }
   public void delete()
    {
      Scanner sc=new Scanner(System.in);
      if(emp.size()==0)
        System.out.println("No data available  to delete");
      else
      {
        String verify=null;
        System.out.println("enter employee id to delete");
        int rid=sc.nextInt();
        for(EmployeeData e:emp)
          {
            if(e.getId()==rid)
              emp.remove(e);
            verify="found";
            break;
          }
        if(verify==null)
          System.out.println("no data found");
      }
    }
   public void search()
    {
       Scanner sc=new Scanner(System.in);
      if(emp.size()==0)
        System.out.println("No data available  to search");
      else
      {
        String verify1=null;
        System.out.println("enter employee id to search");
        int sid=sc.nextInt();
        for(EmployeeData e:emp)
          {
            if(e.getId()==sid)
            System.out.println(e.getName()+" "+e.getId()+" "+e.getSalary());
            verify1="found";
            break;
          }
        if(verify1==null)
          System.out.println("no data found");
      }
    }
   public void display()
    {
      if(emp.size()==0)
        System.out.println("No data available");
      else
      {
      Iterator it=emp.iterator();
      while(it.hasNext())
        System.out.println(it.next());
    }
    }
  }