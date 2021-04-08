import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook 
{

	String first_name,last_name,city,state,ph_number,zip,email;

	public AddressBook(String first_name, String last_name, String city, String state, String ph_number, String zip,String email) 
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.city = city;
		this.state = state;
		this.ph_number = ph_number;
		this.zip = zip;
		this.email = email;
	}
	

	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPh_number() {
		return ph_number;
	}


	public void setPh_number(String ph_number) {
		this.ph_number = ph_number;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "First_name=" + first_name + ", Last_name=" + last_name + ", City=" + city + ", State="
				+ state + ", Phone number=" + ph_number + ", Zip=" + zip + ", Email=" + email;
	}
        public static void main(String[] args)
        {
                System.out.println("Welcome to AddressBook Computation Program");
		System.out.println("Enter First Name:");
		String first_name = sc.next();
		System.out.println("Enter Last Name:");
		String last_name = sc.next();
		System.out.println("Enter City : ");
		String city = sc.next();
		System.out.println("Enter State: ");
		String state = sc.next();
		System.out.println("Enter Phone Number: ");
		String ph_number = sc.next();
		System.out.println("Enter Zip: ");
		String zip = sc.next();
		System.out.println("Enter Email: ");
		String email = sc.next();

		AddressBook book = new AddressBook(first_name,last_name,city,state,ph_number,zip,email);
		ArrayList<AddressBook> alist = new ArrayList<AddressBook>();
		alist.add(book);
		System.out.println(alist);
        }
}

