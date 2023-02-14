import java.util.Scanner;
class student
{
   public static void main(String arg[])
        {
          String student_name;
          int student_rollno ;
          int sub_marksofm1;
          int sub_marksofm2;
          int sub_marksofm3;
          int sum=0;
          double percentage;
Scanner d=new Scanner(System.in); 
        System.out.println("enter student details");         
        student_name=d.next();
        student_rollno=d.nextInt();
        sub_marksofm1=d.nextInt();
        sub_marksofm2=d.nextInt();
        sub_marksofm3=d.nextInt();
          sum=sub_marksofm1+sub_marksofm2+sub_marksofm3;
          percentage=sum*0.01;
        System.out.println("percentage is"+percentage);
          System.out.println("sum is"+sum);
        }
}
       