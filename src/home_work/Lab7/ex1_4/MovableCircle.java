package Lab7.ex1_4;


public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        MovablePoint center = new MovablePoint(x ,y , xSpeed ,ySpeed);
        this.center = center;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +center.toString()+
                "radius=" + radius +
                '}';
    }
    @Override
    public void moveUp(){
        center.moveUp();
    }
    @Override
    public void moveDown(){
        center.moveDown();
    }
    @Override
    public void moveRight() {
        center.moveRight();
    }
    @Override
    public void moveLeft(){
        center.moveLeft();

    }

}
