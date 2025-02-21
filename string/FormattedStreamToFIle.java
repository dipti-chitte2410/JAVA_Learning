package string;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;

public class FormattedStreamToFIle {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter= Files.newBufferedWriter(Paths.get("string/testfile.txt"));
        try(Formatter f=new Formatter(bufferedWriter)){
            f.format("My name is %s and I am %d years old","David",17);
            f.format("\nMy name is %s and I am %d years old and Average age is %.1f","Dawson",15,123.44455);
        }
    }
}
