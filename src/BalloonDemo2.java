//Author: Redwan Hossain
class Balloon2 {
	// These are the properties of balloons
	private int diameter;
	private String color;
	private double inflationPressure;
	
	// Static variable will count the number of balloons made
	private static int numberOfBalloons = 0;
		
	// This is the constructor for balloons
	public Balloon2(int arg1, String arg2) {	
		diameter = arg1;
		color = arg2;
		inflationPressure = 0;
		numberOfBalloons++;
	}

	// Getters
	public int getDiameter() {
		return diameter;
	}

	public String getColor() {
		return color;
	}

	public static int getNumberOfBalloons() {
		return numberOfBalloons;
	}
	
	public double getInflationPressure() {
		return inflationPressure;
	}

	// Setter
	public void setInflatePressure(double arg) {
		inflationPressure = arg;
	}
	
	// toString
	@Override
	public String toString() {
		return diameter + " inch diameter " + color + " balloon";
	}
}

public class BalloonDemo2 {
	public static void main(String[] args) {
		
		// Create an array of five balloons
		Balloon2[] thing = new Balloon2[5];
		
		// Build balloon objects in the array
		thing[0] = new Balloon2(6, "blue");
		thing[1] = new Balloon2(6, "red");
		thing[2] = new Balloon2(10, "red");
		thing[3] = new Balloon2(2, "purple");
		thing[4] = new Balloon2(25, "white");
		
		// Print a report of the balloons that have been made
		System.out.printf("We made %d balloons:%n", Balloon2.getNumberOfBalloons());
		for(Balloon2 each : thing)
			// Check if the object has been defined before accessing it
			if(each != null)
				System.out.println(each.toString());
		System.out.println();	
		// Query the array and print the results
		System.out.println("Red balloons are available in these sizes:");
		for(Balloon2 each : thing)
			// Check if the object has been defined before accessing it
			if(each != null)
				if(each.getColor().equals("red"))
					System.out.println(each.getDiameter() + " inches");
	}
}