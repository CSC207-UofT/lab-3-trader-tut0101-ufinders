public class Demon implements Drivable, Domesticatable, Tradable {

    private int maxSpeed = 999999999;
    private int powerLevel = 9001;
    public boolean isDemon = false;

    //Initializes demon object
    public Demon(int pow) {
        this.maxSpeed = 999999999;
        this.powerLevel = pow;
    }

    @Override
    //Returns the sound of the demon
    public String sound() {
        return "Hi I'm not a demon";
    }

    @Override
    public int getPrice() {
        return 99999999;
    }

    @Override
    public void upgradeSpeed() {
        System.out.println("This is fast enough you jerk");
    }

    @Override
    public void downgradeSpeed() {
        System.out.println("Stop");
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }

    public boolean isOver9000() {
        System.out.println("What 9000!? There's no way that can be right!");
        return this.powerLevel > 9000;
    }
}
