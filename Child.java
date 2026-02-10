public class Child implements NoiseMaker{
    private int volume;
    public Child(){
        this.volume = 0;
    }
    @Override
    public void makeNoise(){
        this.volume = 500;
        System.out.println("Child is yelling at volume: "+volume);
    }

    @Override
    public void tuneUp(){
        System.out.println("Child is not in tune at all!");
    }
}
