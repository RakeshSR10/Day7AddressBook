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
		//Editing contact
		System.out.println("Enter name to edit:");
		String name = sc.next();
		if(name.equalsIgnoreCase(first_name))
		{
			System.out.println("Enter First Name:");
			first_name = sc.next();
			System.out.println("Enter Last Name:");
			last_name=sc.next();
			System.out.println("Enter City : ");
			city = sc.next();
			System.out.println("Enter State: ");
			state = sc.next();
			System.out.println("Enter Phone Number: ");
			ph_number = sc.next();
			System.out.println("Enter Zip: ");
			zip = sc.next();
			System.out.println("Enter Email: ");
			email = sc.next();
			AddressBook book1 = new AddressBook(first_name,last_name,city,state,ph_number,zip,email);
			ArrayList<AddressBook> alist1 = new ArrayList<AddressBook>();
			alist1.add(book1);
			System.out.println(alist1);
			System.out.println("------------------");
			break;
		}
		else
		{
			System.out.println("Invalid Name...! Re-Enter Name");
			System.out.println("-------------------");
		}
		//Delete existing Contact Details
		System.out.println("Enter Name to Delete :");
		String dtname = sc.next();
		if(dtname.contains(first_name)==true)
		{
			alist.clear();
			System.out.println("Successfully deleted...");
			System.out.println("------------------------");
			break;
		}
		else
		{
			System.out.println("Invalid Name...! Enter valid name to delete");
			System.out.println("--------------------------");
		}
		//Add more contacts
		System.out.println("Add more contacts:");
		System.out.println("Enter First Name:");
		first_name = sc.next();
		System.out.println("Enter Last Name:");
		last_name=sc.next();
		System.out.println("Enter City : ");
		city = sc.next();
		System.out.println("Enter State: ");
		state = sc.next();
		System.out.println("Enter Phone Number: ");
		ph_number = sc.next();
		System.out.println("Enter Zip: ");
		zip = sc.next();
		System.out.println("Enter Email: ");
		email = sc.next();
		AddressBook book2 = new AddressBook(first_name,last_name,city,state,ph_number,zip,email);
		ArrayList<AddressBook> alist1 = new ArrayList<AddressBook>();
		alist1.add(book2);
		System.out.println(alist);
		System.out.println(alist1);
		System.out.println("------------------");
        }
}

