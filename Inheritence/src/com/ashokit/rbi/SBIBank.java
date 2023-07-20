package com.ashokit.rbi;

class RBIBank{
	
	boolean checkEligibility() {
		//docs verification logic
		return true;
	}
	double getHomeLoanRofi() {
		return 11.8;
	}
	double getPersonalLoanRofi() {
		return 10.65;
	}
}



public class SBIBank extends RBIBank {
	//in this scenario parent class implementation not interested,Overridden the 
	//same method with its own logic
	double getHomeLoanRofi() {
		return 13.8;
	}
	
	public String applyHomeLoan() {
		boolean status = checkEligibility();//parent method
		//this checkEligibility shows took the parent method 
		//interested in parent class implementation method
		if(status) {
		double homeLoanRofi	=getHomeLoanRofi();
			String msg="Your loan approved with RI as ::"+ homeLoanRofi;
			return msg;
		}else {
			return "Your are not eligible for home loan";
			
		}
		
	}
	public static void main(String[] args) {
		SBIBank bank=new SBIBank();
		String msg = bank.applyHomeLoan();
		System.out.println(msg);
	}
	

}
