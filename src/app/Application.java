package app;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import goods.Product;
import people.Employee;
import people.Suplier;

public class Application {

	static int post = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Employee> employees = new ArrayList<Employee>(4);
		List<Product> products = new ArrayList<Product>(4);
		List<Suplier> supliers = new ArrayList<Suplier>(4);


		Employee employee = null;
		Product product = null;
		Suplier suplier = null;

		for (int i = 0; i < 100; i++) {
			System.out.println();
			System.out.println("Welcom to Shoprite.");
			System.out.println("Select from the Options below.");
			System.out.println("1. register");
			System.out.println("2. login");

			int option = scan.nextInt();

			if (option == 1) {
				employee = new Employee();
				System.out.println("\nFor Employee to Register.");
				scan.nextLine();
				System.out.println("Eneter surname: ");
				String surname = scan.nextLine();
				System.out.println("Enter last name: ");
				String lastName = scan.nextLine();
				System.out.println("Enter date Of Birth: ");
				String dateOfBirth = scan.nextLine();
				System.out.println("Enter emailAddress: ");
				String emailAddress = scan.nextLine();
				System.out.println("Enter race: ");
				String race = scan.nextLine();
				System.out.println("Enter gendar: ");
				String gender = scan.nextLine();
				System.out.println("Enter nationality: ");
				String nationality = scan.nextLine();
				System.out.println("Enter idNumber: ");
				long idNumber = scan.nextLong();
				scan.nextLine();
				System.out.println("Enter userName:  ");
				String userName = scan.nextLine();
				System.out.println("Enter password: ");
				int password = scan.nextInt();
				System.out.println("Enetr Salary: ");
				double salary = scan.nextDouble();
				scan.nextLine();
				System.out.println("Enter Position");
				String position = scan.nextLine();

				employee.register(surname, lastName, dateOfBirth, emailAddress, race, gender, nationality, idNumber,
						userName, password, salary, position);
				employees.add(employee);
				System.out.println(employee);
			} // end of first if statement;
			else if (option == 2) {
				System.out.println("\nFor Employee to login: ");
				scan.nextLine();
				System.out.println("Enter userName: ");
				String userName = scan.nextLine();
				System.out.println("Enetr password: ");
				int password = scan.nextInt();
				for (int a = 0; a < employees.size(); a++) {
					if (userName.equalsIgnoreCase(employees.get(a).getUserName())
							&& password == employees.get(a).getPassword()
							&& employees.get(a).getPosition().equalsIgnoreCase("manager")) {
						System.out.println("login Successfull. Welcome, "+ employees.get(a).getSurname());
						LogoutManager: for (;;) {

							// another loop
							System.out.println("\n         Select from Options below.");
							System.out.println("\n          1. Add stock");
							System.out.println("\n	    	2. Aviable stock");
							System.out.println("\n          4. View sold items");
							System.out.println("\n          5. exit");
							System.out.println("\n          6. logout");
							int choice = scan.nextInt();


							if (choice == 1) {
								// employee = new Employee();
								product = new Product();
								scan.nextLine();
								System.out.println("To Add Product.");

								System.out.println("Enter Name: ");
								String name = scan.nextLine();
								System.out.println("scan bar code: ");
								long barCode = scan.nextLong();
								System.out.println("Enter price: ");
								double price = scan.nextDouble();
                                                                scan.nextLine();
                                                                System.out.println("Enter Manufactured date: ");
                                                                String manufacturedDate = scan.nextLine();
                                                                System.out.println("Enter Expiring date: ");
                                                                String expiringDate = scan.nextLine();
                                                                System.out.println("Enter Type: ");
                                                                String type = scan.nextLine();
								product.addStocks(name, barCode, price, manufacturedDate, expiringDate, type);
								products.add(product);

								System.out.println(product);

								System.out.println();// To create space.

							} // end of if block for add stock method();

							else if (choice == 2) {
                                                         System.out.println("Aviable Product.");
								product = new Product();

								product.avaliableStocks(products);
								System.out.println();
							} // else of else if block for purchase.

							else if (choice == 5) {
								System.exit(0);
							} // end of if block for exit method();

							else if (choice == 6) {
								break LogoutManager;
							}//end of block to lockout
						} // lockout loop ends here for manager

					} else if (userName.equalsIgnoreCase(employees.get(a).getUserName())
							&& password == employees.get(a).getPassword()
							&& employees.get(a).getPosition().equalsIgnoreCase("teller")) {
                                           System.out.println("login Successful. Welcome, " + employees.get(a).getSurname());
                                                             System.out.println();
                                                       
                                           LogoutTeller: for(;;){

                                         		System.out.println("1. Scan Product");
							System.out.println("2. Continue to Payment");
                                                        System.out.println("3.  logOut Teller");

                                                         System.out.println();
                                                 int scannerOption = scan.nextInt();

                                                if(scannerOption == 1){
                                                   System.out.println("Option to scan Product.");
                                                   System.out.println("Enter BarCode Number: ");
                                                   long barCode = scan.nextLong();
                                                  employee.scanBarCode(products, barCode);

                               }//end of method for scan product();

                                              /*  else if(scannerOption == 3){
                                                   break logoutTeller;
                     }//end of else if block for logOutTeller;*/

      }//logOut loop ends here for teller;


					} else {

					}
 
					System.out.println("login Unsucessfull.");
					break;
				} // end of if statement for login method

			} // end of for loop to declear employees length.

		} //// end of if block for option 2.

	} // end of main for loop

}// end of main method();

//}// end of class
