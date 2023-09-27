public class Headphones extends Device{
    private String name;
    private String color;
    private int durability;

    public Headphones(String type, double price, double weight, String name, String color, int durability) {
        super(type, price, weight);
        this.name = name;
        this.color = color;
        this.durability = durability;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

}
