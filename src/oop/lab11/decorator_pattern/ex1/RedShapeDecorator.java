package oop.lab11.decorator_pattern.ex1;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    public void draw(){
        super.draw();
        setRedBorder();
    }
    private void setRedBorder(){
        System.out.println("Red border");
    }
}
