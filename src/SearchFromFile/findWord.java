
package SearchFromFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.Scanner;

public class findWord {
	 public static void main(String[] args){
	boolean Exit = true;
	File dir = new File("C:\\Users\\user020\\Desktop\\Eclipse\\Solo_Project_School_System-M");
	FilenameFilter textFilter = new FilenameFilter() {
           public boolean accept(File dir,String name){
        	   return name.toLowerCase().endsWith(".txt");
           }
           
	File[] files = dir.listFiles(textFilter);//error
	for(
	File file:files)
	{
		if (file.isDirectory()) {
			System.out.print("directory:");
		} else {
			System.out.print("     file:");
		}
		System.out.println(file.getCanonicalPath());
	}

	File f1 = new File("C:\\Users\\user020\\Desktop\\Eclipse\\Solo_Project_School_System-M\\src\\RandomUserAPI\\APIDocumentation.txt"); // Creation of File Descriptor for input
																				// file
	String[] words = null; // Intialize the word Array
	FileReader fr = new FileReader(f1); // Creation of File Reader object
	BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
	String s;System.out.println("Please Write word to be Search :");
	
	Scanner userScanner = new Scanner(System.in);
	String input = userScanner.next(); // Input word to be searched
	int count = 0; // Intialize the word to zero
	while((s=br.readLine())!=null) // Reading Content from the file
	{
		words = s.split(" "); // Split the word using space

		for (File fileVariablec : files) {
			for (String word : words) {
				if (word.equals(input)) // Search for the given word
				{
					System.out.println("The Word is : \t" + input + "\t the file is :\t " + c);

					count++;

				}
			}
		}
	}

	if(count!=0) // Check for count not equal to zero
	{
		System.out.println("The given word is present for " + count + " Times in the file");

	}else
	{
		System.out.println("The given word is not present in the file");
	}

	System.out.println("If You want to Continue Searching press 1 , If Not Press 0");
	Scanner userScanner2 = new Scanner(System.in);
	int search = userScanner2.nextInt();if(search==0)
	{
		Exit = false;
	}else
	{
		Exit = true;
}

fr.close();
}//error
}//error

