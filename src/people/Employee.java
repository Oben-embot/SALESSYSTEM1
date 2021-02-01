package people;

import java.util.ArrayList;

import java.util.List;
import goods.Product;

public class Employee extends Person {

	private String userName;
	private int password;
	private double salary;
	private String position;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Employee() {
	}

	public void register(String surname, String lastName, String dateOfBirth, String emailAddress, String race, String gender, String nationality, long idNumber, String userName, int password, double salary,String position) {

		this.setSurname(surname);
		this.setLastName(lastName);
		this.setDateOfBirth(dateOfBirth);
		this.setEmailAddress(emailAddress);
		this.setRace(race);
		this.setGender(gender);
		this.setNationality(nationality);
		this.setIdNumber(idNumber);
		this.setUserName(userName);
		this.setPassword(password);
		this.setSalary(salary);
		this.setPosition(position);

	}// end of register method

	public String toString() {
		System.out.println();
		return "Employee details(\nSurname: " + getSurname() + "\nLastName: " + getLastName() + "\nDate of birth: "
				+ getDateOfBirth() + "\nEmailAddress: " + getEmailAddress() + "\nRace: " + getRace() + "\nGenger: "
				+ getGender() + "\nNationality: " + getNationality() + "\nIdNumber:" + getIdNumber() + "\nUserName: "
				+ getUserName() + "\nPassord: " + getPassword() + "\nSalary: " + getSalary() + "\nPosition: "+ getPosition() + ")";
	}// end of toString method();


	public void scanBarCode(List<Product> products, long barCode) {
                           Product soldProduct = null;
                   for(int i = 0; i < products.size(); i ++){
                     if(barCode == products.get(i).getBarCode()){
             }//end of if statement
      }//end of foor loop

         //    return soldProduct = products.get(i).getBarCode();

}// end of scanBarCode() method.

}//end of class
