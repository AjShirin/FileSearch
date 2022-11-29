package SearchFromFile;

import java.util.Scanner;

public class SearchingMainRun {

	static void userChoiceFunction() {

		System.out.println("_________Main Menue_________________");
		System.out.println("Welcome...Please Select one of the following options:");
		System.out.println("1. Read file");
		System.out.println("2. Search Words from file");
		System.out.println("3. Creat a Directory");
		System.out.println("4. Exit the system ");
		System.out.println("___________________________________");
	}

	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		userChoiceFunction();

		do {
			int userChoiceInput = sc.nextInt();
			switch (userChoiceInput) {
			case 1:
				ReadFile ReadFileObject = new ReadFile();
				ReadFileObject.ReadFileFunction();
				userChoiceFunction();

				break;

			case 2:
				findWord findWordObject = new findWord();
				findWordObject.searchWordFunction();
				userChoiceFunction();

				break;

			case 3:

				break;

			case 4:
				System.out.println("Exiting The System Bye See you Again :)!....");
				System.exit(0);

				break;

			}
		} while (true);

	}
}
