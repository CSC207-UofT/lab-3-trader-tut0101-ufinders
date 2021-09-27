public class Pony implements Tradable, Domesticatable{
    private String name;
    private int price;

    public Pony(String name, int price){
        this.name = name;
        this.price = price;
    }

    // Returns price for Pony
    @Override
    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    // Returns sound Pony makes
    @Override
    public String sound() {
        return "neigh";
    }
}
