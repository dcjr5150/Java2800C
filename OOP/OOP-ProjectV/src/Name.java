/*

Created by Daniel Conlin

 */

public class Name {

    private String first;
    private char inital;
    private String last;
    private String firstName;


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public char getInital() {
        return inital;
    }

    public void setInital(char inital) {
        this.inital = inital;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Name(String first, String last) {
        this.first = first;
        this.inital = '\u0000';
        this.last = last;
    }

    public Name(String first, char inital, String last) {
        this.first = first;
        this.inital = inital;
        this.last = last;
    }

    public String toString() {
        String result;

        if (inital != '\u0000') {
            result = "Name: " + first + " " + inital + ". " + last;
        } else {
            result = "Name: " + first + " " + last;

        }

        return result;
    }
}
