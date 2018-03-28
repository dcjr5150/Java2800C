import java.util.*;

public class Cycle extends Vehicle {
	private int numberWheels;

	public Cycle(String vin, String color, String owner,
			int numberWheels) {
		super(vin, color, owner);
		setNumberWheels(numberWheels);
	} // end constructor

	// Setters and Getters ===============================
	public int getNumberWheels() {
		return numberWheels;
	}

	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
	}
	// ===================================================

	@Override
	public String toString() {
		String result = super.toString();
		result += "\nCycle [numberWheels=" + numberWheels + "]";
		return result;
	} // end toString



} // end of class
