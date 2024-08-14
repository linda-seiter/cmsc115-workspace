
public class WeeklyPay {

	public static void main(String[] args) {
		//Declare and initialize constant
		final double HOURLY_RATE = 18.50;
		
		//Declare and initialize variables
		int week = 1;
		int hours = 35;
		double pay = hours * HOURLY_RATE;
		
		//Print variable values
		System.out.println("Week: " + week + " hours: " + hours + " pay: $" + pay);
		
		//Update variables: Week 2, 40 hours worked
		week = 2;
		hours = 40;
		//Recalculate pay
		pay = hours * HOURLY_RATE;
		//Print updated variable values
		System.out.println("Week: " + week + " hours: " + hours + " pay: $" + pay);
				
		
		//TODO: Week 3, 38 hours worked, recalculate pay and print updated variable values
		week = 3;
		hours = 38;
		pay = hours * HOURLY_RATE;
		System.out.println("Week: " + week + " hours: " + hours + " pay: $" + pay);
				
	}

}
