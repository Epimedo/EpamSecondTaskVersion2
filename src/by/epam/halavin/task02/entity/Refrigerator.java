package by.epam.halavin.task02.entity;

public class Refrigerator extends HouseholdAppliance {
    private static final long serialVersionUID = -3438199383191478041L;
    private int freezerCapacity;
    private double overallCapacity;
    private double weight;
    private double height;
    private double width;

    public Refrigerator() {
        super();
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
        result = prime * result + freezerCapacity;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(overallCapacity);
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

        Refrigerator other = (Refrigerator) obj;
        boolean bool = false;

        if (freezerCapacity == other.freezerCapacity && overallCapacity == other.overallCapacity
                && weight == other.weight && width == other.width && height == other.height) {
            bool = true;
        }

        return bool;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRefrigerator [FREEZER_CAPACITY=" + freezerCapacity + ", OVERALL_CAPACITY="
                + overallCapacity + ", WEIGHT=" + weight + ", HEIGHT=" + height + ", WIDTH=" + width + "]";
    }

}
