package com.basics1;

public class SavingAccount {
	public static int annuvalInterestRate;
    private double savingsBalance;
    public SavingAccount(double balance) {
   this.savingsBalance=balance;
        
    }
    public void calculateMonthlyInterest()
    {
        double interest=((annuvalInterestRate/100.0)*savingsBalance)/12;
        savingsBalance=savingsBalance+annuvalInterestRate;
    }
    public static void modifyInterestRate(int newValue)
    {
       annuvalInterestRate=newValue;
      
    }
    public void showBalance() {
        System.out.println("balance"+savingsBalance);
    }
    public static void main(String[] args) {
        SavingAccount sb1=new SavingAccount(2000);
        SavingAccount sb2=new SavingAccount(3000);
        SavingAccount.modifyInterestRate(4);
        sb1.showBalance();
        sb2.showBalance();
        sb1.calculateMonthlyInterest();
        sb2. calculateMonthlyInterest();
        SavingAccount.modifyInterestRate(5);
        sb1.showBalance();
        sb2.showBalance();
        sb1.calculateMonthlyInterest();
        sb2. calculateMonthlyInterest();
    }}
	


