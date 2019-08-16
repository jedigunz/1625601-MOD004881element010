//***********************************************************************//
//* Author: 1625601                    							        *//
//* Week:                               						        *//
//* Element:    Assignment 1                 						    *//
//* Description: Bank Account 1 							            *//
//*                                                                     *//
//*                                        						        *//
//* Date: 08/08/19                        						        *//
//*                                         						    *//
//***********************************************************************//


package logbooks;
public class BankAccountTest { //start BankAccountTest class

	public static void main(String[] args) { //main 
		
		BankAccount account1 = new BankAccount("Adam Smith", 2700.00); //bank account 1
		BankAccount account2 = new BankAccount("Dave Stevens", -120.00); //bank account 2
	
		System.out.printf("Account Name: %s   Account Balance: %f   Add 100 Balance: %f\nAccount Name: %s   Account Balance: %f   Add 100 Balance: %f\n", //printf method
				account1.getName(),account1.getBalance(),account1.getPayIn(), //print account 1 name, balance & pay in
				account2.getName(),account2.getBalance(),account2.getPayIn() //print account 2 name, balance & pay in
				);
	}
} //end BankAccountTest

class BankAccount { //start BankAccount class
	
	public BankAccount(String name, double balance) {
		setName(name); //sets name
		setBalance(balance); //sets balance
		PayIn(balance); //calls pay in method
	}
	public void PayIn(double deposit) {
		payIn = 100; //pay in 100
		deposit = payIn + deposit; //add 100 to the original balance
		setPayIn(deposit); //sets pay in 
	}

	public double getBalance() {  //get balance
		return balance;
	}
	public void setBalance(double balance) { //set balance
		this.balance = balance;
	}
	public String getName() { //get balance
		return name;
	}
	public void setName(String name) { //set balance
		this.name = name;
	}
	public double getPayIn() { //get balance
		return total;
	}
	public void setPayIn(double total) { //set balance
		this.total = total;
	}
	
	public double balance; //setting variable types
	public String name;
	public double payIn;
	public double deposit;
	public double total;
}//end BankAccount






//import javax.swing.JOptionPane;


/*
int g = -1;

while (g < 0) {

	String name = JOptionPane.showInputDialog("Enter Name");

	if (name.length() > 0) {

		System.out.println("Thanks: " + name);
		
		double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter Balance"));

		if (balance > 0) {
			g++;
			System.out.println("Balance: " + balance);

		} else {
			System.out.println("Balance Too Low");
		}

	} else {
		System.out.println("Re-enter");
	}
}
 */

