public class MicrowaveTester {

    public static void main(String[] args) {


        Microwave microwave;
        microwave = new Microwave();
        microwave.addThirtySeconds();
        microwave.changePowerLevel();
        microwave.reset();
        microwave.addThirtySeconds();
        microwave.addThirtySeconds();
        System.out.println("Cooking for " + microwave.getMicrowaveTime()+ " seconds at level " + microwave.getPowerLevel());

    }

}
