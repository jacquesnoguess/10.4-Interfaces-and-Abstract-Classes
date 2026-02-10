public class Guitar extends Instrument{
    public Guitar(String name, String noise, boolean inTune){
        super(noise, name, inTune);
    }
    @Override
    public void play(){
        System.out.println(noise);
    }
}
