package by.epam.halavin.task02.entity;

public class VacuumCleaner extends HouseholdAppliance {
    private static final long serialVersionUID = 1480177340605220524L;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motoSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner() {
        super();
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotoSpeedRegulation() {
        return motoSpeedRegulation;
    }

    public void setMotoSpeedRegulation(int motoSpeedRegulation) {
        this.motoSpeedRegulation = motoSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
        result = prime * result + cleaningWidth;
        result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
        result = prime * result + motoSpeedRegulation;
        result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
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

        VacuumCleaner other = (VacuumCleaner) obj;
        boolean bool = false;

        if (bagType.equals(other.bagType) && cleaningWidth == other.cleaningWidth && filterType.equals(other.filterType)
                && motoSpeedRegulation == other.motoSpeedRegulation && wandType.equals(other.wandType)) {
            bool = true;
        }

        return bool;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVacuumCleaner [FILTER_TYPE=" + filterType + ", BAG_TYPE=" + bagType
                + ", WAND_TYPE=" + wandType + ", MOTO_SPEED_REGULATION=" + motoSpeedRegulation + ", CLEANING_WIDTH="
                + cleaningWidth + "]";
    }

}
