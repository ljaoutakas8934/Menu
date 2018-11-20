public class Sandwich
{
    private double price;
    private String name;

    public Sandwich(double price, String name)
    {
        this.price = price;
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public double getPrice()
    {
        return this.price;
    }
}
