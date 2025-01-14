package home_work.lab11.factory_method_pattern.ex3;

public class PlantRose extends Farmer {
    @Override
    public Flower plant() {
        return new Rose();
    }
}
