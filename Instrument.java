public abstract class Instrument implements NoiseMaker{
    protected String name;
    protected String noise;
    protected boolean inTune;

    public Instrument(String noise, String name, boolean inTune){
        this.noise = noise;
        this.name = name;
        this.inTune = false;
    }
    
    @Override
    public void makeNoise() {
        System.out.println(name + " starts making noise");
    }

    @Override
    public void tuneUp() {
        inTune = true;
    }

    public abstract void play();
}
