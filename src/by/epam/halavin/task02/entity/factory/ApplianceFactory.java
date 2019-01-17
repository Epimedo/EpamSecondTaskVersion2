package by.epam.halavin.task02.entity.factory;

import by.epam.halavin.task02.entity.Appliance;

public abstract class ApplianceFactory {

	public Appliance getAppliance() {
		return createAppliance();
	}

	abstract public Appliance createAppliance();
}
