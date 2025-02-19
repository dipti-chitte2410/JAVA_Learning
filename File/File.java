package File;

import java.io.*;

public class File {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("File/testfile.txt");
        int data = 0;
        while ((data = reader.read()) >= 0) {
            char charVal = (char) data;
            System.out.print(charVal);
        }
        FileInputStream inputStream = new FileInputStream("File/testfile.txt");
        int count = inputStream.available();
        byte[] b = new byte[count];
        int data2;
        while((data2=inputStream.read(b))>=0){
            System.out.println("data:"+data2);
        }

        writeToFile(new String[]{"Hello","World","Java"});
        readData();
    }


    public static void writeToFile(String[] data) throws IOException {
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("File/testWrite.txt"))){
            for(String s:data){
                bw.write(s);
                bw.newLine();
            }
        }
    }

    public static void readData(){
        try(BufferedReader br=new BufferedReader(new FileReader("File/testWrite.txt"))){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.getMessage();
        }
    }
}
