public interface Carnivore {
    int pieces = 10;
    static void eatGrass() {
        System.out.println("Carnivores do not eat grass.");
    }
    default int chew() {
        return 13;
    }
}
