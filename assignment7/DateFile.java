package assignment7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class DateFile {
    public static void main(String[] args) throws ClassNotFoundException {
        Date dateObj = new Date();
        String currentDirectory = System.getProperty("user.dir");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(currentDirectory+"/src/assignment7/file/date.dat"))) {
            System.out.println("Writing date: "+dateObj);
            out.writeObject(dateObj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(currentDirectory+"/src/assignment7/file/date.dat"))) {
            dateObj = (Date) in.readObject();
            System.out.println("Date from file: "+dateObj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}