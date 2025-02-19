package File.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NioPackageEx {
    public static void main(String[] args) {
        // Reading line with BufferedReader
        try (BufferedReader br = Files.newBufferedReader(Paths.get("File/testfile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Read All lines
        try {
            List<String> lines=Files.readAllLines(Paths.get("File/testfile.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    }
