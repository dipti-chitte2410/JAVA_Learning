package Threads.synchronised;

public class Bank {
    public int balance;
    public Bank(int bankBanlance){
        this.balance=bankBanlance;
    }

    public synchronized int getBalance(){
        return  balance;
    }

    public synchronized void deposit(int amount){
        balance+=amount;
    }
    public synchronized void withdraw(int amount){
        balance-=amount;
    }
}
