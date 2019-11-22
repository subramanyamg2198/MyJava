package com.interface1;

public class ATMmachine {
	public static void main(String[] args) {
		ATM atm=new ATMimplement();
		atm.deposite(100000);
		atm.balance();
		atm.withdrawl(500);
		System.out.println("Thank you");
		

}
}