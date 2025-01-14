package homework.lab10.adapter_pattern.ex1;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter( SquarePeg peg) {
        // Assuming the radius of the round peg is equal to half of the diagonal of the square peg
        super((int)(peg.getWidth()*Math.sqrt(2)/2) );
        this.peg = peg;
    }

    // If you still want to provide a method to get the radius of the round peg,
    // you can override it like this:
    @Override
    public int getRadius() {
        return super.getRadius();
    }
}
