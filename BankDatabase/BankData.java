class BankData
  {
    String holder_name;
    String acc_no;
    double balance;
    BankData(String holder_name,String acc_no,double balance)
    {
      this.holder_name=holder_name;
      this.acc_no=acc_no;
      this.balance=balance;
    }
	public String getHolder_name() {
		return holder_name;
	}
	
	public String getAcc_no() {
		return acc_no;
	}
	
	public double getBalance() {
		return balance;
	}
	public String toString()
    {
      return "name:"+holder_name+" acc_no:"+acc_no+" balance:"+balance;
    }
    
  }