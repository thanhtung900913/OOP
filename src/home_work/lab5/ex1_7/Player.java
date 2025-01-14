package lab5.ex1_7;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public void move(float xDisp, float yDisp){
        this.x+=xDisp;
        this.y+=yDisp;
    }
    public void jump(float zDisp){
        this.z += zDisp;
    }
    public boolean near(){
        float dis =(float) Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.x);
        if(dis < 8){
            return true;
        }
        return false;
    }
}
