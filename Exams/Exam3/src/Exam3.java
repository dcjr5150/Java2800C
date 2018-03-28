
// ==================================================
// Written By: Keegan Kerns, Ryan Lowe, Daniel Conlin
// Date: 03/25/18
// Purpose: Exam3
// ==================================================

import java.util.*;
import javax.swing.*;

public class Exam3 {
	public static void main(String[] args) {
		char choice;
		Player chosen = null;
		SlotMachine slotChosen = null;
		int i = 1; // counter for players
		int k = 3; // counter for machines

		Name[] playerName = new Name[51];// stores the names of the array list so that it can show up in the drop down
											// menu.
		Date dob;
		ArrayList<Player> players = new ArrayList<Player>();// array list that stores the players

		String[] machineName = new String[51]; // stores the array list of the slot machines for menu
		ArrayList<SlotMachine> machines = new ArrayList<SlotMachine>(); // array list that stores the machines

		// Aunt Vera
		// =================================================================================
		Name vera = new Name("Aunt", 'G', "Vera");
		playerName[0] = vera;
		Date veraDob = new Date(2, 14, 1986);
		double veraBal = 23000;
		Player auntVera = new Player(vera, veraDob, veraBal);
		players.add(auntVera);
		// ============================================================================================

		// Lucky 7
		// ====================================================================================
		SlotMachine lucky7 = new SlotMachine("Lucky 7", 1, 5000, 10000, 0, 5000, 0, 10, 5, 0);
		machineName[0] = "Lucky 7";
		machines.add(lucky7);
		// ============================================================================================

		// Lucky Lotto
		// ================================================================================
		SlotMachine luckyLotto = new SlotMachine("Lucky Lotto", 1, 55000, 100000, 0, 75000, 0, 50, 25, 0);
		machineName[1] = "Lucky Lotto";
		machines.add(luckyLotto);
		// ============================================================================================

		// Purple People Eater
		// ========================================================================
		SlotMachine purplePeopleEater = new SlotMachine("Purple People Eater", 1, 1000, 50, 0, 40, 0, 5, 2, 0);
		machineName[2] = "Purple People Eater";
		machines.add(purplePeopleEater);
		// ============================================================================================

		do {
			choice = getChoice();
			switch (choice) {

			case 'A': // add a player
				if (i < 51) {
					playerName[i] = Name.makeName();
					JOptionPane.showMessageDialog(null, "Next you will enter your birthday.");
					dob = Date.makeDate();
					players.add(makePlayer(playerName[i], dob));
					i++;
				} // allows a counter to keep track in the array so there are not too many players
				else {
					JOptionPane.showMessageDialog(null, "You cannot enter anymore players.");
				} // end of else statement
				break;
			case 'B': // add a slot machine
				if (k < 51) {
					machines.add(makeSlotMachine());
					machineName[k] = machines.get(k).getSlotMachineName();
					k++;
				} // allows a counter to keep track in the array so there are not too many
					// machines
				else {
					JOptionPane.showMessageDialog(null, "You cannot enter anymore machines.");
				} // end of else statement
				break;
			case 'C': // pick a player
				Object chosenPlayer = JOptionPane.showInputDialog(null, "Select the Player you want:",
						"Player Selection", JOptionPane.QUESTION_MESSAGE, null, playerName, playerName[0]);

				for (int j = 0; j < players.size(); j++) {
					if (players.get(j).getPlayerName() == chosenPlayer) {
						chosen = players.get(j);
						JOptionPane.showMessageDialog(null, chosen);
					} // end if statement
				} // creates the drop down list through J option Pane and the if statement
					// compares the index in the array list to the selection from the drop down menu
				break;
			case 'D': // pick a slot machine
				Object chosenMachine = JOptionPane.showInputDialog(null, "Select the Machine you want:",
						"Machine Selection", JOptionPane.QUESTION_MESSAGE, null, machineName, machineName[0]);

				for (int l = 0; l < machines.size(); l++) {
					if (machines.get(l).getSlotMachineName() == chosenMachine) {
						slotChosen = machines.get(l);
						JOptionPane.showMessageDialog(null, slotChosen.toString());
					} // end if statement
				} // creates the drop down list through J option Pane and the if statement
					// compares the index in the array list to the selection from the drop down menu
				break;
			case 'F':// play slot
				int jackpotCounter = slotChosen.getSlotMachineJackpotCounter();
				int regCounter = slotChosen.getSlotMachineRegularCounter();
				int playCount = slotChosen.getTimesPlayed();
				if (chosen == null || slotChosen == null) {
					JOptionPane.showMessageDialog(null, "Please select a Player and a Machine.");
				} else {
					JOptionPane.showMessageDialog(null, "Player: " + chosen +  slotChosen.toString());
					playCount = playCount + 1;
					slotChosen.setTimesPlayed(playCount);
					jackpotCounter = jackpotCounter + 1;
					slotChosen.setSlotMachineJackpotCounter(jackpotCounter);
					regCounter = regCounter + 1;
					slotChosen.setSlotMachineRegularCounter(regCounter);
					playSlot(chosen, slotChosen);
				} // end if/else
				break;
			case 'Q': // Quit
				JOptionPane.showMessageDialog(null, "Thank you for participating!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid Selection");
			} // end switch

		} while (choice != 'Q');

	}// end of main

	public static char getChoice() {
		char result = 'Q';
		String inputLine, message, prompt;

		// outputting menu
		message = "A. Add a player\n";
		message += "B. Add a Slot Machine. \n";
		message += "C. Pick a Player.\n";
		message += "D. Pick a Slot Machine.\n";
		message += "F. Play Slots.\n";
		message += "Q. Quit\n";
		prompt = "Enter your selection";

		inputLine = JOptionPane.showInputDialog(message, prompt);
		inputLine = inputLine.toUpperCase();
		result = inputLine.charAt(0);

		return result;
	}// end of getChoice

	public static Player makePlayer(Name name, Date date) {
		double moneyBal;
		String input;

		input = JOptionPane.showInputDialog("Enter the amount of the money the player has: ");
		moneyBal = Double.parseDouble(input);
		do {
			if (moneyBal < 0) {
				JOptionPane.showMessageDialog(null, "Invalid input.");
				input = JOptionPane.showInputDialog("Enter the amount of the money the player has: ");
				moneyBal = Double.parseDouble(input);
			} // end if statement
		} while (moneyBal < 0);// validates that the amount is positive

		Player p1 = new Player(name, date, moneyBal);

		return p1;
	}// end of function for make player

	public static SlotMachine makeSlotMachine() {
		int tempSlotMachineJackpotCounter = 0;
		int tempSlotMachineRegularCounter = 0;
		int tempSlotMachineJackpotOdds;
		int tempSlotMachineRegularOdds;
		int tempTimesPlayed = 0;

		String tempSlotMachineName;

		double costPerPlay;
		double tempSlotMachineBalance;
		double tempSlotMachineJackpotSize;
		double tempSlotMachineRegularSize;

		tempSlotMachineName = JOptionPane.showInputDialog("Machine Name");
		costPerPlay = 1;
		tempSlotMachineBalance = SlotMachine.validateInputDouble("Current Balance");
		tempSlotMachineJackpotOdds = SlotMachine.validateInputInt("Jackpot Odds");
		tempSlotMachineJackpotSize = SlotMachine.validateInputDouble("Jackpot Size");
		tempSlotMachineRegularOdds = SlotMachine.validateInputInt("Regular Odds");
		tempSlotMachineRegularSize = SlotMachine.validateInputDouble("Regular Win Size");

		SlotMachine slotMachine = new SlotMachine(tempSlotMachineName, costPerPlay, tempSlotMachineBalance,
				tempSlotMachineJackpotOdds, tempSlotMachineJackpotCounter, tempSlotMachineJackpotSize,
				tempSlotMachineRegularCounter, tempSlotMachineRegularOdds, tempSlotMachineRegularSize, tempTimesPlayed);

		return slotMachine;
	} // end of makeSlotMachine

	public static void playSlot(Player player, SlotMachine machine) {
		if (machine.getSlotMachineBalance() >= machine.getSlotMachineJackpotSize() && machine.getSlotMachineBalance() >= machine.getSlotMachineRegularSize()) {
			if (player.getMoneyBal() > 0) {
				double machineBalance = machine.getSlotMachineBalance();
				double playerBalance = player.getMoneyBal();
				double cost = machine.getCostPerPlay();
				int jackpotCounter = machine.getSlotMachineJackpotCounter();
				int jackpotOdds = machine.getSlotMachineJackpotOdds();
				double jackpot = machine.getSlotMachineJackpotSize();
				int regCounter = machine.getSlotMachineRegularCounter();
				int regOdds = machine.getSlotMachineRegularOdds();
				double regular = machine.getSlotMachineRegularSize();

				JOptionPane.showMessageDialog(null, "Player currently has $" + playerBalance);

				if (jackpotOdds == jackpotCounter) {
					playerBalance = (playerBalance - cost) + jackpot;
					machineBalance = (machineBalance + cost) - jackpot;
					JOptionPane.showMessageDialog(null, "JACKPOT! \nYou win $" + jackpot);
					player.setMoneyBal(playerBalance);
					machine.setSlotMachineBalance(machineBalance);
					jackpotCounter = 0;
					machine.setSlotMachineRegularCounter(jackpotCounter);
				} else if (regOdds == regCounter) {
					playerBalance = (playerBalance - cost) + regular;
					machineBalance = (machineBalance + cost) - regular;
					JOptionPane.showMessageDialog(null, "Congratulations! \nYou won a regular payout of $" + regular);
					player.setMoneyBal(playerBalance);
					machine.setSlotMachineBalance(machineBalance);
					regCounter = 0;
					machine.setSlotMachineJackpotCounter(jackpotCounter);
				} else {
					playerBalance = playerBalance - cost;
					player.setMoneyBal(playerBalance);
					machineBalance = machineBalance + cost;
					machine.setSlotMachineBalance(machineBalance);
					JOptionPane.showMessageDialog(null, "Unlucky! Try again! \nCurrent Balance: $" + playerBalance);
				} // end if/else statements
			} else
				JOptionPane.showMessageDialog(null, "Invalid player. Player has no money. \nPlease pick a new player.");
		} else
			JOptionPane.showMessageDialog(null, "Sorry! This machine is out of money! \nPlease pick a new machine.");
		// end if statement
	} // end playSlot

}// end of class
