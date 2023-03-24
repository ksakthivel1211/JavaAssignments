package assignment7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        try (BufferedReader in = new BufferedReader(new FileReader(currentDirectory+"/src/assignment7/file/Read.txt"))) {
            String content;
            System.out.println("Reading Contents:");
            while((content=in.readLine())!=null)
                System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Content read successfully");
    }
}