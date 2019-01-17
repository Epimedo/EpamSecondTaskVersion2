package by.epam.halavin.task02.entity;

public class DigitalAppliance extends Appliance {
    private static final long serialVersionUID = -7049236664632267675L;
    private double displayInchs;
    private double bataryCapacity;
    private int memoryRom;

    public DigitalAppliance() {
        super();
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getBataryCapacity() {
        return bataryCapacity;
    }

    public void setBataryCapacity(double batteryCapacity) {
        this.bataryCapacity = batteryCapacity;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDigitalAppliance [DISPLAY_INCHS=" + displayInchs + ",BATARY_CAPACITY="
                + bataryCapacity + ",MEMORY_ROM=" + memoryRom + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(bataryCapacity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(displayInchs);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + memoryRom;
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

        DigitalAppliance other = (DigitalAppliance) obj;
        boolean bool = false;

        if (displayInchs == other.displayInchs && bataryCapacity == other.bataryCapacity
                && memoryRom == other.memoryRom) {
            bool = true;
        }

        return bool;
    }

}
