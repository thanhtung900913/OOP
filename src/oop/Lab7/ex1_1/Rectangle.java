package Lab7.ex1_1;


public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;
    public Rectangle(){
        super();
    }
    public Rectangle(double width, double length){
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
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
    @Override
    public double getPerimeter(){
        return 2*(this.width +this.length);
    }
    @Override
    public double getArea(){
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +super.toString()+
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
