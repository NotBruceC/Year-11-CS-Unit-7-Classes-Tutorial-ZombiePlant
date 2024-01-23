import java.io.LineNumberReader;

public class ZombiePlant {
    private int maximumP = 0;
    private int initial = 0;
    public ZombiePlant(){
        this.maximumP = 0;
        this.initial = 0;
    }
    public ZombiePlant(int maximumP, int initial){
        this.maximumP = maximumP;
        this.initial = initial;
    }


    public int treatmentsNeeded(){
        return this.initial;
    }
    public int getPotency(){
        return maximumP;
    }

    public boolean isDangerous(){
       return this.initial != 0;
    }
    public void treat( int x ){
        if(x<=0 || initial==0) {
        } else if(x<=maximumP){
            initial--;
        }else if(x>maximumP){
            initial++;
        }
    }





}
