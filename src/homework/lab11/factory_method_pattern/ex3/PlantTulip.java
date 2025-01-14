package homework.lab11.factory_method_pattern.ex3;

public class PlantTulip extends Farmer{
    @Override
    public Flower plant() {
        return new Tulip();
    }
}
