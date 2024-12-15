interface HasWings {
    int getNumberOfWings();
}

abstract class Insect implements HasWings {
    public abstract int getNumberOfLegs();
}

public class Dragonfly extends Insect {
    @Override
    public int getNumberOfWings() {
        return 4;
    }

    @Override
    public int getNumberOfLegs() {
        return 6;
    }
}
