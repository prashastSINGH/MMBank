package com.cg.Application;
import com.cg.framework.CurrentAcc;
public abstract class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

	public void withdraw(float creditLimit) {
		System.out.println("Dear current Acc user, your Limit are:" +getcreditLimit());
	}
	
	@Override
	public String toString() {
		return "MMCurrtenAcc [getcreditLimit()=" + getcreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccountBalance()="
				+ getAccountBalance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
