package by.epam.halavin.task02.entity;

public class Speakers extends HouseholdAppliance {
    private static final long serialVersionUID = 7688181477271999972L;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers() {
        super();
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + cordLength;
        result = prime * result + ((frequencyRange == null) ? 0 : frequencyRange.hashCode());
        result = prime * result + numberOfSpeakers;
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

        Speakers other = (Speakers) obj;
        boolean bool = false;

        if (numberOfSpeakers == other.numberOfSpeakers && frequencyRange.equals(other.frequencyRange)) {
            bool = true;
        }
        return bool;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeakers [NUMBER_OF_SPEAKERS=" + numberOfSpeakers + ", FREQUANCY_RANGE="
                + frequencyRange + ", CORD_LENGTH=" + cordLength + "]";
    }

}
