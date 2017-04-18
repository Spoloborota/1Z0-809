package com.spoloborota.ocp.classes;



interface Account{
	public default String getId(){
		return "0000";
	}
}

interface PremiumAccount extends Account{
	public default String getId() { return Account.super.getId();};
}

public class BankAccount implements PremiumAccount{
	public static void main(String[] args) {
		Account acct = new BankAccount();
		System.out.println(acct.getId());
	}

}

