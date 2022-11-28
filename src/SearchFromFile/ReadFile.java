package SearchFromFile;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
	public static void ReadFileFunction() throws Exception {

		// Passing the path to the file as a parameter
		FileReader fileReaderVariable = new FileReader(
				"C:\\Users\\user020\\Desktop\\Eclipse\\Solo_Project_School_System-M\\JSONFileWriter.txt");

		// Declaring loop variable
		int i;
		// Holds true till there is nothing to read
		while ((i = fileReaderVariable.read()) != -1)

			// Print all the content of a file
			System.out.print((char) i);
	}
}
