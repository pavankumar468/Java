package scalaratm;

abstract class parentAccount {
    abstract int setCustomerNumber (int customerNumber);
    abstract int getCustomerNumber();
    abstract int setPinNumber(int pinNumber);
    abstract int getPinNumber();
    abstract double getCurrentBalance();
    abstract double getSavingBalance();
    abstract double calcCurrentWithdraw(double amount);
    abstract double calcSavingWithdraw(double amount);
    abstract double calcCurrentDeposit(double amount);
    abstract double calcSavingDeposit(double amount);
    abstract void getCurrentWithdrawInput();
    abstract void getsavingWithdrawInput();
    abstract void getCurrentDepositInput();
    abstract void getSavingDepositInput();
}
