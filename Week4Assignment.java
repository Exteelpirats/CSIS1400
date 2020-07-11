//Bryan Mendoza
import java.util.Scanner;

public class Week4Assignment {

	public static void main(String[] args) {
		//This code will allow you to enter the dimensional values in order to find the surface and volume of a box.
		
		double length;
		double height;
		double width;
		
		System.out.print("This program will accept a length, width and height of a box, \n");
		System.out.print("and then it will report the surface area and volume of it.\n\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("    " + "Enter the box length : ");
		length = input.nextDouble();
       		System.out.print("    " + "Enter the box height : ");
		height = input.nextDouble();
       		System.out.print("    " + "Enter the box width: ");
       		width = input.nextDouble();
        	calculateArea(length, height, width);
       		input.close();
	}
     public static double calculateArea(double length, double height, double width) {
    	
    		double SurfaceArea = (2 * (length * width + length * height + width * height));
    		double Volume = (length * width * height);
        	System.out.printf("\nThe surface area of your rectangle is: %,.2f%n", SurfaceArea);
       		System.out.printf("The volume of your rectangle is: %,.2f%n", Volume);
		return Volume;
        
	}
}
