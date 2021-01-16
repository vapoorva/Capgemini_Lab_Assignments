package com.av.labfour.main;

import com.av.labfour.account.AccountServices;
import com.av.labfour.account.CurrentAccount;
import com.av.labfour.account.SavingsAccount;
public class Main {
public static void main(String[] args) {
	
	AccountServices account = new AccountServices(2000, 22f , "Smith");
	AccountServices account2 = new AccountServices(3000,25f , "kathy");
	
	System.out.println(account + "\n" + account2);
	account.depositMoney(2000);
	account2.withdrawMoney(2000);
	
	SavingsAccount sv = new SavingsAccount(200, 65f,"manoj");
	sv.withdrawMoney(400);

	CurrentAccount cv = new CurrentAccount(8000, 32f, "suraj");
	cv.withdrawMoney(7500);
}
}
