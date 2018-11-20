public class Trio
{
    private String name;
    private double price;

    public Trio (Sandwich sandwich, Salad salad, Drink drink)
    {
        this.name = sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
        double h1 = sandwich.getPrice();
        double h2 = salad.getPrice();
    }
}
