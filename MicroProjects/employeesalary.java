import java.util.*;
class employee
  {
    public static void main(String arg[])
    {
      double s,annualsalary;
       boolean decision;
      System.out.println("Do u want to check ur netincome");
      Scanner p=new Scanner(System.in);
       decision=p.nextBoolean();
      System.out.println("enter your salary");
      s=p.nextDouble();
    do{
      annualsalary=s*12;
      System.out.println("Your annualsalary is:"+annualsalary);
      if(annualsalary>100000 && annualsalary<=300000)
      {
        double tax=annualsalary*0.10;
        System.out.println("you have to pay"+tax+"tax for ur annualincome");
        double net_income=(annualsalary-tax);
        System.out.println("Your netincome is"+net_income);
       }
      else if(annualsalary>300000 && annualsalary<=500000)
        {
         double tax=annualsalary*0.30;
        System.out.println("you have to pay"+tax+"tax for ur annualincome");
        double net_income=(annualsalary-tax);
        System.out.println("Your netincome is"+net_income);
        }
      else if(annualsalary>500000 && annualsalary<=1000000)
        {
        double tax=annualsalary*0.40;
        System.out.println("you have to pay"+tax+"tax for ur annualincome");
        double net_income=(annualsalary-tax);
        System.out.println("Your netincome is"+net_income);
        }
      else if(annualsaraly>1000000)
        {
        double tax=annualsalary*0.50;
        System.out.println("you have to pay"+tax+"tax for ur annualincome");
        double net_income=(annualsalary-tax);
        System.out.println("Your netincome is"+net_income);
        }
    
       else {
        System.out.println("enter valid salary");
       }
      
        
} while(decision=true);
    
      
      
    }
  }