package a;

public class Main {

	public static void main(String[] args) { 
		Customer customer = new Customer("Liam", 7328919082L, "18 Bridge Dr.", 109, true); //Object instantiation with sample data
		System.out.print(customer.getDetails()); //Calls method from the Customer class which returns all of the objects data in string format

	}

}
/* 
Example output
Customer Details:
Name: Liam
Phone Number: 7328919082
Address: 18 Bridge Dr.
Customer Number: 109
Mailing List: Yes
*/