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

    public double getBalance() {
        return balance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
        if(sum >= 0 && sum <= 90){
            // 37 --> 9 + 9 + 9 + 9 + 1
            return "99991";
        }
        else{
            return "Account Number can not be generated";
        }

//        return null;
    }

    public void deposit(double amount) {
        //add amount to balance
            balance = balance + amount;
    }


    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        if( amount < balance){
            Exception e;
        }
        else {
            balance = balance - amount;
        }
        try {

        }
        catch ( Exception e){

        }

    }

}