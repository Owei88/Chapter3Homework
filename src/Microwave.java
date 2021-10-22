public class Microwave {

    private int PowerLevel=1;
    public double MicrowaveTime;
    public Microwave(){

    }
//@param MicrowaveTime sets microwave time
    //@param PowerLevel decides power level

    public void reset(){
        MicrowaveTime = 0;


    }
    public void addThirtySeconds() {
        MicrowaveTime += 30;
    }

    public void changePowerLevel(){
        if (PowerLevel == 1){
            PowerLevel = 2;
        }
        else if (PowerLevel ==2){
            PowerLevel = 1;
        }
    }

    public double getMicrowaveTime(){
        return MicrowaveTime;
    }

    public double getPowerLevel(){
        return PowerLevel;
    }

        }
