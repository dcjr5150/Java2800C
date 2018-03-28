import javax.swing.JOptionPane;

public class Date {
private int month;
private int day;
private int year;

public Date(int month, int day, int year) {
	super();
	this.month = month;
	this.day = day;
	this.year = year;
}//end of constructor


//=====================================(getters and setters)==================================================
public int getMonth() {
	return month;
}

public void setMonth(int month) {
	String inputLine;

	do {
		if(month < 0 || month > 12) {
		JOptionPane.showMessageDialog(null, "INVALID INPUT");
		inputLine = JOptionPane.showInputDialog("Please enter the Month: ", "Enter Here");
		month = Integer.parseInt(inputLine);//prompts the user again for a proper month
		}
		
		} while(month < 0 || month > 12);//conditions that must be followed for the month
	
	this.month = month;
}

public int getDay() {
	return day;
}

public void setDay(int day, int month, int year) {
	String inputLine2;

	
	if(month == 2) {
		if(year % 4 == 0) {//step 1
			if(year % 100 == 0) {//step 2
				if(year % 400 == 0) {//step 3
					do {
						if(day < 0 || day > 29) {
						JOptionPane.showMessageDialog(null, "INVALID INPUT");
						
						inputLine2 = JOptionPane.showInputDialog("Please enter the Day: ", "Enter Here.");
						day = Integer.parseInt(inputLine2);
						
						}//end of leap year day check of February
					
					}while(day < 0 || day > 29);
				}
				else {
					do {
						if(day < 0 || day > 28) {
						JOptionPane.showMessageDialog(null, "INVALID INPUT");
						
						inputLine2 = JOptionPane.showInputDialog("Please enter the Day: ", "Enter Here.");
						day = Integer.parseInt(inputLine2);
						
						}//end of regular day check for February
					
					}while(day < 0 || day > 28);
				}
			}//end of step 2
			else {
				do {
					if(day < 0 || day > 29) {
					JOptionPane.showMessageDialog(null, "INVALID INPUT");
					
					inputLine2 = JOptionPane.showInputDialog("Please enter the Day: ", "Enter Here.");
					day = Integer.parseInt(inputLine2);
					
					}//end of leap year day check of February
				
				}while(day < 0 || day > 29);
			}//end of else condition for year % 100 == 0
			
			}
		
		else{//end of step 1 if the year is not evenly divisible by 4
			do {
				if(day < 0 || day > 28) {
				JOptionPane.showMessageDialog(null, "INVALID INPUT");
				
				inputLine2 = JOptionPane.showInputDialog("Please enter the Day: ", "Enter Here.");
				day = Integer.parseInt(inputLine2);
				
				}//end of regular day check for February
			
			}while(day < 0 || day > 28);
		}
			
		}//end of vetting for February
	
		else  {
			do {
				if(day < 0 || day > 31) {
				JOptionPane.showMessageDialog(null, "INVALID INPUT");
				
				inputLine2 = JOptionPane.showInputDialog("Please enter the Day: ", "Enter Here.");
				day = Integer.parseInt(inputLine2);
				
				}//end of regular day check for other months
			
			}while(day < 0 || day > 31); //end of else for regular months
		
		}//end of set day
	
	this.day = day;
}//end of setDay

public int getYear() {
	return year;
}

public void setYear(int year) {
	String inputLine3;
	
	do {
		
		if(year < 0) {
		JOptionPane.showMessageDialog(null, "Invalid Input");
		inputLine3 = JOptionPane.showInputDialog("Please enter the year: ", "Enter Here.");
		year = Integer.parseInt(inputLine3);
		}
	
	}while(year < 0);
	
	this.year = year;
}//end of set year


//===========================================(end of getters and setters)=============================================
public String toString() {
	return "" + month + "/" + day + "/" + year + "";
}


public static Date makeDate() {
	int month = 0, day = 0, year = 0;
	String input, input2, input3;
	
	Date d1 = new Date(month, day, year);
	
	input = JOptionPane.showInputDialog("Enter the month:");
	month = Integer.parseInt(input);
	d1.setMonth(month);

	input3 = JOptionPane.showInputDialog("Enter the year:");
	year = Integer.parseInt(input3);
	d1.setYear(year);
	
	input2 = JOptionPane.showInputDialog("Enter the day:");
	day = Integer.parseInt(input2);
	d1.setDay(day, month, year);
	
	return d1;

}
	



}//end of class
