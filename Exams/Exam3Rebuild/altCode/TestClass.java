//Written By: Keegan Kerns 
//Date: 02/28/18
//Purpose: Exam3
//=========================
import java.util.*;
import javax.swing.*;
public class TestClass {

	public static void main(String[] args) {
		char choice;
		Player chosen;
		int i  = 1;
		Name [] playerName = new Name [51];//stores the names of the array list so that it can show up in the drop down menu.
		Date dob;
		ArrayList <Player> players = new ArrayList <Player>();//array list that stores the players 
		
		Name vera = new Name("Aunt", 'G', "Vera");
		playerName[0] = vera;
		Date veraDob = new Date(2, 14, 1986);
		double veraBal = 23000;
		Player auntVera = new Player(vera, veraDob, veraBal);
		players.add(auntVera);



	//This is the preset person that is Aunt Vera who is established as the first player in the choices.
			
		do {
			choice = getChoice();
			switch (choice) {

			case 'A': //add a player
				if(i < 51) {
					playerName[i] = Name.makeName();
					dob = Date.makeDate();
					players.add(makePlayer(playerName[i], dob));
					i++;
				}//allows a counter to keep track in the array so there are not too many players
				else {
					JOptionPane.showMessageDialog(null,  "You cannot enter anymore players.");
				}//end of else statement
				break;
			case 'B': //add a slot machine
				
				break;
			case 'C': //pick a player 
				Object chosenPlayer = JOptionPane.showInputDialog(null, "Enter the Player you want to play with:", "Player Selection", JOptionPane.QUESTION_MESSAGE, null, playerName, playerName[0]);
				for(int j = 0; j < players.size(); j++) { 
					if(players.get(j).getPlayerName() == chosenPlayer) {
						chosen = players.get(j);
						System.out.print(players.get(j));
					}
					
				}//creates the drop down menu through J option Pane and the if statement compares the index in the array list to the selection from the drop down menu
				break;
			case 'D': //pick a slot machine
				
				break;
			case 'F'://play slot
				
				break;
			case 'Q': //Quit
				JOptionPane.showMessageDialog(null, "Thank you for participating!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid Selection");

			}

		}while(choice != 'Q');
		
		}//end of main 
	
	public static char getChoice() {
		//main menu class
		
		
		char result = 'Q';
		String inputLine, message, prompt;

		//outputting menu
		message =  "A. Add a player\n";
		message += "B. Add a Slot Machine. \n";
		message += "C. Pick a Player.\n";
		message += "D. Pick a Slot Machine.\n";
		message += "F. Play Slots.\n";
		message += "Q. Quit\n";
		prompt = "Enter your selection";

		inputLine = JOptionPane.showInputDialog(message,prompt);
		inputLine = inputLine.toUpperCase();
		result = inputLine.charAt(0);

		return result; 
	}//end of getChoice

	public static Player makePlayer(Name name, Date date) {
		double moneyBal;
		String input;
		
		input = JOptionPane.showInputDialog("Enter the amount of the money the player has: ");
		moneyBal = Double.parseDouble(input);
		
		Player p1 = new Player(name, date, moneyBal);
		
		return p1;
	}//end of function
	
}//end of class
