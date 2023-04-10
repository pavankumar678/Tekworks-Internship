class EmployeeData
  {
    String name;
    int id;
    double salary;
    EmployeeData(String name,int id,double salary)
    {
      this.name=name;
      this.id=id;
      this.salary=salary;
    }
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public double getSalary() {
		return salary;
	}
    public String toString()
    {
      return "name:"+name+"id:"+id+"salary"+salary;
    }
	      }