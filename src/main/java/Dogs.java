public class Dogs implements Tradable, Domesticatable {


    @Override
    public int getPrice(){
        return 50;
    }

    @Override
    public String sound(){
        return "Woof!";
    }


}
