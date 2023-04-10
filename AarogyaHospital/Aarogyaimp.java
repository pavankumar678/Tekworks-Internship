import java.util.*;
class InputValidation extends Exception
  {
    public InputValidation(String message)
    {
      super(message);
    }
  }
class Aarogyaimp implements AarogyaHospitals
  {
    String patientID;
   HasMap<String,AarogyaData> hm=new HashMap<>();
    public void addpatient() throws InputValidation
    {
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter PatientID");
      patientID=sc.nextLine();
      System.out.println(" Patient name:");
      String n=sc.nextLine();
      System.out.println("PatientAge:");
      String ag=sc.nextLine();
      try{
      if(ag.length()!=0 && ag.length()>2)
        throw new InputValidation("Invalid Age Error");}
      catch(InputValidation e)
        {
          System.out.println(e.getmessage());
        }
      System.out.println(" gender: ");
      char g=sc.next().charAt(0);
      System.out.println(" Patient's AadharNumber:");
      String an=sc.nextLine();
      try{
        if(an.length()<12 || an.length()>12)
          throw new InputValidation("Invalid AadharNo.");
      }
      catch(InputValidation e1)
        {
          System.out.println(e1.getMessage());
        }
      System.out.println("ContactNumber:");
      String cn=sc.nextLine();
      try{
        if(cn.length()<10 || cn.length()>10)
          throw new InputValidation("Invalid ContactNo.");
      }
      catch(InputValidation e1)
        {
          System.out.println(e1.getMessage());
        }
      System.out.println("city:");
      String ct=sc.nextLine();
    System.out.println("Adress:");
      String Adrs=sc.nextLine();
      System.out.println("Enter TodayDate");
      String dt=sc.nextLine();
      System.out.println("Guardian's Name:");
      String gn=sc.nextLine();
       System.out.println("Guardian's Adress:");
      String ga=sc.nextLine();
       System.out.println("Guardian's ContactNo:");
      String gc=sc.nextLine();
      hm.put(patientID,new AarogyaData(n,ag,g,an,cn,ct,Adrs,dt,gn,ga,gc));
     }
   public void viewpatient()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Do you want to view patient List?(Y/N)");
      char ch=sc.next().charAt(0);
      if(ch=='Y' || ch=='y')
        System.out.println(hm);
      else
      System.out.println("Thank You");
          }
   public void searchpatient()
    {
       if(hm.size()==0)
           System.out.println("No PatientData is available to Search");
        else
       {
           System.out.println("Enter PatientID to Search");
           String patientid=sc.nextLine();
           String verify=null;
           for(String k:hm.keySet())
               {
                 if(patientid.equals(k))
                 {
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
            System.out.println(hm.get(patientid));
           else
            System.out.println("Not found any Data");
        }      
    }
  public  void searchbyage() throws InputValidation
    {
      if(hm.size()==0)
        System.out.println("no data to search");
      else{
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter Patient Age to search");
      String Patientage=sc.nextLine();
      try{
      if(Patientage.length()!=0 && Patientage.length()>2)
        throw new InputValidation("Invalid Age Error");}
      catch(InputValidation e)
        {
          System.ut.println(e.getmessage());
        }
      searchbyage();
      String verify=null;
      ArrayList<AarogyaData> searchage=new ArrayList<>();
      for(AarogyaData itr:hm.values())
        {
          if(Patientage.equals(itr.getAge()))
          {
            searchage.add(itr);
            verify="found";
          }
        }
      if(verify!=null)
        System.out.println(searchage);
      else
        System.out.println("EnteredAge data not found");
      }
    }
    public void searchbycity()
        {
           if(hm.size()==0)
           System.out.println("No PatientData is available to delete");
          else
           {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter city to search");
      String Patientcity=sc.nextLine();
      String verify=null;
      ArrayList<AarogyaData> ad=new ArrayList<>();
      for(AarogyaData itr:hm.values())
        {
          if(Patientcity.equals(itr.getCity()))
          {
            ad.add(itr);
            verify="found"; 
          }
        }
      if(verify!=null)
        System.out.println(ad);
      else
        System.out.println("No such city found!");
           }
    }
   public void searchbydate()
    {
       if(hm.size()==0)
           System.out.println("No PatientData is available to delete");
      else
       {
      Scanner sc=new Scanner(System.in);
         System.out.println("Enter Date of Patient admitted ");
         String date=sc.nextLine();
         String verify=null;
         ArrayList<AarogyaData> searchdate=new ArrayList<>();
      for(AarogyaData itr:hm.values())
        {
          if(date.equals(itr.getDoadmin()))
          {
            searchdate.add(itr);
            verify="found";
          }
        }
         if(verify!=null)
           System.out.println(searchdate);
         else
           System.out.println("No Patient data found on that date");
       } }
   public void deletepatient()
    {
       if(hm.size()==0)
           System.out.println("No PatientData is available to delete");
        else
       {
           System.out.println("Enter PatientID to delete");
           String patientid=sc.nextLine();
           String verify=null;
           for(String k:hm.keySet())
               {
                 if(patientid.equals(k))
                 {
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
           hm.remove(patientid);
        else 
            System.out.println("not found any Data");
       }
    }
  }