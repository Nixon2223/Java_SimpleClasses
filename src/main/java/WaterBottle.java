public class WaterBottle {
    private static int volume;

    public WaterBottle(){
        volume = 100;
    }

    public int getVolume(){
        return volume;
    }

    public void drink(){
        volume -= 10;
    }


}
