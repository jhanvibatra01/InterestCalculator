package com.tw;

class BharatBank {
    private int accountBalance;
    private final String accountType;

    BharatBank(int accountBalance, String accountType) {
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public double getInterest() {
        int savingsAccountInterest = 3;
        int currentAccountInterest = 0;
        double duration = 0.25;
        int interestRate = ((this.accountType.equals("current")) ? currentAccountInterest : savingsAccountInterest);
        return (double) this.accountBalance * interestRate * duration / 100;
    }

    public void depositMoney(int deposit) {
        this.accountBalance = this.accountBalance + deposit;
    }

    public void withdrawMoney(int withdraw) {
        this.accountBalance = this.accountBalance - withdraw;
    }
}

public class InterestCalculator {
    public static void main(String[] args) {
        BharatBank gopalAccount = new BharatBank(50000, "current");
        BharatBank amritaAccount = new BharatBank(100000, "savings");
        gopalAccount.depositMoney(10000);
        amritaAccount.withdrawMoney(45000);
        
        System.out.println("Amrita will get: " + amritaAccount.getInterest());
        System.out.println("Gopal will get: " + gopalAccount.getInterest());
    }
}
