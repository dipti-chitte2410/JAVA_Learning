package Threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread {
    public static void main(String[] args) {
        String [] infiles={"abc.txt","abc1.txt"};
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        Future<Integer>[] results=new Future[infiles.length];

        for(int i=0;i<infiles.length;i++){
            Adder adder=new Adder(infiles[i]);
            results[i]=executorService.submit(adder);
        }

        for(Future<Integer> future:results){
            try {
                System.out.println(future.get());
            }catch (ExecutionException | InterruptedException e){
                System.out.println("Error...");
            }
        }
    }
}
