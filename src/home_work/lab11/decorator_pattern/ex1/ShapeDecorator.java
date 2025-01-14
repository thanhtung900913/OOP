package home_work.lab11.decorator_pattern.ex1;

public class ShapeDecorator {
    public Shape shape;
    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    public void draw(){
        shape.draw();
    }
}
