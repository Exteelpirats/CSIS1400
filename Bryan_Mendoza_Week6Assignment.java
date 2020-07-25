//Bryan Mendoza
import java.util.Scanner;
import java.util.Random;

public class Bryan_Mendoza_Week6Assignment {
	public static void main(String[] args) {
		//Main Menu
		int part;
		
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		
		do {
			mainMenu();
			part = input.nextInt();
			switch (part){
				case 1:
					part1();
					break;
				case 2:
					part2();
					break;
				case 3:
					part3();
					break;
				case 4:
					quit = true;
			}
		}while (!quit);
		System.out.println("\nGoodbye!");
		input.close();
	}
		
	private static void mainMenu() {
		System.out.println("\n\n-----------------------------------");
		System.out.println("Week 6 Assignment Main Menu");
		System.out.println("-----------------------------------");
		System.out.println("1: Part 1: for loop");
		System.out.println("2: Part 2: while loop");
		System.out.println("3: Part 3: do-while loop");
		System.out.println("4: Exit");
		System.out.println("-----------------------------------");
		System.out.print("Enter 1, 2, 3 or 4 to Exit: ");
	}
	
	private static void part1() {
		//Part 1
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int min = 0;
		int max = 0;
		int numgen = 0;
		int count = 0;
		int sum = 0;
		
		System.out.println("\n\n\n---------------------------------------------------------------------");		
		System.out.println("Part 1: for loop: Average of randomly generated integers");	
		System.out.println("---------------------------------------------------------------------");
			System.out.print("Enter the bottom number of the range: ");	
			min = input.nextInt();
			System.out.print("Enter the top number of the range: ");	
			max = input.nextInt();
			System.out.print("Enter How Many Numbers to Generate: ");	
			numgen = input.nextInt();
			System.out.print("Generated Random Numbers: ");
		for (int i = 1; i<= numgen; i++ ) {
			int gennum = rand.nextInt((max-min) + 1) + min;
				System.out.print(gennum + " ");	
				sum = sum + gennum;
				count++;
		}
		if(count > 0) {
		System.out.println("\nAverage of generated numbers: " + (sum/count));
		}
		System.out.println("---------------------------------------------------------------------");
	}
	
	private static void part2() {
		//Part 2
		Scanner input = new Scanner(System.in);
		int number;
		int sum = 0;
		int counter = 0;
		System.out.println("\n\n\nPart 2: while loop: Average of user-entered integers using While loop");
		System.out.println("--------------------------------------------------------------------- ");
		System.out.println("Enter integers to average. Enter -1 to finish.");
		System.out.print("Entry 1: ");
		number = input.nextInt();
		while (number != -1)
		{
			sum = sum + number;
			counter++;
			System.out.print("Entry 2: ");
			number = input.nextInt();
		}
		System.out.println("\nNumber of entries: "+ counter);
		System.out.println("Average of user-entered numbers: " + (sum/counter));
	}
	
	private static void part3() {
		//Part 3
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		int choice;
		
		System.out.println("\n\n\nPart 3: do-while loop: Display menu until user chooses to exit");
		System.out.println("---------------------------------------------------------------------");
		do {
			part3displayMenu();
			choice = input.nextInt();
			switch (choice){
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					quit = true;
			}
		} while (!quit);
		System.out.println("Goodbye!");
	}	
	
	private static void part3displayMenu() {
		System.out.println("==============================");
		System.out.println("MENU");
		System.out.println("==============================");
		System.out.println("1: Choice 1");
		System.out.println("2: Choice 2");
		System.out.println("3: Choice 3");
		System.out.println("4: Exit");
		System.out.println("==============================");
		System.out.print("Enter 1, 2, 3 or 4 to Exit: ");
	}
}

