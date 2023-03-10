package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;


    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
//        if(sum >= 0 && sum <= 90){
//            // 37 --> 9 + 9 + 9 + 9 + 1
//            return "99991";
//        }
//        else{
//            return "Account Number can not be generated";
//        }
        int s=0;
        while(digits !=0){
            int digit=digits%10;
            s+=digit;
            digits=digits/10;
        }
        if(s!=sum){
            throw new Exception("Account Number can not be generated");
        }

        return String.valueOf(digits);

//        return null;
    }

    public void deposit(double amount) {
        //add amount to balance

        this.balance += amount;
        System.out.println("You have deposit " +amount +" to your account." + "\n" +
                "Balance is now: " +this.balance);
    }


    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        try
        {
            if(balance >= amount)
            {
                balance = balance - amount;
                System.out.println("Amount Withdrawn");
            }
            else
            {
                throw new Exception("Insufficient Amount : Could not Withdraw");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}