package com.atm;

public class  Functions{
    long currentBalance=20000;
    int transferredAmount=0;
    String password="123";
    boolean authenticated =false;
    public static void main(String[] args){
    }
    public Boolean verifyID(String pass) {

        if(pass.equals(password)){
            return true;
        }
        return false;
    }
    public boolean cashWithdrawal(int amount){
        if(amount<currentBalance){
            currentBalance=currentBalance-amount;
            return true;
        }
        return false;
    }
    public void cashDeposit(int amount){
        currentBalance=currentBalance+amount;
    }
    public boolean cashTransfer(int amount){
        if(amount<currentBalance){
            currentBalance=currentBalance-amount;
            transferredAmount+=amount;
            return true;
        }
        return false;
    }
}