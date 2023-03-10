package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        // minimum balance is 0 by default
        super(name ,balance , 0);
        this.maxWithdrawalLimit = maxWithdrawalLimit;
        this.rate = rate;

    }

    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
        try
        {
            if(maxWithdrawalLimit < amount)
            {
                System.out.println("maximum Withdrawn limit exits");
            }
            else
            {
                throw new Exception("Could not Withdraw: Insufficient balance.");
            }
        }
        catch(Exception bae)
        {
            bae.printStackTrace();
        }

    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
//        Simple Interest = Principal x Interest Rate x Time
        return  getBalance()*getRate()*years;
    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
        double principal = getBalance();
//        double    interest = principal * (Math.pow((1 + rate/100), (times * years))) - principal;
        return  principal * (Math.pow((1 + getRate()/100), (times * years))) + principal;
    }

    public double getRate() {
        return rate;
    }

    public double getMaxWithdrawalLimit() {
        return maxWithdrawalLimit;
    }
}
