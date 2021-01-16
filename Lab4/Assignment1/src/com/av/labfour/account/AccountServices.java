package com.av.labfour.account;

import com.av.labfour.domain.Person;

public class AccountServices 
{
	private long accNum = System.currentTimeMillis();
	private double balance;
	private Person accHolder;

	public AccountServices(double balance2, float age, String name) {
		accHolder = new Person(age, name);
		this.balance = balance2;

	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	
	public void print() {
		System.out.println("AccountServices [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + 
	accHolder + "]");
	}
	
	public void depositMoney(double money)
	{
		this.balance = this.balance+ money;
		print();
	}
	
	

	public void withdrawMoney(double money) {
		double  bal =	this.balance-money;
		if(bal<0)
			return;
		
		this.balance = this.balance-money;
		print();
		
	}

	
	
		
	}
	

	


