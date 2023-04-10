import java.util.*;
class EmployeeMain
  {
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      employeeimplement e1=new employeeimplement();
      char ch;
      System.out.println("1.Add Employee");
       System.out.println("2.Delete Employee");
       System.out.println("3.Search Employee");
       System.out.println("4.Display Employees");
      do{
        System.out.println("Enter choice?");
        int choice=sc.nextInt();
        switch(choice)
          {
            case 1:
             e1.insert();
              break;
            case 2:
             e1.delete();
              break;
            case 3:
             e1.search();
              break;
            case 4:
              e1.display();
              break;
            default:
            System.out.println("invalid option");
          }
      
        System.out.println("do you want to continue?");
      ch=sc.next().charAt(0);
        
      }while(ch!='n');
    }
  }