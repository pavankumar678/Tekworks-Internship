//Address Book: Create a class called AddressBook that stores a collection of contacts in a HashMap. The class should have methods to add, edit, and delete contacts, as well as to search for a contact by name.
import java.util.*;
class AdressBookData
  {
    int H_no;
    String name;
    String street;
    int pincode;
    AdressBook(int H_no,String name,String street,int pin)
    {
      this.H_no=H_no;
      this.name=name;
      this.street=street;
      this.pincode=pin;
    }
    public int getHno()
    {
      return H_no;
    }
    public String getName()
    {
      return name;
    }
    public String getStreet()
    {
      return street;
    }
    public int getPincode()
    {
      return pincode;
    }
    public String toString()
    {
      return "H_no:"+H_no+"name:"+name+" Street:"+street+" Pincode:"+pincode;
    }
  }
