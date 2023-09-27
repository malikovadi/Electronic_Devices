public class Device {
    private String type;
    private double price;
    private double weight;

    public Device(String type, double price, double weight)
    {
        this.type = type;
        this.price = price;
        this.weight = weight;
    }

    public String getType()
    {
        return type;
    }
    public double getPrice()
    {
        return price;
    }
    public double getWeight()
    {
        return weight;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
}