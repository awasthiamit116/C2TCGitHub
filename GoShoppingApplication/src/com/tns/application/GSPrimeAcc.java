package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	public GSPrimeAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
	
	
	public void bookProduct (float charges)
	{
		
	}


	@Override
	public String toString() {
		return "GSPrimeAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
