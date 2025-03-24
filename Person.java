package a;

public class Person {
String name;
long phoneNumber;
String address;
//Constructor
Person(String name, long phoneNumber, String address){ //All fields set to given parameters
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.address = address;
	}
//Default constructor
public Person() {
    this.name = ""; //All fields set set to empty characteristics
    this.address = "";
    this.phoneNumber = 0;
}
//Mutator (Setter) Methods
public void setName(String name) {
    this.name = name;
}

public void setAddress(String address) {
    this.address = address;
}

public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
}

// Accessor (Getter) Methods
public String getName() {
    return name;
}

public String getAddress() {
    return address;
}

public long getPhoneNumber() {
    return phoneNumber;
}
}
 
