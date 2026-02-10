public class Main {
    public static void main(String[] args) {
        Guitar myCar = new Guitar("Fender", "twang twang twang", false);
        Bass myBike = new Bass("thump thump thump", "Ibanez", false);
        Child myDrone = new Child();

        myCar.tuneUp();
        myCar.play();
        
        myBike.tuneUp();
        myBike.play();

        myDrone.makeNoise();
        myDrone.tuneUp();
    }
}

