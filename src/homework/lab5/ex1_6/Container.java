package lab5.ex1_6;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width - 1;
        this.y2 = y + height - 1;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2;
    }

    public int getHeight() {
        return y2;
    }

    public String toString() {
        return "Container at (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")";
    }

    public boolean collidesWith(Ball ball) {

        if (ball.getX() - ball.getRadius() <= x1 || ball.getX() + ball.getRadius() >= x2 ||
                ball.getY() - ball.getRadius() <= y1 || ball.getY() + ball.getRadius() >= y2) {
            if (ball.getX() - ball.getRadius() <= x1 || ball.getX() + ball.getRadius() >= x2) {
                ball.reflectHorizontal();
            }
            if (ball.getY() - ball.getRadius() <= y1 || ball.getY() + ball.getRadius() >= y2) {
                ball.reflectVertical();
            }
            return true;
        }
        return false;
    }
}
