import java.util.Objects;

public class Date {

    private int month;
    private int day;
    private int year;


    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public Date() {
    }

    public String toString() {
        return "Date{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    public void setDate(String type){


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

    /*
    //Create a constructor method
    public Date(int month, int day, int year){

        this.month = month;
        this.day = day;
        this.year = year;

    }// end of Date Constr

    public Date(){

        month = 1;
        day = 1;
        year = 1;

    }

    public Date(int month, int day){

        //this.month = month;
        setMonth(month);
        this.day = day;
        year = 2018;

    }

    public void setMonth(int month){

        while(month < 1 || month > 12){
            // YELL
        }

        this.month = month;
    }

    public int getMonth() {

        return month;
    }

    public void setDay(int day){

        while(day < 1 || day > 12){
            //YELL
        }

    }

    public int getDay() {
        return day;
    }

    public void setYear(int year){

        while( year < 0 ){
            // YELL
        }
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        String result;

        result = "From Date: " + month + "/" + day + "/" + year;

        return result;
    }//end toString*/
}
