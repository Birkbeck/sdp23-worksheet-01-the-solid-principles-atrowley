public class Penguin implements Bird, SwimmingBehaviour{
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }

//    public void fly() {
//        throw new UnsupportedOperationException();
//    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}
