
public class Player {
	private Name playerName;
	private Date dob;
	private double moneyBal;

	public Player(Name playerName, Date dob, double moneyBal) {

		setPlayerName(playerName);
		setDob(dob);
		setMoneyBal(moneyBal);
	}// end of the constructor

	// ==========================================(Getters and
	// setters)=====================
	public Name getPlayerName() {
		return playerName;
	}

	public void setPlayerName(Name playerName) {
		this.playerName = playerName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getMoneyBal() {
		return moneyBal;
	}

	public void setMoneyBal(double moneyBal) {
		this.moneyBal = moneyBal;
	}

	// ===================================================================================

	public String toString() {
		return "Player..........: " + playerName + "\nDate of birth.........: " + dob
				+ "\nBalance of Funds..........: $" + moneyBal + "\n\n";
	}

	// =====================================(functions)===============================

} // end of Class
