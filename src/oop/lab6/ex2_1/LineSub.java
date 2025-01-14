package lab6.ex2_1;

public class LineSub extends Point{
    private Point end;
    public LineSub(int beginX, int beginY, int endX, int endY){
        super(beginX,beginY);
        Point end = new Point(endX,endY);
        this.end = end;
    }

    public LineSub(Point begin, Point end){
        super(begin.getX(),begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub{begin["+super.toString() +
                "end=" + end.toString() +
                '}';
    }
    public Point getBegin(){
        Point point = new Point(super.getX(),super.getY());
        return point;
    }
    public Point getEnd(){
        return this.end;
    }
    public void setBegin(int x, int y){
        super.setXY(x, y);
    }
    public void setEnd(int x, int y){
        this.end.setXY(x, y);
    }
    public int getBeginX(){
        return super.getX();
    }
    public int getBeginY(){
        return super.getY();
    }
    public int getEndX(){
        return this.end.getX();
    }
    public int getEndY(){
        return this.end.getY();
    }

    public void setBeginX(int x){
        super.setX(x);
    }
    public void setBeginY(int y){
        super.setY(y);
    }
    public void setBeginXY(int x, int y){
        super.setXY(x,y);

    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public void setXY(int x, int y){
        this.end.setXY(x,y);
    }
    public double getLength(){
        return Math.sqrt((super.getX()-end.getX())*(super.getX()-end.getX())+ (super.getY()-end.getY())*(super.getY()-end.getY()));
    }
    public double getGradient(){
        return Math.atan2((super.getY()-end.getY()),(super.getX()-end.getX()));
    }
}

