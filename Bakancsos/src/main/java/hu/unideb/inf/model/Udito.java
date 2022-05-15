package hu.unideb.inf.model;
import java.util.Objects;

public class Udito
{
    private String name;
    private int price;

    public static Udito scannedUdito(UditoDataReader udito){
        String name;
        int price;
        name = udito.getName();
        price = udito.getPrice();
        return new Udito(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Udito other = (Udito) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }

    public Udito(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" + "name=" + name + ", price=" + price + '}';
    }
}
