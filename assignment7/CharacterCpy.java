package assignment7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterCpy {
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        try (
            BufferedReader in = new BufferedReader(new FileReader(currentDirectory+"/src/assignment7/file/Read.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter(currentDirectory+"/src/assignment7/file/character.txt"));
            ) {
                System.out.println("Copying content:");
                int r;
                while((r=in.read())!=-1) {
                	
                    char ch = (char)r;
                    
                    System.out.print(ch);
                    out.write(ch);
                }
                System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Copy is taken");
    }
}