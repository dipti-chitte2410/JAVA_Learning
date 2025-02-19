package File;

import java.io.IOException;
import java.io.InputStream;

public class SupressedException implements AutoCloseable{

    public void saySomethind()throws Exception{
        throw new IOException("throw in say something...");
//        System.out.println("Saying...");
    }
    @Override
    public void close() throws Exception {
        throw new IOException("throw in close...");
//        System.out.println("Closing...");
    }

    public static void main(String[] args) {
        try(SupressedException supressedException=new SupressedException()){
            supressedException.saySomethind();
        }catch (Exception e){
            System.out.println(e.getMessage());
            for(Throwable t:e.getSuppressed()){
                System.out.println(t.getMessage());
            }
        }


    }
}
