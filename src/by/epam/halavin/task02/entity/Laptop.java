package by.epam.halavin.task02.entity;

public class Laptop extends DigitalAppliance {
    private static final long serialVersionUID = -3534097200521858513L;
    private String os = "";
    private double systemMemory;
    private double cpu;

    public Laptop() {
        super();
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(cpu);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        temp = Double.doubleToLongBits(systemMemory);
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

        Laptop other = (Laptop) obj;
        boolean bool = false;

        if (os.equals(other.os) && systemMemory == other.systemMemory && cpu == other.cpu) {
            bool = true;
        }

        return bool;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLaptop [OS=" + os + ", SYSTEM_MEMORY=" + systemMemory + ", CPU=" + cpu + "]";
    }

}
