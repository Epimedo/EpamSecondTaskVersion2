package by.epam.halavin.task02.entity;

import java.io.Serializable;

public class Appliance implements Serializable {
    private static final long serialVersionUID = -8502132299109567375L;
    private double price;
    private String producer = "";

    public Appliance() {
        super();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Appliance [PRICE=" + price + ", PRODUCER=" + producer + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 41;
        int result = 0;
        result = (int) (Double.doubleToLongBits(price) ^ (Double.doubleToLongBits(price) >>> 32));
        result += producer.hashCode();

        return result * prime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Appliance other = (Appliance) obj;
        boolean bool = false;

        if (price == other.price && producer.equals(other.producer)) {
            bool = true;
        }

        return bool;
    }

}
