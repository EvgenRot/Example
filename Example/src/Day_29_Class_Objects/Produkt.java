package Day_29_Class_Objects;

public class Produkt {
    String  name;
    double price;
    double amount;

    public Produkt() {

    }
    public Produkt(String name, double price, double amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public double summaProdukt() {
        double sum = amount * price;
        return sum;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
