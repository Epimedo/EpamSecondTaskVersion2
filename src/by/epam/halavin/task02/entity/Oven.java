package by.epam.halavin.task02.entity;

public class Oven extends HouseholdAppliance {
    private static final long serialVersionUID = 349082355646177254L;
    private double weight;
    private int capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {
        super();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + capacity;
        long temp;
        temp = Double.doubleToLongBits(depth);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj.getClass() == this.getClass())) {
            return false;
        }

        Oven other = (Oven) obj;
        boolean bool = false;

        if (capacity == other.capacity && depth == other.depth && height == other.height && weight == other.weight
                && width == other.width) {
            bool = true;
        }

        return bool;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOven [WEIGHT=" + weight + ", CAPACITY=" + capacity + ", DEPTH=" + depth
                + ", HEIGHT=" + height + ", WIDTH=" + width + "]";
    }

}
