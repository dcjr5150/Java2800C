import javax.swing.*;

public class Date {

    private int month;
    private int day;
    private int year;


    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    public Date makeDate(){
        Date resultDate = null;

        int month, day, year;

        month = validateInputInt("Enter the Month");
        day = validateInputInt("Enter the Day");
        year = validateInputInt("Enter the year");


        return resultDate;
    }

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

                }
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Please enter only a number", "Insane Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        return result;
    }

}
