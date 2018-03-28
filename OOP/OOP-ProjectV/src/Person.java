
/*

Created by Daniel Conlin

 */

public class Person{

    private Name name;
    private Address address;
    private char gender;
    private double income;
    private char smoker;

    public Person(Name name, Address address, char gender, double income, char smoker) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.income = income;
        this.smoker = smoker;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public char getSmoker() {
        return smoker;
    }

    public void setSmoker(char smoker) {
        this.smoker = smoker;
    }
}
