public class Bass extends Instrument {
    public Bass(String noise, String name, boolean inTune){
        super(noise, name, inTune);
    }
    @Override
    public void play(){
        System.out.println(noise);
    }
}
