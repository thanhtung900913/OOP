package lab5.ex1_6;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, float speed, float direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (speed*Math.cos(direction));
        this.yDelta = (float) (speed*Math.sin(direction));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta(){
        return this.xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public float getyDelta() {
        return yDelta;
    }
    public void move(){
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal(){
        this.xDelta *= (-1);
    }

    public void reflectVertical(){
        this.yDelta *= -1;
    }
    public String toString(){
        return "Ball[("+this.x+" ,"+this.y+"),speed=("+this.xDelta+" ,"+this.yDelta+")]";
    }
}
