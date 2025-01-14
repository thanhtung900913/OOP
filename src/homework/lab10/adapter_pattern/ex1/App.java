package homework.lab10.adapter_pattern.ex1;

public class App {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("Fits round peg? " + hole.fits(roundPeg)); // Output: true

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);


        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println("Fits small square peg? " + hole.fits(smallSquarePegAdapter));
        System.out.println("Fits large square peg? " + hole.fits(largeSquarePegAdapter));
    }
}