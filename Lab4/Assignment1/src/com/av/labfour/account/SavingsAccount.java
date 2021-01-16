package com.av.labfour.account;

public class SavingsAccount extends AccountServices{
	final double minimunBalance = 500;

	public SavingsAccount(double balance2, float age, String name) {
		super(balance2, age, name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void withdrawMoney(double money) {
		double bal = super.getBalance();
		if(bal>500)
		super.withdrawMoney(money);
		else
			System.out.println("Balance less than 500!!");
	}
	

}
