package com.cg.client;
import com.cg.Application.MMBankFactory;
import com.cg.Application.MMCurrentAcc;
import com.cg.Application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;
public class client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(001,"Prashast",60000,true);
		CurrentAcc ca = new MMCurrentAcc(002,"SinghPrashast",10000,1000);
		sa.deposit(sa.getAccountBalance());
		ca.deposit(ca.getAccountBalance());
		sa.toString();
		System.out.println(sa);
		ca.toString();
		System.out.println(ca);
		
	}

}
