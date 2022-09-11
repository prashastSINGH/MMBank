package com.cg.Application;
import com.cg.framework.SavingAcc;
public abstract class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean issalary) {
		super(accNo, accNm, accBal, issalary);
		
	}
public void withdraw(float accBal) {
	System.out.println("Dear saving acc user, your acc balance is:"  +getAccountBalance());
	
}
@Override
public String toString() {
	return "MMSavingAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
			+ ", getAccountBalance()=" + getAccountBalance() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + "]";
}


}
