package SearchFromFile;

import java.io.*;
import java.util.Scanner; 

public class CreateDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanInputUser = new Scanner(System.in);
		//String scanInputUser = nextLine();
		
		// specify an abstract pathname in the File object 
		File f = new File("C:\\Users\\user020\\Desktop\\Eclipse\\FileSearch\\" + scanInputUser); 

		// check if the directory can be created 
		// using the specified path name 
		if (f.mkdir() == true) { 
			System.out.println("Directory has been created successfully"); 
		} 
		else { 
			System.out.println("Directory cannot be created"); 
		} 
	} 
} 