import java.util.*;
class Employee
  {
    String name;
    int id;
    int age;
    double salary;
    Employee(String name,int id,int age,double salary)
    {
      this.name=name;
      this.id=id;
      this.age=age;
      this.salary=salary;
    }
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary() {
		return salary;
	}
	public String toString()
    {
      return "name:"+name+"  id:"+id+"  Age:"+Age+"  salary:"+salary;
    }
    
  }
class EmployeeDataBase
  {
    public static void main(String[] arg)
    {
      Scanneer sc=new Scanner(System.in);
      ArrayList<Employee> employes=new ArrayList<Employee>();
      //1.adding operation
      employes.add(new Employee("pavan",1001,22,29000.0));
      employes.add(new Employee("santosh",1002,24,29000.0));
      //travelling operation
      Iterator it=employes.iterator();
      while(it.hasNext())
    {
      System.out.println(it.next());
    }
      //searchoperation
      String verify=null;
      System.out.println("enter emp_id:");
      int sid=sc.nextInt();
     for(Employee e:employes)
       {
         if(e.getId()==sid)
         {
           System.out.println("name:"+name+" id"+id;"age:"+age+"salary:"+salary);
           verify="found";
           break;
         }
       }
      if(verify==null)
      {
        System.out.println("not found record");
      }
      //removeOperation
      String verify1=null;
      System.out.println("enter emp_id to remove data:");
      int rid=sc.nextInt();
      for(Employee e:employes)
        {
          if(e.getId()==rid)
          {
            employes.remove(e);
            verify1="found";
            break;
          }
        }
      if(verify1==null)
        System.out.println("record not found");
      Iterator it1=employes.iterator();
      while(it1.hasNext())
        {
          System.out.println(it1.next());
        }
      
    }
  }