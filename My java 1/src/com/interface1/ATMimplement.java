package com.interface1;

public class ATMimplement implements ATM
{	
long balance;
ATMimplement(){}
ATMimplement(long balance)
{
this.balance=balance;	
}

public void deposite(long depositeAmount)
{
if(depositeAmount>0)
{
balance=balance+depositeAmount;
System.out.println("Amount "+depositeAmount+" is successfully deposited");
}
else 
	System.out.println("invalid");
}
public long balance()
{
	System.out.println(balance);
	return balance;
}
public void withdrawl(long withdrawlAmount)
{
if(balance>withdrawlAmount)
{
balance=balance-withdrawlAmount;
System.out.println("Amount "+withdrawlAmount+" is successfully withdrawed");
}
else
	System.out.println("insufficient balance");
}
}

