package home_work.lab10.adapter_pattern.ex1;

public class RoundHole {
    private int radius;
    public RoundHole(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public boolean fits(RoundPeg peg){
        if(this.radius == peg.getRadius()){
            return true;
        }
        return false;
    }
}
