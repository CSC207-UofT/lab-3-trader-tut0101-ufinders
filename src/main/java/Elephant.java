public class Elephant implements Tradable, Domesticatable{
    private String name;
    private int money;

    public Elephant(String name, int price){
        this.name = name;
        this.money = price;
    }
    //*@ return price of chocolate;
    @Override
    public int getPrice() {
        return this.money;
    }
    public String getName() {
        return this.name;
    }

    //*@ return sound that elephant makes
    @Override
    public String sound() {
        return "ooo";
    }
}
