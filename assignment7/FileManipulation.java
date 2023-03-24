package assignment7;

import java.io.File;

public class FileManipulation {
	public static void main(String[] args) {

		String fileDir = System.getProperty("user.dir") + "/src/assignment7/file/";

		File file = new File(fileDir + "rename.txt");
		File renameFile = new File(fileDir + "named.txt");
		boolean flag = false;
		if (file != null) {
			long fileSize = file.length();
			System.out.println("Size of the file: " + fileSize + " bytes");

			if (!renameFile.exists())
				flag = file.renameTo(renameFile);

			if (flag) {
				System.out.println("File renamed successfully!");
				flag = renameFile.delete();
			}

			if (!flag)
				System.out.println("Unable to delete file");
		}
	}
}