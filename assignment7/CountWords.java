package assignment7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWords {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the line:");
        
        String line = reader.readLine();
        
        System.out.println("Number of words in given string: "+line.split("\\s+").length);
    }
}