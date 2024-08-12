import java.util.Scanner;

public class SeafoodMarket {
	
	public static void main(String[] args) {
		//Declare and initialize Scanner to read user input
		Scanner input = new Scanner(System.in);
		
		//TODO: Update to prompt for pounds of fish and price per pound
		System.out.print("Enter pounds of fish and price per pound: ");
		int lbsFish = input.nextInt();
		double pricePerPound = input.nextDouble();
		
		//Calculate cost
		double totalCost = lbsFish * pricePerPound;
		//Round to 2 digits after decimal point
		//totalCost = (int)(totalCost * 100) / 100;
		
		//Output cost
		System.out.println(lbsFish + " lbs at $" + pricePerPound + " per lb = $" + totalCost );
	
	}

}
