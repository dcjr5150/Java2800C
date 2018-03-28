public class Name {

    private String firstName;
    private char middleInital;
    private String lastName;

    public Name(String firstName, char middleInital, String lastName) {
    }

    public Name(String firstName, String lastName) {
    }

    public Name() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getMiddleInital() {
        return middleInital;
    }

    public void setMiddleInital(char middleInital) {
        this.middleInital = middleInital;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleInital=" + middleInital +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
