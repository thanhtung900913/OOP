package lab6.ex2_1;

public class Line {
    private Point begin;
    private Point end;
    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    public Line(int beginX, int beginY, int endX, int endY){
        Point begin = new Point(beginX, beginY);
        Point end = new Point(endX, endY);
        this.begin = begin;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin.toString() +
                ", end=" + end.toString() +
                '}';
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginY(){
        return begin.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public int getBeginX(){
        return begin.getX();
    }

    public void setBeginX(int x){
        begin.setX(x);
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public void setEndX(int x){
        end.setX(x);
    } public void setEndY(int Y){
        begin.setX(Y);
    }

    public double getLength(){
        return Math.sqrt((begin.getX()-end.getX())*(begin.getX()-end.getX())+ (begin.getY()-end.getY())*(begin.getY()-end.getY()));
    }
    public double getGradient(){
        return Math.atan2((begin.getY()-end.getY()),(begin.getX()-end.getX()));
    }

}
