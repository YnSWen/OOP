package Domen;

public class HotDrink extends Product {
    private int temperature;

    public int getHotDrinkTemperature() {
        return temperature;
    }

    public void setHotDrinkTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    public HotDrink (int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\ntemperature=" + temperature;
    }

}
