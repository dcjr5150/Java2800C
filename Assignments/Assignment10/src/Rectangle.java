public class Rectangle {

    private double length; //Field for the length of the rectangle.
    private double width; //Field for the width of the rectangle.

    //Two argument constructor
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    //No argument constructor
    public Rectangle() {

        double randomWidth = (double)(Math.random() * 200) + 1;
        double randomLength = (double)(Math.random() * 200) + 1;

        setWidth(randomWidth);
        setLength(randomLength);


    }

    /*
     *
     *      Setters and Getters
     *
     */
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    // toString
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + getLength() +
                ", width=" + getWidth() +
                '}';
    }

    //Gets the area of the rectangle.
    public String getArea(){

        double area;
        String result;

        area = getLength() * getWidth();

        result = "The area of this rectangle is: " + area;

        return result;


    }

    //Gets the Perimeter of the rectangle
    public String getPerimeter(){

        double perimeter, length, width;
        String result;

        perimeter = getWidth() + getWidth() + getLength() + getLength();

        result = "The perimeter of this rectangle is: " + perimeter;

        return result;

    }

}
