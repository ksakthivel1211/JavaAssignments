package assignment7;

import java.io.File;

public class Listing {
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        File f = new File(currentDirectory+"/src/assignment7");
        
        if(f.isDirectory()) {
            String filesAndDirectories[] = f.list();
            for (String file : filesAndDirectories) {
                System.out.println(file);
            }
        }
        else {
            System.out.println("Given path is not a directory path.");
        }
    }
}