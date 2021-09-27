
public class Cat implements Tradable, Domesticatable {

    @Override
    public String sound() {
        return "Meow!";
    }

    @Override
    public int getPrice() {
        return 25;
    }
}
