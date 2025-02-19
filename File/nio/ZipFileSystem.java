package File.nio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZipFileSystem {

    public static void main(String[] args) {
        String[] arr = new String[]{"Hello", "World", "Java"};
        try (FileSystem zips = openZip(Paths.get("File/zipFile.zip"))) {
            copyToZip(zips);
            writeTOZip(zips, arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static FileSystem openZip(Path zipPath) throws URISyntaxException, IOException {
        Map<String, String> providerProps = new HashMap<>();
        providerProps.put("create", "true");
        URI zipUri = URI.create("jar:file:" + zipPath.toUri().getPath());
        FileSystem zipFs = FileSystems.newFileSystem(zipUri, providerProps);
        return zipFs;
    }

    private static void copyToZip(FileSystem zipFs) throws IOException {
//        Path sourceFile = Paths.get("File/testfile.txt");
        Path sourceFile = FileSystems.getDefault().getPath("File/testfile.txt");
        Path destFile = zipFs.getPath("copiedFile.txt");
        Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
    }

    private static void writeTOZip(FileSystem zipFs,String [] data) throws IOException {
        Files.write(zipFs.getPath("newFile.txt"), Arrays.asList(data), StandardOpenOption.CREATE);
    }
    private static void writeTOZip2(FileSystem zipFs,String [] data) throws IOException {
        try(BufferedWriter bw=Files.newBufferedWriter(zipFs.getPath("newFile2.txt"))){
            for(String s:data){
                bw.write(s);
                bw.newLine();
            }
        }
    }
}
