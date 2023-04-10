class AarogyaData
  {
    String name;
    String age;
    char gender;
    String aadharno;
    String contactno;
    String city;
    String adress;
    String doadmin;
    String guardianname;
    String guardianadress;
    String guardiancontactno;
    AarogyaData(String name,
    String age,
    char gender,
    String aadharno,
    String contactno,
    String city,
    String adress,
    String doadmin,
    String guardianname,
    String guardianadress,
    String guardiancontactno)
    {
      this.name=name;
      this.age=age;
      this.gender=gender;
      this.aadharno=aadharno;
      this.contactno=contactno;
      this.city=city;
      this.adress=adress;
      this.doadmin=doadmin;
      this.guardianname=guardianname;
      this.guardianadress=guardianadress;
      this.guardiancontactno=guardiancontactno;
    }
	public String getName() {
		return name;
	}
	
	public String getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getAadharno() {
		return aadharno;
	}
	
	public String getContactno() {
		return contactno;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public String getDoadmin() {
		return doadmin;
	}
	
	public String getGuardianname() {
		return guardianname;
	}
	
	public String getGuardianadress() {
		return guardianadress;
	}
	
	public String getGuardiancontactno() {
		return guardiancontactno;
	}
 public String toString()
    {
      return "Patientname:"+name+"Age:"+age+"gender:"+gender+"Aadharno:"+Aadharno+"Contactno:"+contactno+"City:"+city+"Adress:"+adress+"DateOfAdm:"+doadmin+"Guardianname:"+guardianname+"Guardianadress:"+guardianadress+"Guardiancontactno:"+guardiancontactno;
    }
    
  }