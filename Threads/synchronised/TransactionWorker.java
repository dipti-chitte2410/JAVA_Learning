package Threads.synchronised;

public class TransactionWorker implements Runnable{
    protected Bank bank;

    protected char xType;

    protected  int amt;

    TransactionWorker(Bank bank,char xType,int amout){
        this.bank=bank;
        this.xType=xType;
        this.amt=amout;
    }

    @Override
    public void run() {
        if(xType=='d'){
            bank.withdraw(amt);
        }
        // todo without synchronised
        if(xType=='w'){
            bank.deposit(amt);
            if(bank.getBalance()>500){
                int bonus=(int)((bank.getBalance()-500)*0.1);
                bank.deposit(bonus);
            }
        }

        // after synchronised
        synchronized (bank){
            if(xType=='w'){
                bank.deposit(amt);
                if(bank.getBalance()>500){
                    int bonus=(int)((bank.getBalance()-500)*0.1);
                    bank.deposit(bonus);
                }
            }
        }
    }
}
