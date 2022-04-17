package entities;

public class Contato {

	public String firstName;
	public String lastName;
	public String address;
	public int phoneNumber;
	public String emailAddress;

    public void setFirstName(String input){
        this.firstName = input;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String input){
        this.lastName = input;
    }
    public String getLastName(){
        return lastName;
    }

    public void setAddress(String input){
        this.address = input;
    }
    public String getAddress(){
        return address;
    }

    public void setPhoneNumber(String input){
        this.phoneNumber = input;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setEmailAddress(String input){
        this.emailAddress = input;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    
    void displayContact(){
        System.out.println(" First Name:" + firstName + " Last Name:" + lastName);
        System.out.println("Address:" + address);
        System.out.println("Phone Number:" + phoneNumber);
        System.out.println("Email Address:" + emailAddress);
    }
}
