class AarogyaMain
  {
    public static void main(String arg[])
    {
      System.out.println("Welcome to AarogyaHsptl Management Systems");
       Aarogyaimp a=new Aarogyaimp();
      do{
      System.out.println("Menu");
      System.out.println("1.Add Patient");
      System.out.println("2.View Patients");
      System.out.println("3.Search Patient");
      System.out.println("4.Search Patient by City");
      System.out.println("5.Search Patient by age");
      System.out.println("6.Search Patient by DateofAdm");
      System.out.println("7.Delete Patient");
      System.out.println("choose ur option");
      int i=sc.nextInt();
      char ch;
      switch(i)
        {
          case 1:
            a.addpatient();
            break;
          case 2:
            a.viewpatient();
            break;
          case 3:
            a.searchpatient();
            break;
          case 4:
            a.searchbyage();
            break;
          case 5:
            a.searchbycity();
              break;
          case 6:
            a.searchbydate();
            break;
          case 7:
            a.deletepatient();
            break;
        System.out.println("Do u want to perform one more operation? ");
            ch=sc.next().charAt(0);
        }
      }while(ch!=n);
    }
  }