package assignment7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LineCopy {
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        try (
            BufferedReader in = new BufferedReader(new FileReader(currentDirectory+"/src/assignment7/file/Line.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter(currentDirectory+"/src/assignment7/file/lineCopy.txt"));
            ) {
                String content;
                System.out.println("Copying contents: ");
                while((content=in.readLine())!=null) {
                    System.out.println(content);
                    out.write(content+"\n");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Contents copied successfully!!");
    }
}