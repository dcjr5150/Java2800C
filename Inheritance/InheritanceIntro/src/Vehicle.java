import java.util.*;

public class Vehicle {
	private String vin;
	private String color;
	private String owner;

	public Vehicle(String vin, String color, String owner) {
		super();
		setVin(vin);
		setColor(color);
		setOwner(owner);
	} // end Constructor

	// Setters and Getters --------------------------
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	// ------------------------------------------------

	@Override
	public String toString() {
		return "\nVehicle [vin=" + vin + ", color=" + color + ", owner=" + owner + "]";
	} // end toString






} // end of class
