import javax.swing.*;

public class SlotMachine {

	private double costPerPlay;

	private String slotMachineName;
	private double slotMachineBalance;

	private int slotMachineJackpotOdds;
	private int slotMachineJackpotCounter;
	private double slotMachineJackpotSize;

	private int slotMachineRegularCounter;
	private int slotMachineRegularOdds;
	private double slotMachineRegularSize;
	
	private int timesPlayed;

	public SlotMachine(String slotMachineName, double costPerPlay, double slotMachineBalance,
			int slotMachineJackpotOdds, int slotMachineJackpotCounter, double slotMachineJackpotSize,
			int slotMachineRegularCounter, int slotMachineRegularOdds, double slotMachineRegularSize, int timesPlayed) {
		setSlotMachineName(slotMachineName);
		setCostPerPlay(costPerPlay);
		setSlotMachineBalance(slotMachineBalance);
		setSlotMachineJackpotOdds(slotMachineJackpotOdds);
		setSlotMachineJackpotCounter(slotMachineJackpotCounter);
		setSlotMachineJackpotSize(slotMachineJackpotSize);
		setSlotMachineRegularCounter(slotMachineRegularCounter);
		setSlotMachineRegularOdds(slotMachineRegularOdds);
		setSlotMachineRegularSize(slotMachineRegularSize);
		setTimesPlayed(timesPlayed);
	} // end of constructor

	public static double addFunds() {
		double funds = validateInputDouble("Amount to add");
		return funds;
	} // end of addFunds

	public static int validateInputInt(String message) {
		int result = -1;
		boolean inputAccepted = false;
		while (!inputAccepted) {
			try {
				int input = Integer.parseInt(JOptionPane.showInputDialog(message));

				if (input <= 0 || input > Integer.MAX_VALUE) {

				} else {

					result = input;
					inputAccepted = true;

				} // end if/else
			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, "Please enter only a number", "Insane Error",
						JOptionPane.ERROR_MESSAGE);
			} // end catch
		} // end while
		return result;
	} // end of validateInputInt

	public static double validateInputDouble(String message) {
		double result = -1.0;
		boolean inputAccepted = false;
		while (!inputAccepted) {
			try {
				double input = Double.parseDouble(JOptionPane.showInputDialog(message));

				if (input <= 0 || input > Double.MAX_VALUE) {

				} else {

					result = input;
					inputAccepted = true;
				}
			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, "Please enter only a number", "Insane error",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		return result;
	} // end of validateInputDouble

	// Setters and Getters
	// ===================================================================================================
	public void setTimesPlayed(int timesPlayed){
		this.timesPlayed = timesPlayed;
	}
	
	public int getTimesPlayed(){
		return timesPlayed;
	}
	
	public String getSlotMachineName() {
		return slotMachineName;
	}

	public void setSlotMachineName(String slotMachineName) {
		this.slotMachineName = slotMachineName;
	}

	public double getSlotMachineBalance() {
		return slotMachineBalance;
	}

	public void setSlotMachineBalance(double slotMachineBalance) {
		this.slotMachineBalance = slotMachineBalance;
	}

	public int getSlotMachineJackpotOdds() {
		return slotMachineJackpotOdds;
	}

	public void setSlotMachineJackpotOdds(int slotMachineJackpotOdds) {
		this.slotMachineJackpotOdds = slotMachineJackpotOdds;
	}

	public int getSlotMachineJackpotCounter() {
		return slotMachineJackpotCounter;
	}

	public void setSlotMachineJackpotCounter(int slotMachineJackpotCounter) {
		this.slotMachineJackpotCounter = slotMachineJackpotCounter;
	}

	public double getSlotMachineJackpotSize() {
		return slotMachineJackpotSize;
	}

	public void setSlotMachineJackpotSize(double slotMachineJackpotSize) {
		this.slotMachineJackpotSize = slotMachineJackpotSize;
	}

	public int getSlotMachineRegularCounter() {
		return slotMachineRegularCounter;
	}

	public void setSlotMachineRegularCounter(int slotMachineRegularCounter) {
		this.slotMachineRegularCounter = slotMachineRegularCounter;
	}

	public int getSlotMachineRegularOdds() {
		return slotMachineRegularOdds;
	}

	public void setSlotMachineRegularOdds(int slotMachineRegularOdds) {
		this.slotMachineRegularOdds = slotMachineRegularOdds;
	}

	public double getSlotMachineRegularSize() {
		return slotMachineRegularSize;
	}

	public void setSlotMachineRegularSize(double slotMachineRegularSize) {
		this.slotMachineRegularSize = slotMachineRegularSize;
	}

	public double getCostPerPlay() {
		return costPerPlay;
	}

	public void setCostPerPlay(double costPerPlay) {
		this.costPerPlay = costPerPlay;
	}
	// ========================================================================================================================

	public String toString() {
		String result;
		result = "Machine Name: " + slotMachineName;
		result += "\nBalance: " + slotMachineBalance;
		result += "\nJackpot Payout: " + slotMachineJackpotSize;
		result += "\nJackpot Odds: " + slotMachineJackpotOdds;
		result += "\nRegular Payout: " + slotMachineRegularSize;
		result += "\nRegular Odds: " + slotMachineRegularOdds;
		result += "\nTimes Played: " + timesPlayed;
		return result;
	} // end of toString

} // end of class
