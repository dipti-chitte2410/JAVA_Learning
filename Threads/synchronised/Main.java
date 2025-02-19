package Threads.synchronised;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        TransactionWorker[] workers = new TransactionWorker[]{new TransactionWorker(new Bank(1000), 'w', 200),
                new TransactionWorker(new Bank(100), 'd', 200),
                new TransactionWorker(new Bank(100), 'w', 900)};
        for (TransactionWorker transactionWorker : workers) {
                executorService.submit(transactionWorker);
            System.out.println(transactionWorker.bank.getBalance());
        }
        executorService.shutdown();
    }
}
