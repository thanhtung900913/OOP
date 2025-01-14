package lab5.ex1_7;

public class Ball {
    private float x;
    private float y;
    private float z;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }
    public void setXYX(float x, float y, float z){
        this.x =x;
        this.y = y;
        this.z = x;
    }
    public String toString(){
        return "("+this.x+" ,"+this.y+" ,"+this.z+")";
    }
}
