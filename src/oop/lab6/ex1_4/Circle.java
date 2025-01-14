package lab6.ex1_4;

public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){
        super();
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{Shape[Color="+super.getColor()+", filled="+super.isFilled()+"]," +
                "radius=" + radius +
                '}';
    }
}
