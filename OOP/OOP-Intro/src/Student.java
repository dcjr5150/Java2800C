public class Student {

    String name;
    Date dob;
    double gpa;

    public Student(String name, Date dob, double gpa) {
        this.name = name;
        this.dob = dob;
        this.gpa = gpa;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", gpa=" + gpa +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
