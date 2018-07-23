import java.util.Scanner;

class Cube{
	
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter length:");
		double l = s.nextDouble();
		
		System.out.println("Enter width:");
		double w = s.nextDouble();
		
		System.out.println("Enter height:");
		double h = s.nextDouble();
		
		double vol = l*w*h;
		System.out.println("Corresponding volume of cube:"+vol);
		
		
		
	}
	
	
}