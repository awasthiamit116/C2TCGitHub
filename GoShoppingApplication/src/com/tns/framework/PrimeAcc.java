package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc 
{
	public PrimeAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
	}

	private boolean isPrime;
	
	public void bookProduct(float charges) 
	{
		
	}
	
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
