public class Trio
{
    private String name;
    private double price;

    public Trio (Sandwich sandwich, Salad salad, Drink drink)
    {
        this.name = sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
        double h1 = sandwich.getPrice();
        double h2 = salad.getPrice();
        double h3 = drink.getPrice();
        if (h1 > h3 && h2 > h3) this.price = h1 + h2;
        if (h1 > h2 && h3 > h2) this.price = h3 + h1;
        if (h2 > h1 && h3 > h1) this.price = h2 + h3;
    }

    public double getPrice()
    {
        return this.price;
    }

    public String getName()
    {
        return this.name;
    }
}
