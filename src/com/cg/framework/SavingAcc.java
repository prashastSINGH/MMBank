package com.cg.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean issalary;
	private static final float creditLimit = 0;
	
	
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean issalary) {
		super(accNo, accNm, accBal);
		this.issalary = issalary;
	}
	
	public void withdraw(float accBal) {
		System.out.println("your withdraw are "  +accBal);
	}

	@Override
	public String toString() {
		return "SavingAcc [issalary=" + issalary + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccountBalance()=" + getAccountBalance() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}


}
