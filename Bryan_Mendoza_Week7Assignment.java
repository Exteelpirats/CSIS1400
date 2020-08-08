/*Bryan Mendoza  
 * This program will run a football simulation scores and allow you to generate scores using random numbers stored in two dimensional arrays.   
 */
import java.util.Scanner;
import java.util.Random;

public class Bryan_Mendoza_Week7Assignment{
	public static void main(String []args){
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int teams = 0;
		int games = 0;
		int topTeam = 0;
		int min = 0;
		int max = 99;
		
		printLine(65);
		System.out.println("Football Team Randomized Season Scores");        
		printLine(65);       
		System.out.print("Enter the number of teams: ");    
		teams = input.nextInt();        
		System.out.print("Enter the number of games: ");   
		games = input.nextInt();
		printLine(65); 
		printHeader(); 
		int[][] x = new int[teams][games];						//I chose to do a 2 dimensional array in this particular line. 
		for (int i = 0; i < teams; i++) { 						//It takes two user inputs, "Teams" and "Games" and stores it to be used later on in the code.
			for (int j = 0; j < games; j++) {
				x[i][j] = random.nextInt((max-min) + 1) + min;
				}
			} 
		for (int i = 0; i < teams; i++) {
			System.out.print((i + 1) + ":\t");
			int count = 0;
			int total = 0;
			int average = 0;
			for (int j = 0; j < games; j++) {							
					String zeros = String.format("%02d" , x[i][j]);
					System.out.print(zeros + " ");
					count++;
					total = total + x[i][j];
					average = (total/count);
			}
			System.out.print("\t" + total);
			System.out.print("\t" + average);
			System.out.println();
			} 
		printFooter(topTeam);
	}
	private static void printHeader(){
		System.out.println("\n\n"); 
		printLine(65);
		System.out.println("Football Scores Report");        
		printLine(65);       
		System.out.println("Team" + "\tScores" + "\t\t\t\tTot" + "\tAvg");
		printLine(65);
    }
	private static void printFooter(int topTeam){
        printLine(65);       
        System.out.printf("Top Team: Team " + topTeam + "\n");
        printLine(65);
    }
	private static void printLine(int dashes){
        for (int i = 1; i <= dashes; i++){
            System.out.print("-");
        }
        System.out.print("\n");
    }
}
