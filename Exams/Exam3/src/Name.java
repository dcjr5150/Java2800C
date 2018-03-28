import javax.swing.JOptionPane;

public class Name {
	private String first;
	private char initial;
	private String last;

	// ====================(constructors)===========================
	public Name(String first, char initial, String last) {
		super();
		setFirst(first);
		setInitial(initial);
		setLast(last);
	}

	// ====================(Getters and setters)======================

	public String getFirst() {

		return (first);
	}

	public void setFirst(String first) {
		this.first = first;

	}

	public char getInitial() {
		return initial;
	}

	public void setInitial(char initial) {

		this.initial = Character.toUpperCase(initial);

	}

	public String getLast() {
		return (last);
	}

	public void setLast(String last) {
		this.last = last;
	}

	// ==========================(toString)===========================
	public String toString() {
		String result;
		result = capitalize(first) + " ";
		if (initial == ' ')
			result += capitalize(last);
		else
			result += (initial) + ". " + capitalize(last);
		return result;
	}

	// Methods
	public static String capitalize(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}

	public static Name makeName() {

		String input1;
		String first, last;
		char initial;

		first = JOptionPane.showInputDialog("Enter the first name: ");
		input1 = JOptionPane.showInputDialog("Enter the initial(Hit space then enter if no middle initial): ");
		initial = input1.charAt(0);
		last = JOptionPane.showInputDialog("Enter the last name: ");

		Name result = new Name(first, initial, last);

		return result;

	}// end of the maker
}// end of class
