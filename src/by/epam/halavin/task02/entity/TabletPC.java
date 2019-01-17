package by.epam.halavin.task02.entity;

public class TabletPC extends DigitalAppliance {
    private static final long serialVersionUID = -4623591083877459821L;
    private int flashMemoryCapacity;
    private String color = "";

    public TabletPC() {
        super();
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + flashMemoryCapacity;
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

        TabletPC other = (TabletPC) obj;
        boolean bool = false;

        if (flashMemoryCapacity == other.flashMemoryCapacity && color.equals(other.color)) {
            bool = true;
        }

        return bool;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTabletPC [FLASH_MEMORY_CAPACITY=" + flashMemoryCapacity + ", COLOR=" + color + "]";
    }

}
