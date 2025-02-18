package Threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

class Adder implements Callable<Integer> {
    String file;

    Adder(String file){
        this.file=file;
    }
    public int doAdd() throws IOException {
        int total=0;
        String line=null;
        try(BufferedReader reader= Files.newBufferedReader(Paths.get("Threads/files/"+file))){
            while((line=reader.readLine())!=null){
                total+=Integer.parseInt(line);
            }
        }
        return total;
    }

    @Override
    public Integer call() throws Exception {
        return doAdd();
    }
}