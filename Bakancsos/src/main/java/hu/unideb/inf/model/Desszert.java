package hu.unideb.inf.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Desszert
{
    private String name;
    private List<String> list = new ArrayList<>();
    private int price;

    public static Desszert scannedDesszert(DesszertDataReader desszert){
        String name;
        int price;
        name = desszert.getName();
        price = desszert.getPrice();
        return new Desszert (name, price);
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
        final Desszert other = (Desszert) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }
    public Desszert(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Desszert()
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