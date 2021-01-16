package com.av.labfour.account;

public class CurrentAccount extends AccountServices {
	
	double overdraft = 3000;

	public CurrentAccount(double balance2, float age, String name) {
		super(balance2, age, name);

	}

	@Override
	public void withdrawMoney(double money) {
		boolean flag = false;
		if (money > overdraft) {
			flag = true;
			System.out.println(flag);
		}

		else
			super.withdrawMoney(money);
	}

}
