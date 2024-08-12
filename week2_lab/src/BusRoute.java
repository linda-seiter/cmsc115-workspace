
public class BusRoute {

	public static void main(String[] args) {
		//Variable declaration and initialization
		int passengers = 0;
		int busStop = 0;
		System.out.println("Bus begins its route");
		
		
		//first stop, 7 people get on 
		busStop++;
		System.out.println("7 people get on at stop#" + busStop);
		passengers += 7;
		System.out.println("Departing stop#" + busStop + " with " + passengers + " passengers");
		
		//next stop, 5 get off, 2 get on
		busStop++;
		System.out.println("5 people get off at stop#" + busStop);
		passengers -= 5;
		System.out.println("2 people get on at stop#" + busStop);
		passengers += 2;
		System.out.println("Departing stop#" + busStop + " with " + passengers + " passengers");
		
		//TODO: next stop, 3 get off, 8 get on
		busStop++;
		System.out.println("3 people get off at stop#" + busStop);
		passengers -= 3;
		System.out.println("8 people get on at stop#" + busStop);
		passengers += 8;
		System.out.println("Departing stop#" + busStop + " with " + passengers + " passengers");
		
				
	}

}
