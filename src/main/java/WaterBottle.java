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

    public void empty(){
        volume = 0;
    }

    public void fill(){
        volume = 100;
    }

}
