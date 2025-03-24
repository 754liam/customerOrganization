package a;

public class Customer extends Person {
    private int customerNumber; // Field for customer number
    private boolean mailingList; // Field for mailing list preference

    // Constructor with all fields
    public Customer(String name, long phoneNumber, String address, int customerNumber, boolean mailingList) {
        super(name, phoneNumber, address); // Call the Person constructor
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    // Default constructor
    public Customer() {
        super(); // Call the default constructor of Person
        this.customerNumber = 0; // Default value for customer number
        this.mailingList = false; // Default value for mailing list
    }

    // Mutator (Setter) Methods
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    // Accessor (Getter) Methods
    public int getCustomerNumber() {
        return customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }
    public String getDetails() { //Method for returning all customer data in String format. Calls methods from the superclass and fields from the customer class.
        return "Customer Details:\n" +
               "Name: " + getName() + "\n" +
               "Phone Number: " + getPhoneNumber() + "\n" +
               "Address: " + getAddress() + "\n" +
               "Customer Number: " + customerNumber + "\n" +
               "Mailing List: " + (mailingList ? "Yes" : "No");
    }
}
    	
    	
    	
    