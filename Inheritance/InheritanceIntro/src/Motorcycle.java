import java.util.*;

public class Motorcycle extends Cycle {
	private String make;
	private String terrainType;
	private int engineCC;
	private String driveType;

	public Motorcycle(String vin, String color, String owner,
			int numberWheels, String make, String terrainType,
			int engineCC, String driveType) {
		super(vin, color, owner, numberWheels);
		this.make = make;
		this.terrainType = terrainType;
		this.engineCC = engineCC;
		this.driveType = driveType;
	}
	public String getMake() {
		return this.make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getTerrainType() {
		return terrainType;
	}
	public void setTerrainType(String terrainType) {
		this.terrainType = terrainType;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public String getDriveType() {
		return driveType;
	}
	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}

	@Override
	public String toString() {
		String result = super.toString();
		result += "\nMotorcycle [Make=" + this.make + ", terrainType=" + terrainType + ", engineCC=" + engineCC + ", driveType="
				+ driveType + "]";
		return result;
	} // end toString











} // end of Class
