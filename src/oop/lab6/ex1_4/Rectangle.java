package lab6.ex1_4;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){
        super();
    }
    public Rectangle(double width, double length){
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width,double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getPerimeter(){
        return 2*(this.width +this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +super.toString()+
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
