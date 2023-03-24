package assignment7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
    public static void main(String[] args) {
        byte[] buffer = new byte[512];
        String currentDirectory = System.getProperty("user.dir");
        System.out.println(currentDirectory);
        try (
            FileInputStream in = new FileInputStream(currentDirectory+"/src/assignment7/file/nadine-shaabana-1112616-unsplash.png");
            FileOutputStream out = new FileOutputStream(currentDirectory+"/src/assignment7/file/imageCopy.png");
            ) 
        {
                System.out.println("Copying image: ");
                while(in.read(buffer)!=-1) {
                    out.write(buffer);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Image copied successfully!");        
    }
}