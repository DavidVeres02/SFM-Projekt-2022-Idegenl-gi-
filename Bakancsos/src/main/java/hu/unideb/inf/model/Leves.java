package hu.unideb.inf.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Leves
{
    private String name;
    private int price;

    public static Leves scannedLeves(LevesDataReader leves){
        String name;
        int price;
        name = leves.getName();
        price = leves.getPrice();
        return new Leves(name, price);
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
        final Leves other = (Leves) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }
    public Leves(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Leves()
    {

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
        return "Food{" + "name=" + name + ", price=" + price + '}';
    }
}
